package com.souche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by liuqizhe on 15/9/21.
 */
@Controller
@RequestMapping("/login")
@SessionAttributes("name")
public class LoginController{
    //该方法对应/login/tologin.from
    @RequestMapping("/toLogin")
    public String toLogin() {
        System.out.println("run toLogin");
        return "login" ;
    }

    @RequestMapping("login3")
    public String checkLogin3(@Valid User user,BindingResult errors, ModelMap model) {
        model.put("user", user) ;//将user对象放入模型
        if(errors.hasErrors()) {
            //有错误，表明用户表单输入有误，返回login
            System.out.println("input error!!");
            return "login" ;
        }

        //检查用户名和密码，假设用户名scott，密码123456
        System.out.println("run checkLogin3");
        System.out.println(user.getUsername());
        //模拟一个异常NullException
//        String s = null ;
//        System.out.println(s.length());

        if("scott".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            model.addAttribute("user", user.getUsername()) ;
            return "ok" ;
        } else {
            return "login" ;
        }
    }

    @ModelAttribute("name")
    public User getUser() {//早于SessionAttribute
        return new User() ;
    }

//    @ExceptionHandler
//    public String myException(HttpServletRequest res, Exception ex) {
//        //当LoginController有异常，记录异常信息，并且转到error.jsp
//        System.out.println("record exception message" + ex);
//        return "error" ;
//    }

}
