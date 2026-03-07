package io.springpragmaticpractices.chapter.eleven.two;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Object doSomething() {
        myService.doSomething1();
        return null;
    }
}
