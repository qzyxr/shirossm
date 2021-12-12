package com.zking.controller;

import com.zking.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.activation.UnknownObjectException;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(User user){
        String msg="";
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(
               user.getUsername(),user.getPassword()
        );
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            e.printStackTrace();
        }


        return null;
    }
}
