package me.moosecanswim.nifb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class MainController {
    @RequestMapping("/welcome")
    public String newWelcome(){
        return "newWelcome";
    }

    @GetMapping("/")
    public String fizzBuzzWelcome(Model model){
        model.addAttribute("datInput", new UserInput());

        return "fbwelcome";


    }
    @PostMapping("/")
    public String confirmnif(@Valid @ModelAttribute("datInput") UserInput datInput, BindingResult result, Model sendModel){
        ArrayList<String> toSend = new ArrayList<String>();
        toSend = datInput.fizzBuzzActual(datInput.getNumber());
        sendModel.addAttribute("datArrayList", toSend);
        if(result.hasErrors()){
            return "fbwelcome";
        }
        return "fizzbuzz";
    }



}
