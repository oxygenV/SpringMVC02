package com.example.defined;


import com.example.entity.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//@Component
public class MyConverter implements Converter<String, User> {

    @Override
    public User convert(String source) {
        User user = new User();
        if(source!=null && !"".equals(source) && source.split("-").length==4){
            user.setId(Integer.parseInt(source.split("-")[0]));
            user.setName(source.split("-")[1]);
            user.setPassword(source.split("-")[2]);
            user.setAge(Integer.parseInt(source.split("-")[3]));
        }
        return user;
    }


}
