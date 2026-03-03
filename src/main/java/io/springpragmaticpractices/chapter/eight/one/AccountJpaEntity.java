package io.springpragmaticpractices.chapter.eight.one;

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
}
