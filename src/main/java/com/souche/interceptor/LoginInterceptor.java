package com.souche.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuqizhe on 15/9/21.
 */
public class LoginInterceptor implements HandlerInterceptor {
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        //检查是否有登入Controller放进去的"name"
        Object user = req.getSession().getAttribute("name") ;
        if(user != null) {
            //有登入信息，允许继续访问执行
            return true ;
        } else {
            //没有信息，不允许继续访问
            res.sendRedirect("/test2/login/toLogin.from");
            return false ;
        }
    }
}
