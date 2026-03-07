package io.springpragmaticpractices.chapter.eleven.one;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final EmailNotificationChannel emailChannel;
    private final SlackNotificationChannel slackChannel;
    private final ChatNotificationChannel chatChannel;

    public void notify(Account account, String message) {
        switch (account.getNotificationType()) {
            case EMAIL -> emailChannel.send(account, message);
            case SLACK -> slackChannel.send(account, message);
            case CHAT  -> chatChannel.send(account, message);
            default    -> throw new IllegalArgumentException("지원하지 않는 알림 타입");
        }
    }
}
