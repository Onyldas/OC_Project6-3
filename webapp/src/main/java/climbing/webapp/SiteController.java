package climbing.webapp;

import climbing.consumer.*;
import climbing.model.Route;
import climbing.model.Sector;
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
    @Autowired
    private RouteRepository routeRepository;
    @Autowired
    private RatingRepository ratingRepository;
    @Autowired
    private SectorRepository sectorRepository;

    @GetMapping(path = "/addSite")
    public String addNewSite(Model model) {
        model.addAttribute("site", new Site());
        model.addAttribute("topos", topoRepository.findAll());
        return "addSite";
    }

    @PostMapping(path = "sitesList")
    public String postSites(Model model, @ModelAttribute Site site) {
        site.setDate(getTodaysDate());
        siteRepository.save(site);
        model.addAttribute("sites", siteRepository.findAll());
        return "sitesList";
    }

    @GetMapping(path = "sitesList")
    public String getSites(Model model) {
        model.addAttribute("sites", siteRepository.findAll());
        getTodaysDate();
        return "sitesList";
    }

    /**
     * Here we take to parameters :
     * @param id
     * The id will help us find the site we want
     * With it, we can use the CRUD method findById()
     * @param model
     * In the model we put the site
     * But also a new Route
     * Or a new Sector
     * Then we'll have to display the routes/sectors if they exist
     * @return the site page
     */
    @GetMapping(path = "site/{id}")
    public String getSiteById(@PathVariable Long id, Model model) {
        Optional<Site> site = siteRepository.findById(id);
        if (site.isPresent()) {
            siteModel(model, site);
            return "site";
        } else {
            return "error-500";
        }
    }

    public void siteModel(Model model, Optional<Site> site){
        model.addAttribute("site", site);
        model.addAttribute("formatedDate", formatDate(site.get().getDate()));
        model.addAttribute("sectors", sectorRepository.findAll());
        model.addAttribute("newSector", new Sector());
        model.addAttribute("routes", routeRepository.findAll());
        model.addAttribute("newRoute", new Route());
        model.addAttribute("ratings", ratingRepository.findAll());
    }

    @PostMapping(path = "site/{id}")
    public String postSiteById(@PathVariable Long id, Model model, @ModelAttribute Route route){
        Optional<Site> site = siteRepository.findById(id);
        routeRepository.save(route);
        if (site.isPresent()) {
            siteModel(model, site);
            return "site";
        } else {
            return null;
        }
    }

    @PostMapping(path = "site/{id}_2")
    public String postSectorSiteById(@PathVariable Long id, Model model, @ModelAttribute Sector sector){
        Optional<Site> site = siteRepository.findById(id);
        sector.setId(id);
        sectorRepository.save(sector);
        if (site.isPresent()) {
            siteModel(model, site);
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

    private String getTodaysDate(){
        return DateTimeFormatter.ofPattern("ddMMyyyy").format(LocalDate.now());
    }
    private String formatDate(String dateBrut){
        String day = dateBrut.substring(0,2);
        String month = dateBrut.substring(2,4);
        String year = dateBrut.substring(4);
        return (day + "/" + month + "/" + year);
    }
}
