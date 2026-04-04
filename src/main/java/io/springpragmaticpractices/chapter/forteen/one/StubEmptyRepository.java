package io.springpragmaticpractices.chapter.forteen.one;

import io.springpragmaticpractices.chapter.forteen.User;
import io.springpragmaticpractices.chapter.forteen.UserRepository;
import io.springpragmaticpractices.chapter.forteen.UserStatus;

import java.util.Optional;

public class StubEmptyRepository implements UserRepository {

    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    public User save(User user) {
        return User.builder()
                .id(1L)
                .email(user.getEmail())
                .nickname(user.getNickname())
                .status(user.getStatus())
                .verificationCode(user.getVerificationCode())
                .build();
    }
}


}
