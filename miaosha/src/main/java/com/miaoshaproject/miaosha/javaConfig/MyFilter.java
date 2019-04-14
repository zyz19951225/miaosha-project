package com.miaoshaproject.miaosha.javaConfig;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component("myFilter")
@WebFilter(urlPatterns = "/*", filterName = "myfilter")
public class MyFilter implements Filter {

    public void destroy() {
        // System.out.println("过滤器销毁");
    }

    public void doFilter(ServletRequest request1, ServletResponse response1, FilterChain chain) throws IOException,
            ServletException {

        System.out.println("执行过滤操作");

        HttpServletResponse response = (HttpServletResponse) response1;
        HttpServletRequest request = (HttpServletRequest) request1;
        // request.getHeader("Origin"
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers",
                "User-Agent,Origin,Cache-Control,Content-type,Date,Server,withCredentials,AccessToken,x-requested-with");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");

        response.setHeader("Access-Control-Max-Age", "1209600");

        response.setHeader("Access-Control-Expose-Headers", "accesstoken");

        response.setHeader("Access-Control-Request-Headers", "accesstoken");

        response.setHeader("Expires", "-1");

        response.setHeader("Cache-Control", "no-cache");

        response.setHeader("pragma", "no-cache");

        chain.doFilter(request1, response);
    }

    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("过滤器初始化");
    }

}