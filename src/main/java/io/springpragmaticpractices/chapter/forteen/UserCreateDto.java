package io.springpragmaticpractices.chapter.forteen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDto {
    private String email;
    private String nickname;
    private UserStatus status;
    private String verificationCode;
}


