package edu.cetys.financeatfreddysserver.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrincipalController {

    @GetMapping("/")
    public String indexPage() {
        return "/public/index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/reportes")
    public String reportesPage() {
        return "/secure/reportes";
    }

    @PostMapping("/register")
    public String registerPage() {
        return "/public/register";
    }

    @PostMapping("/expense")
    public String expensePage() {
        return "/secure/expense";
    }

}