package pl.javastart.lekcja29zadanie.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.lekcja29zadanie.user.User;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String registrationPage() {
        return "admin";
    }
}
