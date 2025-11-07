package io.springpragmaticpractices.chapter.two.two;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class UserJpaEntity {

    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String email;
}
