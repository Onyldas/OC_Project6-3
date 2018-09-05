package climbing.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    public String pseudo = "Charlie";
    @GetMapping("/")
    public String DisplayIndex(){
        return "index";
    }




    @GetMapping("/sitesList")
    public String welcome(Model model) {
        model.addAttribute("pseudo", pseudo);
        return "sitesList";
    }

    @GetMapping("/connexion")
    public String DisplayConnexion(){
        return "connexion";
    }

    @GetMapping("/inscription")
    public String DisplayInscription(){
        return "inscription";
    }

}
