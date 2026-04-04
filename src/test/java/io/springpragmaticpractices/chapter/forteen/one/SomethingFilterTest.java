package io.springpragmaticpractices.chapter.forteen.one;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

class SomethingFilterTest {

    @Test
    void 요청에_text로_달라는_요청이_있으면_컨텐츠_타입은_Text_plain이다() throws ServletException, IOException {

        // given
        MockHttpServletRequest servletRequest = new MockHttpServletRequest();
        servletRequest.setAttribute("giveMe", "text");
        MockHttpServletResponse servletResponse = new MockHttpServletResponse();

        // when
        SomethingFilter somethingFilter = new SomethingFilter();
        somethingFilter.doFilter(servletRequest, servletResponse, (servletRequest1, servletResponse1) -> {
            // do nothing
        });

        // then
        assertThat(servletResponse.getContentType()).isEqualTo("text/plain");
    }
}