package com.yunji.covidgetinline.dto;

import com.yunji.covidgetinline.constant.PlaceType;

import java.time.LocalDateTime;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 29.
 */

public record PlaceDTO(
        PlaceType placeType,
        String placeName,
        String address,
        String phoneNumber,
        Integer capacity,
        String memo,
        LocalDateTime createdAt,
        LocalDateTime modifiedAt
) {
    public static PlaceDTO of(
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo,
            LocalDateTime createdAt,
            LocalDateTime modifiedAt
    ) {
        return new PlaceDTO(placeType, placeName, address, phoneNumber, capacity, memo, createdAt, modifiedAt);
    }
}