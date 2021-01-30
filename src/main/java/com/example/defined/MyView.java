package com.example.defined;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

public class MyView implements org.springframework.web.servlet.View {
    public String getContentType() {
        return "text/html";
    }

    public void render(Map<String, ?> model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("model:"+model);
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write("<h1>this is page</h1>");
        writer.write("123456");
    }
}
