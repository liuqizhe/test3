package com.souche.Controller;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuqizhe on 15/9/22.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        System.out.println(o);
        Map<String, Object> data = new HashMap<String, Object>() ;
        data.put("e", e) ;
        if (e instanceof IOException) {
            return new ModelAndView("error1", data) ;
        } else if (e instanceof NullPointerException) {
            return new ModelAndView("error2", data) ;
        } else {
            return new ModelAndView("error", data) ;
        }


    }
}
