package com.yunji.covidgetinline.controller.api;

import com.yunji.covidgetinline.constant.PlaceType;
import com.yunji.covidgetinline.dto.APIDataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 27.
 */

@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public void getPlaces() {

    }

}