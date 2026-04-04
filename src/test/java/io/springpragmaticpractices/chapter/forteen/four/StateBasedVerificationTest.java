package io.springpragmaticpractices.chapter.forteen.four;

import io.springpragmaticpractices.chapter.forteen.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class StateBasedVerificationTest {

    @Test
    void 유저는_북마크를_toggle_해서_제거_할_수_있다() {
        // given
        User user = User.builder()
                .bookmark(new ArrayList<>())
                .build();
        user.appendBookmark("foobar");

        // when
        user.toggleBookmark("foobar");

        // then
        // user는 foobar를 북마크로 갖고 있어선 안된다.
        assertThat(user.hasBookmark("foobar")).isFalse();
    }
}
