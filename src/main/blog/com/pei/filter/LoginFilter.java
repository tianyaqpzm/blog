package com.pei.filter;

import com.pei.support.WebContext;
import com.pei.support.WebContextFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pei on 2017/4/24.
 */


public class LoginFilter extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
        WebContext context = WebContextFactory.get();
        if(context != null)
            return;

    }
}
