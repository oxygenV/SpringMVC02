package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  return "forward:/index.jsp"; 请求转发，此路径不经过视图解析器
 *  请求地址不会发生改变
 *
 */
@Controller
public class ForwardController {

    //转发路径
    @RequestMapping(value = "/forward")
    public String forward(){
        System.out.println("forward");
        return "forward:/index.jsp";
    }
    //转发请求
    @RequestMapping(value = "/forward2")
    public String forward2(){
        System.out.println("forward222");
        return "forward:/forward";
    }

}
