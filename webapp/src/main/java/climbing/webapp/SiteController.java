package climbing.webapp;

import climbing.consumer.SiteRepository;
import climbing.consumer.TopoRepository;
import climbing.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Controller
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;
    @Autowired
    private TopoRepository topoRepository;

    @GetMapping(path = "/addSite")
    public String addNewSite(Model model) {
        model.addAttribute("site", new Site());
        model.addAttribute("topos", topoRepository.findAll());
        return "addSite";
    }

    @PostMapping(path = "sitesList")
    public String postSites(Model model, @ModelAttribute Site site) {
        /*System.out.println("1----------------------------->" + site.getId());
        System.out.println("1----------------------------->" + site.getName());
        System.out.println("1----------------------------->" + site.getDescription());
        System.out.println("1----------------------------->" + site.getAdresse());
        System.out.println("1----------------------------->" + site.getAltitude());
        System.out.println("1----------------------------->" + site.getTopo());
        System.out.println("1----------------------------->" + site.getLevel());
        System.out.println("1----------------------------->" + site.getDate());*/
        site.setDate(getDate());
        siteRepository.save(site);
        model.addAttribute("sites", siteRepository.findAll());
        return "sitesList";
    }

    @GetMapping(path = "sitesList")
    public String getSites(Model model) {
        model.addAttribute("sites", siteRepository.findAll());
        getDate();
        return "sitesList";
    }

    @GetMapping(path = "site/{id}")
    public String getSiteById(@PathVariable Long id, Model model) {
        Optional<Site> site = siteRepository.findById(id);
        if (site.isPresent()) {
            model.addAttribute("site", site);
            model.addAttribute("formatedDate", formatDate(site.get().getDate()));
            return "site";
        } else {
            return null;
        }
    }


    /*@PostMapping(path = "sitesList")
    public String postSites(Model model, @RequestParam String nom, @RequestParam String description) {
        if (!nom.isEmpty()) {
            Site s = new Site();
            s.setName(nom);
            s.setDescription(description);
            siteRepository.save(s);
        }
        model.addAttribute("site", siteRepository.findAll());
        return "sitesList";
    }*/

    private String getDate(){
        return DateTimeFormatter.ofPattern("ddMMyyyy").format(LocalDate.now());
    }
    private String formatDate(String dateBrut){
        String day = dateBrut.substring(0,2);
        String month = dateBrut.substring(2,4);
        String year = dateBrut.substring(4);
        return (day + "/" + month + "/" + year);
    }
}
