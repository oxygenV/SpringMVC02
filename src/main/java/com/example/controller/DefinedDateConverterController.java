package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 如果使用默认的日期转换，页面输入的日期格式应使用/分割
 *
 * 可以在实体类属性上使用@DateTimeFormat(pattern = "yyyy-MM-dd")来规定格式，
 *  如果配置了自定义类型转换器，该注解会失效，需要添加FormattingConversionServiceFactoryBean
 */
@Controller
public class DefinedDateConverterController {

    @RequestMapping("/date")
    public String getDate(User user){
        System.out.println(user);
        return "success";
    }
}
