package io.springpragmaticpractices.chapter.forteen.four;

import io.springpragmaticpractices.chapter.forteen.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class BehaviorBasedVerificationTest {

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
        // user.removeBookmark("foobar")가 호출됐는지 확인한다.
        verify(user).removeBookmark("foobar");
    }
}
