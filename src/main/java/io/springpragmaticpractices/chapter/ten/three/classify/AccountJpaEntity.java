package io.springpragmaticpractices.chapter.ten.three.classify;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "account")
public class AccountJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    @Column
    private String nickname;

    public static AccountJpaEntity from(Account account) {
        AccountJpaEntity entity = new AccountJpaEntity();
        entity.id = account.getId();
        entity.email = account.getEmail();
        entity.nickname = account.getNickname();
        return entity;
    }

    public Account toModel() {
        return Account.builder()
                .id(id)
                .email(email)
                .nickname(nickname)
                .build();
    }
}
