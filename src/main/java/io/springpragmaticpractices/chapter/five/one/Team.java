package io.springpragmaticpractices.chapter.five.one;

import lombok.Data;

import java.util.List;

@Data
public class Team {
    private long id;
    private String name;
    private List<Member> members;
}
