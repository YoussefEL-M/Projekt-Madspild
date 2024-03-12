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
    @PostMapping("/redirect/tips")
    public String redirectTips(RedirectAttributes attributes){
        attributes.addAttribute("redirectUrl", "/tipsogtricks");
        return "redirect:/tipsogtricks";
    }

    @PostMapping("/redirect/institution")
    public String redirectInstitution(RedirectAttributes attributes){
        attributes.addAttribute("redirectUrl", "/institution");
        return "redirect:/institution";
    }

    @PostMapping("/redirect/organisation")
    public String redirectOrganisation(RedirectAttributes attributes){
        attributes.addAttribute("redirectUrl", "/organisation");
        return "redirect:/organisation";
    }

    @GetMapping("/tipsogtricks")
    public String tipsSide() {
        return "tipsOgTricks";
    }

    @GetMapping("/institution")
    public String institutionsSide(){
        return "institution";
    }

    @GetMapping("/forbruger")
    public String forbruger(){
        return "forbruger";
    }

    @GetMapping("/organisation")
    public String organisation(){
        return "organisation";
    }

    @GetMapping("/virksomhed")
    public String forVirksomheder() {

        return "virksomhed";
    }

}
