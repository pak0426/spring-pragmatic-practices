package io.springpragmaticpractices.chapter.eleven.one;

import io.springpragmaticpractices.chapter.ten.three.classify.Account;

public interface NotificationChannel {

    boolean supports(NotificationType type);
    void notify(Account account, String message);
}
