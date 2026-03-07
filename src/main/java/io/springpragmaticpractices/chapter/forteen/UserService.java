package io.springpragmaticpractices.chapter.forteen;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Builder
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final VerificationEmailSender verificationEmailSender;

    @Transactional
    public User register(UserCreateDto userCreateDto) {
        User user = User.builder()
                .email(userCreateDto.getEmail())
                .nickname(userCreateDto.getNickname())
                .status(UserStatus.PENDING)
                .verificationCode(UUID.randomUUID().toString())
                .build();

        user = userRepository.save(user);
        verificationEmailSender.send(user);
        return user;
    }
}
