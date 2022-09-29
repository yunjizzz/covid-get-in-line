package com.yunji.covidgetinline.controller;

import com.yunji.covidgetinline.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 27.
 */
@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public ModelAndView adminPlaces(PlaceType placeType,
                                    String placeName,
                                    String address
    ){
        Map<String,Object> map = new HashMap<>();
        map.put("placeType",placeType);
        map.put("placeName",placeName);
        map.put("address",address);

        //RequestParam을 명시하지 않으면 required=false로 기본으로 인식된다.
        return new ModelAndView("admin/places",map);
    }

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId){
        return "admin/place-detail";
    }

    @GetMapping("/events")
    public String adminEvents(){
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId){
        return "admin/event-detail";
    }
}
