package io.springpragmaticpractices.chapter.eleven;

import io.springpragmaticpractices.chapter.ten.three.classify.Account;

public interface NotificationChannel {

    void notify(Account account, String message);
}
