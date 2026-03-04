package io.springpragmaticpractices.chapter.eight.three;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class Account {

    private final long id;
    private final String email;
    private final String nickname;

    public Account withNickname(String nickname) {
        return Account.builder()
                .id(id)
                .email(email)
                .nickname(nickname)
                .build();
    }
}
