package io.springpragmaticpractices.chapter.eight.two;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<AccountResponse>> findAll() {
        List<Account> accounts = accountService.findAll();
        return new ResponseEntity<>(
                AccountResponse.from(accounts), HttpStatus.OK
        );
    }
}
