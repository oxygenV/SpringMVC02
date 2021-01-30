package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SuppressWarnings("all")
@Controller
public class RedirectController {

    //转发地址
    @RequestMapping(value = "redirect")
    public String redirect(){
        System.out.println("redirect");
        return "redirect:/index.jsp";
    }
    //转发请求
    @RequestMapping(value = "redirect2")
    public String redirect2(){
        System.out.println("redirect");
        return "redirect:/redirect";
    }

}
