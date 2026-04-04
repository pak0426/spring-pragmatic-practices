package io.springpragmaticpractices.chapter.forteen;

public class VerificationEmailSenderTimeout implements VerificationEmailSender {

    @Override
    public void send(User user) {
        throw new ConnectTimeoutException();
    }
}
