package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ModelAttribute 带有此注解的方法会优先执行
 * @ModelAttribute("user")  携带参数到另一个方法
 *
 *
 *
 */
@Controller
public class ModelAttributeController {

    @RequestMapping("/update")
    public String update(@ModelAttribute("user") User user){
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void testModelAttribute(Model model){
        User user =new User();
        user.setId(1);
        user.setName("李四");
        user.setPassword("123456");
        user.setAge(14);
        model.addAttribute("user",user);
    }
}
