package climbing.webapp;

import climbing.consumer.UserRepository;
import climbing.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name){
        Users n = new Users();
        n.setPseudo(name);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="user/all")
    public String getUsers(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

    @GetMapping(path="user/{id}")
    public @ResponseBody Users getUserById(@PathVariable Long id){
        Optional<Users> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        else{
            return null;
        }
    }

}
