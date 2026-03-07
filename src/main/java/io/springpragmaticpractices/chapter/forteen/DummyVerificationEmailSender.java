package io.springpragmaticpractices.chapter.forteen;

import org.springframework.stereotype.Component;

@Component
public class DummyVerificationEmailSender implements VerificationEmailSender {

    @Override
    public void send(User user) {

    }
}
