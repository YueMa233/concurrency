package com.ma.concurrency.filter;

import com.ma.concurrency.example.threadLocal.RequestHolder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@WebFilter(filterName = "HttpFilter")
@Slf4j
public class HttpFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        log.info("do filter!{}{}",Thread.currentThread().getId(),((HttpServletRequest) req).getServletPath());
        RequestHolder.add(Thread.currentThread().getId());
        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
