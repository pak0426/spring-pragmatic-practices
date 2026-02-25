package io.springpragmaticpractices.chapter.five.two;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "team")
public class TeamJpaEntity {

    @Id
    private String id;
    @Column
    private String name;
    @OneToMany(mappedBy = "myTeam")
    private List<MemberJpaEntity> members;
}
