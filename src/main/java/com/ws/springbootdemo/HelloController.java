package com.ws.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Author: WS
 * @Date: 2018/7/16 17:45
 * @Description:
 */
@Controller
public class HelloController{

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now",DateFormat.getDateInstance().format(new Date()));
        return "hello";
    }
}
