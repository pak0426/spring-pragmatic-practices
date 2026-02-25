package io.springpragmaticpractices.chapter.five.two;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "member")
public class MemberJpaEntity {

    @Id
    private String id;
    @Column
    private String name;
    @Column(name = "my_team_id")
    private String myTeamId;
}
