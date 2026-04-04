package io.springpragmaticpractices.chapter.forteen.one;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

public class SomethingFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // text를 요청하는 request라면 응답의 Content-Type을 "text/plain"으로 만든다.
        if (servletRequest.getAttribute("giveMe").equals("text")) {
            servletResponse.setContentType("text/plain");
        }

        // 책임 연쇄 패턴에 따라 다음 필터를 실행하기 위해 필터 체인의 doFilter를 호출한다.
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
