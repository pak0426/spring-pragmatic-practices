package io.springpragmaticpractices.chapter.eight.three;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public Account createAccount(Account account) {
        AccountJpaEntity entity = AccountJpaEntity.from(account);

        AccountJpaEntity savedEntity = accountRepository.save(entity);

        return savedEntity.toModel();
    }

    @Transactional(readOnly = true)
    public Account getAccount(Long id) {
        return accountRepository.findById(id)
                .map(AccountJpaEntity::toModel)
                .orElseThrow(() -> new RuntimeException("계정을 찾을 수 없습니다."));
    }
}

