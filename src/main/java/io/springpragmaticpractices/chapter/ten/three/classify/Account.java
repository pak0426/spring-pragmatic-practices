package io.springpragmaticpractices.chapter.ten.three.classify;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {

    private Long id;
    private String email;
    private String nickname;

    public void changeNickname(String newNickname) {
        this.nickname = newNickname;
    }
}
