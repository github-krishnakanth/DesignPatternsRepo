package com.fdp.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class UserAgentFilter implements Filter {
	private FilterConfig fConfig;
	private Logger logger;
	
	public void destroy() {
		logger = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String userAgent = null;
		
		userAgent = ((HttpServletRequest)request).getHeader("User-Agent");
		logger.info("User Agent: "+userAgent);
		
		if(userAgent.contains("Firefox")) {
			chain.doFilter(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("badBrowser.jsp");
			dispatcher.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
		logger = Logger.getLogger("logFile");
	}
}
