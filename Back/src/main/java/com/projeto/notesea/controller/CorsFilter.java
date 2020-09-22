package com.projeto.notesea.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//resolve o erro de compartilhamento de recursos diferentes - Cors
public class CorsFilter implements Filter {
	
	 public CorsFilter() {
	    }
	  @Override
	    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
	        HttpServletResponse response = (HttpServletResponse) res;
	        HttpServletRequest request = (HttpServletRequest) req;
	        //Preflight request
	        response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));
	        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
	        /*
	         * https://stackoverflow.com/questions/32500073/request-header-field-access-control-allow-headers-is-not-allowed-by-itself-in-pr
	         * You need to reply to that CORS preflight with the appropriate CORS headers to make this work. 
	         * One of which is indeed Access-Control-Allow-Headers. 
	         * That header needs to contain the same values the Access-Control-Request-Headers header contained (or more)
	         */
	        response.addHeader("Access-Control-Allow-Headers", request.getHeader("access-control-request-headers"));
	        response.addHeader("Access-Control-Max-Age", "1728000");
	        response.addHeader("Connection", "keep-alive");
	        
	        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
	            response.setStatus(HttpServletResponse.SC_OK);
	        } else {
	            chain.doFilter(req, res);
	        }
	    }

	    @Override
	    public void init(FilterConfig filterConfig) {
	    }

	    @Override
	    public void destroy() {
	    }


}
