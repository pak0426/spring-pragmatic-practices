package io.springpragmaticpractices.chapter.five.intro;

import lombok.Data;

@Data
public class Member {
    private long id;
    private String name;
    private Team myTeam;
}
