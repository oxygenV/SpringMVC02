package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 静态资源处理、看xml文件
 */
@Controller
public class StaticController {

    @RequestMapping(value = "/static")
    public String getImg(){
        return "forward:/index.jsp";
    }

}
