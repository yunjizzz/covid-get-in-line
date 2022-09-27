package com.yunji.covidgetinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 27.
 */
@Controller
public class AuthController {


    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }

    @GetMapping("sign-up")
    public String signUp(){
        return "auth/sign-up";
    }
}
