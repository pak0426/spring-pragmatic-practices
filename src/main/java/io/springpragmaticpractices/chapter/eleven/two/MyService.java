package io.springpragmaticpractices.chapter.eleven.two;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MyService {

    public void doSomething1() {
        doSomething2();
    }

    @Transactional
    public void doSomething2() {

    }
}
