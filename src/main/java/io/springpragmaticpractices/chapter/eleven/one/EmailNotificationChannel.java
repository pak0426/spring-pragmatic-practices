package io.springpragmaticpractices.chapter.eleven.one;

import io.springpragmaticpractices.chapter.ten.three.classify.Account;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationChannel implements NotificationChannel {

    @Override
    public boolean supports(NotificationType type) {
        return type == NotificationType.EMAIL;
    }

    @Override
    public void notify(Account account, String message) {
        // account에 등록된 email로 내용이 message인 메일을 전송
    }
}
