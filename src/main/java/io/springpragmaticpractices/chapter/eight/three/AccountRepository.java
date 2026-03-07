package io.springpragmaticpractices.chapter.eight.three;

public interface AccountRepository {
    Account findById(long id);

    void save(Account account);
}
