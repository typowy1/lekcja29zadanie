package pl.javastart.lekcja29zadanie.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.javastart.lekcja29zadanie.user.User;
import pl.javastart.lekcja29zadanie.user.UserService;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {

    public UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String adminPage(Model model) {
        List<User> users = userService.findAllWithoutCurrentUser();
        model.addAttribute("users", users);
        return "admin";
    }
}
