package io.springpragmaticpractices.chapter.five.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private MemberService memberService;
}
