package io.springpragmaticpractices.chapter.forteen.five;

import io.springpragmaticpractices.chapter.forteen.User;

import java.util.Optional;

public class SpyUserRepository extends UserRepositoryImpl {

    public int findByEmailCallCount = 0;
    public int saveCallCount = 0;

    @Override
    public Optional<User> findByEmail(String email) {
        this.findByEmailCallCount++;
        return super.findByEmail(email);
    }

    @Override
    public User save(User user) {
        this.saveCallCount++;
        return super.save(user);
    }
}
