package io.springpragmaticpractices.chapter.fifteen.one;

import lombok.Builder;

@Builder
public class LoginSuccess {

    public final String auditMessage;
    // 다른 값이 있는 경우 추가로 작성
}
