package com.example.projektmadspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MadspildsController {
    @GetMapping("/")
    public String index(){
        return "index";
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
    @PostMapping("/contactcon")
    public String processInfo(@RequestParam("email") String email,
                              RedirectAttributes redirectattributes) {
        redirectattributes.addAttribute("redirectText", email);
        return "redirect:/kontakt";
    }

    @GetMapping("/kontakt")
    public String showInfo(@RequestParam ("redirectText") String email, Model model) {

        model.addAttribute("email", email);

        return "kontakt";
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
