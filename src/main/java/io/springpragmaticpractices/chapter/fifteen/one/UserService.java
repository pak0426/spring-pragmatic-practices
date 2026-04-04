package io.springpragmaticpractices.chapter.fifteen.one;

import io.springpragmaticpractices.chapter.forteen.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Clock;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User login(String email) {
        User user = userRepository.getByEmail(email);
        user.login(Clock.systemUTC().millis());
        user = userRepository.save(user);
        return user;
    }
}
