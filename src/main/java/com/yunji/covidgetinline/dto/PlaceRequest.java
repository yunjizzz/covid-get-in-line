package com.yunji.covidgetinline.dto;

import com.yunji.covidgetinline.constant.PlaceType;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 10. 4.
 */

public record PlaceRequest(
        PlaceType placeType,
        String placeName,
        String address,
        String phoneNumber,
        Integer capacity,
        String memo
) {
    public static PlaceRequest of(
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo
    ) {
        return new PlaceRequest(placeType, placeName, address, phoneNumber, capacity, memo);
    }
}