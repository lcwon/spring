package com.kt.edu.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "Chaelee"); //변수 등록
        return "greetings"; //templates/greetings.mustache -> 브라우저로 이동
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "Chaelee"); //변수 등록
        return "goodbye"; //templates/greetings.mustache -> 브라우저로 이동
    }
}
