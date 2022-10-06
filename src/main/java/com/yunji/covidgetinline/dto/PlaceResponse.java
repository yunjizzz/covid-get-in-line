package com.yunji.covidgetinline.dto;

import com.yunji.covidgetinline.constant.PlaceType;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 10. 4.
 */
public record PlaceResponse(
        PlaceType placeType,
        String placeName,
        String address,
        String phoneNumber,
        Integer capacity,
        String memo
) {
    public static PlaceResponse of(
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo
    ) {
        return new PlaceResponse(placeType, placeName, address, phoneNumber, capacity, memo);
    }
}