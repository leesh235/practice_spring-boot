package com.ecommerce.server.dto;

import lombok.*;
import java.util.Date;

public class AuthDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class signUpRequestDto{
        private String email;
        private String name;
        private String password;
        private Date birthday;
        private String phone;
        private boolean emailVerify;
        private boolean phoneVerify;
        private boolean emailCheck;
        private boolean phoneCheck;
        private String status;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class signUpResponseDto{
        private String email;
        private String name;
        private String birthday;
        private String phone;
        private boolean emailCheck;
        private boolean phoneCheck;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class logInRequestDto{
        private String email;
        private String password;
    }

    @Getter
    @Builder
    public static class logInResponseDto{
        private Long userId;
        private String email;
        private String name;
        private String password;
        private String authority;
    }

    @Getter
    @Builder
    public static class userAuthority{
        private String authority;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class tokenDto{
        private String grantType;
        private String accessToken;
        private String refreshToken;
        private long accessTokenExpiresIn;
    }

}
