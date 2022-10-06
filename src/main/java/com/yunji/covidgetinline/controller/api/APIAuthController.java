package com.yunji.covidgetinline.controller.api;

import com.yunji.covidgetinline.dto.APIDataResponse;
import com.yunji.covidgetinline.dto.AdminRequest;
import com.yunji.covidgetinline.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 27.
 */

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @PostMapping("/sign-up")
    public APIDataResponse<String> signUp(@RequestBody AdminRequest adminRequest) {
        return APIDataResponse.empty();
    }

    @PostMapping("/login")
    public APIDataResponse<String> login(@RequestBody LoginRequest loginRequest) {
        return APIDataResponse.empty();
    }

}
