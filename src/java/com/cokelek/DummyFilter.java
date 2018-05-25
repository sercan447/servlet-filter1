
package com.cokelek;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class DummyFilter  implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
   
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       
        HttpServletRequest r = (HttpServletRequest) request;
        System.out.println("DummyFilter methodu...." +r.getRequestURL().toString());
        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
    
}
