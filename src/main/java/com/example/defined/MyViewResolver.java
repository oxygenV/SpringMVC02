package com.example.defined;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;
@SuppressWarnings("all")
@Component
@Order(1)
public class MyViewResolver implements ViewResolver , Ordered {

    private int order =0;

    public void setOrder(int order) {
        this.order = order;
    }

    public View resolveViewName(String viewname, Locale locale) throws Exception {
        if(viewname.startsWith("acfun:")){
               return new MyView();
        }else{
            return null;
        }
    }

    public int getOrder() {
        return 0;
    }
}
