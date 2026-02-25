package io.springpragmaticpractices.chapter.five.intro;

import lombok.Data;

import java.lang.reflect.Member;
import java.util.List;

@Data
public class Team {
    private long id;
    private String name;
    private List<Member> members;
}
