package com.example.projektmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MadspildsController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/redirect")
    public String redirect(RedirectAttributes attributes){

        attributes.addAttribute("redirectUrl", "/tipsogtricks");
        return "redirect:/tips";
    }
    @GetMapping("/redirecting")
    public String redirectToTipsogtricks() {
        return "redirect:/tipsogtricks";
    }

    @GetMapping("/tipsogtricks")
    public String tipsSide() {
        return "tipsOgTricks";
    }


}
