package pl.javastart.lekcja29zadanie.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registrationPage(Model model) {
        model.addAttribute("user", new User());
        return "/registration";
    }

    @PostMapping("/registration")
    public String register(User user, Model model, @RequestParam(required = false) String error) {
        String username = user.getUsername();
        String password = user.getPassword();
        userService.registerUser(username, password);

        boolean showSuccesMessage = false;
        if (error == null) {
            showSuccesMessage = true;
        }
        model.addAttribute("showSuccesMessage", showSuccesMessage);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginForm(@RequestParam(required = false) String error, Model model) {
        boolean showErrorMessage = false;

        if (error != null) {
            showErrorMessage = true;
        }
        model.addAttribute("showErrorMessage", showErrorMessage);
        return "login";
    }

    @GetMapping("/user")
    public String homepage() {
        return "user";
    }

}
