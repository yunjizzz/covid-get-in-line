package com.yunji.covidgetinline.dto;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 10. 4.
 */
public record AdminRequest(
        String email,
        String nickname,
        String password,
        String phoneNumber,
        String memo
) {
    public static AdminRequest of(
            String email,
            String nickname,
            String password,
            String phoneNumber,
            String memo
    ) {
        return new AdminRequest(email, nickname, password, phoneNumber, memo);
    }
}
