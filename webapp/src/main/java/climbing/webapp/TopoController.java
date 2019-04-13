package climbing.webapp;

import climbing.consumer.SiteRepository;
import climbing.consumer.TopoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopoController {

    @Autowired
    private TopoRepository topoRepository;
    @Autowired
    private SiteRepository siteRepository;

    @GetMapping(path ="/toposList")
    public String getTopos (Model model){
        model.addAttribute("topos", topoRepository.findAll());
        return "toposList";
    }
}
