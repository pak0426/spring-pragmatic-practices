package io.springpragmaticpractices.chapter.forteen.five;

import io.springpragmaticpractices.chapter.forteen.User;
import io.springpragmaticpractices.chapter.forteen.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class SpyProxyUserRepository implements UserRepository {

    public int findByEmailCallCount = 0;
    public int saveCallCount = 0;
    public final UserRepositoryImpl userRepositoryImpl;

    @Override
    public Optional<User> findByEmail(String email) {
        this.findByEmailCallCount++;
        return userRepositoryImpl.findByEmail(email);
    }

    @Override
    public User save(User user) {
        this.saveCallCount++;
        return userRepositoryImpl.save(user);
    }
}
