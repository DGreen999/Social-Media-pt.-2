package com.tts.techtalenttwitter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
