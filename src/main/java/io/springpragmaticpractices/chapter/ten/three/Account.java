package io.springpragmaticpractices.chapter.ten.three;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column
    private String nickname;

    public void changeNickname(String newNickname) {
        this.nickname = newNickname;
    }
}
