package io.springpragmaticpractices.chapter.fifteen.one;

import io.springpragmaticpractices.chapter.forteen.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Clock;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ClockHolder clockHolder;

    public User login(String email) {
        User user = userRepository.getByEmail(email);
        user.login(clockHolder.now());
        user = userRepository.save(user);
        return user;
    }
}
