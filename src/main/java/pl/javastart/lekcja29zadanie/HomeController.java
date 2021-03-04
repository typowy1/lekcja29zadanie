package pl.javastart.lekcja29zadanie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.lekcja29zadanie.user.User;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homepage() {
        return "home";
    }
}
