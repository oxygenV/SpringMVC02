package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 自定义类型转换器，前台传入一个字符串，后台怎样转换为对象user
 */
@Controller
public class DefinedConverterController {

    @RequestMapping("/converter")
    public String testconverter(User user, Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "success";
    }
}
