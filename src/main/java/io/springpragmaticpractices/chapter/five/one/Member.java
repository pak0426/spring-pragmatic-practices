package io.springpragmaticpractices.chapter.five.one;

import lombok.Data;

@Data
public class Member {
    private long id;
    private String name;
    private Team myTeam;
    private int salary;

    public int calculateTeamMemberTotalSalary() {
        int result = 0;
        for (Member member : myTeam.getMembers()) {
            result += member.getSalary();
        }

        return result;
    }
}
