package io.springpragmaticpractices.chapter.eight.three;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AccountJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String nickname;

    public static AccountJpaEntity from(Account account) {
        AccountJpaEntity result = new AccountJpaEntity();
        result.id = account.getId();
        result.email = account.getEmail();
        result.nickname = account.getNickname();
        return result;
    }

    public Account toModel() {
        return Account.builder()
                .id(this.id)
                .email(this.email)
                .nickname(this.nickname)
                .build();
    }
}
