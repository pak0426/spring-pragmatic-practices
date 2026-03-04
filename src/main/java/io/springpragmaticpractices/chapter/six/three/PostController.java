package io.springpragmaticpractices.chapter.six.three;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/cage/{cafeId}/boards/{boardId}/posts")
public class PostController {

    private final CafeMemberJpaRepository cafeMemberJpaRepository;
    private final BoardJpaRepository boardJpaRepository;
    private final PostJpaRepository postJpaRepository;
    private final PostRender postRender;

    // ...
}
