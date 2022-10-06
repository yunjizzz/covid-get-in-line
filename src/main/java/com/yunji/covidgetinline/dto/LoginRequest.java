package com.yunji.covidgetinline.dto;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 10. 4.
 */

public record LoginRequest(
        String email,
        String password
) {
    public static LoginRequest of(
            String email,
            String password
    ) {
        return new LoginRequest(email, password);
    }
}