package com.example.webnoticeboard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")
    public String NoticeBoardHome(){
        return "home";
    }

}
