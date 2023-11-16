package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping("/")
    public String indexPage() {
        return "/public/index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "/public/login";
    }
}
