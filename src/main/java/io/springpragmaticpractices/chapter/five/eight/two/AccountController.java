package io.springpragmaticpractices.chapter.five.eight.two;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public ResponseEntity<AccountResponse> getById(@PathVariable Long id) {
        // ...
    }

    @PostMapping
    public ResponseEntity<AccountResponse> create(@RequestBody AccountRequest accountRequest) {
        // ...
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // ...
    }

}
