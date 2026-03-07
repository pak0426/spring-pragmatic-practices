package io.springpragmaticpractices.chapter.eight.three;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.security.auth.login.AccountNotFoundException;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;

    @Override
    public Account findById(long id) {
        return accountJpaRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException(id))
                .toModel();
    }

    @Override
    public void save(Account account) {
        accountJpaRepository.save(AccountJpaEntity.from(account));
    }
}
