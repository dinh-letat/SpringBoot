package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.WelcomeMessage;

@RestController
@RequestMapping("/")
public class WelcomeController {
	
	@GetMapping
	public String welcome(){
        return "welcome";
    }
}