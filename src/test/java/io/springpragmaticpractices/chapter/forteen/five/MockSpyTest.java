package io.springpragmaticpractices.chapter.forteen.five;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MockSpyTest {

    @Test
    void mock_versus_spy() {
        // given
        List<Integer> mockedList = mock(ArrayList.class);
        List<Integer> spyList =  spy(new ArrayList<Integer>());

        // when
        mockedList.add(1);
        spyList.add(1);

        // then.1
        verify(mockedList).add(1);
        verify(spyList).add(1);

        // then.2
        assertThat(mockedList.size()).isEqualTo(0); // Mock에는 값이 들어있지 않다.
        assertThat(spyList.size()).isEqualTo(1); // Spy에는 실제로 값이 들어간다.
    }
}
