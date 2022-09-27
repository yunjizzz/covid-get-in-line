package com.yunji.covidgetinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 27.
 */
@RestController("/api")
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp(){
        return "done";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
