package com.diti5.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AcceuilController {

    @RequestMapping({"", "/"})
    public String accuil(){
        return "/admin/acceuil";
    }
}
