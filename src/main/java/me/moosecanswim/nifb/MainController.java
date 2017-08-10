package me.moosecanswim.nifb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("datInput", new UserInput());

        return "welcome";


    }
    @PostMapping("/welcome")
    public String confirmnif(@Valid @ModelAttribute("datInput") UserInput datInput, BindingResult result){

        if(result.hasErrors()){
            return "welcome";
        }

        return "fizzbuzz";
    }



}
