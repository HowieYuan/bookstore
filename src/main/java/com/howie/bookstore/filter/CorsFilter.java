package com.howie.bookstore.filter;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 跨域
 * @Date 2018-03-20
 * @Time 16:59
 */
@Component
public class CorsFilter implements Filter {

    /**
     * json web token 在请求头的名字
     */
    private String tokenHeader = "X_Auth_Token";

    /**
     * 解决跨域的核心部分， copy 的，还未研究原理
     *
     * @param req
     * @param res
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        String Origin = request.getHeader("Origin");
        Logger logger = Logger.getLogger(this.getClass());
        logger.info("Origin:  " + Origin);
        response.setHeader("Access-Control-Allow-Origin", Origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, " + this.tokenHeader);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }


}
