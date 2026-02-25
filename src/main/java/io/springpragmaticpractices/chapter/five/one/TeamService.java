package io.springpragmaticpractices.chapter.five.one;

import io.springpragmaticpractices.chapter.five.intro.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final MemberService memberService;

    public long getTeamSalary(long teamId) {
        return memberService.findByTeamId(teamId).stream()
                .mapToLong(Member::getSalary)
                .sum();
    }
}
