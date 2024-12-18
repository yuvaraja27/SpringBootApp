package dev.manohar.webappdeployingaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/")
    public String getWelcomeMessage(){
        return "Welcome to the Era of the Yuva Raja Manohar's Kolaa!!!!!!!!!!!";
    }
}
