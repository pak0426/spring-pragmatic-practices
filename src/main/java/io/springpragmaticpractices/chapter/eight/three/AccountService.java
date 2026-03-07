package io.springpragmaticpractices.chapter.eight.three;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account updateNicenameById(long id, String nicename) {
        Account account = accountRepository.findById(id);
        account = account.withNickname(nicename);
        accountRepository.save(account);
    }
}

