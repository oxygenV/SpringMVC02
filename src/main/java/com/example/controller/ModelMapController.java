package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 向前台页面回显数据,三种方式
 * Map Model ModelMap
 *
 * 回显的数据位于那个作用域？ request
 *
 * @SessionAttributes(value={value1,value2}) 向session中设置值
 * @SessionAttributes(types = String.class) 代表此controller中，所有String类型都存session
 *
 */
@Controller
@SessionAttributes(types = String.class)
public class ModelMapController {

    @RequestMapping("getmsg1")
    public String getMsg1(Map<String,String> map){
        map.put("msg","welcome to springmvc 1");
        return "success";
    }

    @RequestMapping("getmsg2")
    public String getMsg2(Model model){
        model.addAttribute("msg","welcome to springmvc 2");
        return "success";
    }

    @RequestMapping("getmsg3")
    public String getMsg3(ModelMap modelmap){
        modelmap.addAttribute("msg","welcome to springmvc 3");
        return "success";
    }

    @RequestMapping("getmsg4")
    public ModelAndView getMsg3(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("msg","welcome to springmvc 4");
        return mv;
    }

    @RequestMapping("outSession")
    public String outSession(Model model){
        model.addAttribute("name","zhangsan");
        return "success";
    }



}
