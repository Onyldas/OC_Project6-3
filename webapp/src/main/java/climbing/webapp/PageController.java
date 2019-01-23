package climbing.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PageController {

    @GetMapping("/")
    public String DisplayIndex() {
        return "index";
    }


    @GetMapping("/connexion")
    public String DisplayConnexion() {
        return "connexion";
    }

    @GetMapping("/inscription")
    public String DisplayInscription() {
        return "inscription";
    }

    @ResponseBody
    @GetMapping("/square/{number}")
    public int calculateSquare(@PathVariable int number) {
        return number * number;
    }

}
