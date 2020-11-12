package com.profile.test4.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfigurationSource;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Configuración para filtros mvc.
 *
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class CorsFilter extends org.springframework.web.filter.CorsFilter {

	@Autowired
	public CorsFilter(@Qualifier("mvcHandlerMappingIntrospector") CorsConfigurationSource configSource) {
		super(configSource);
	}

	@Override
	public void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		res.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
		res.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
		res.setHeader("Access-Control-Allow-Headers",
				"Origin, X-Requested-With, Content-Type, Accept, x-auth-token, x-csrf-token");
		res.setHeader("Access-Control-Allow-Credentials", "true");

		if (!req.getMethod().equals(HttpMethod.OPTIONS.toString())) {
			chain.doFilter(req, res);
		}

	}

}
