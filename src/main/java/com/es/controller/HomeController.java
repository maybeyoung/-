package com.es.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wsj
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("name","测试");
        return "index";
    }
}
