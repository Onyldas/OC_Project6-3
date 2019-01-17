package climbing.webapp;

import climbing.consumer.SiteRepository;
import climbing.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;

    @GetMapping(path = "/addSite")
    public String addNewSite(Model model) {
        model.addAttribute("site", new Site());
        return "addSite";
    }

    @PostMapping(path = "sitesList")
    public String postSites(Model model, @ModelAttribute Site site) {
        siteRepository.save(site);
        model.addAttribute("sites", siteRepository.findAll());
        return "sitesList";
    }

    @GetMapping(path = "sitesList")
    public String getSites(Model model) {
        model.addAttribute("sites", siteRepository.findAll());
        return "sitesList";
    }

    @GetMapping(path = "site/{id}")
    public String getSiteById(@PathVariable Long id, Model model) {
        Optional<Site> site = siteRepository.findById(id);
        if (site.isPresent()) {
            model.addAttribute("site", site);
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
}
