package com.souche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuqizhe on 15/9/21.
 */
@Controller
@RequestMapping("/day04")
public class HelloController {
    @RequestMapping("/hello")
    public String execute() {
        System.out.println("执行");
        return "hello";

    }
}
