package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 自定义视图解析器
 *
 */
@Controller
public class DefinedViewResolverController {

    @RequestMapping(value = "/defined")
    public String method(){
        return "acfun:/index.jsp";
    }

    @RequestMapping(value = "/defined2")
    public String method2(){
        return "acfun2:/index.jsp";
    }
}
