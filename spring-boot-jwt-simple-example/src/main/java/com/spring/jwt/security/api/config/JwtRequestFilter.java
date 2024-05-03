package com.spring.jwt.security.api.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.spring.jwt.security.api.services.JwtUserDetailsService;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtRequestFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUserDetailsService jwtUserDetailsService;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String requestTokenHeader = request.getHeader("Authorization");
		String username = null;
		String jwtToken = null;
		
		//Jwt Token is in the Bearer String we have to remove Bearer then we can get the token from this String.
		if (requestTokenHeader != null && requestTokenHeader.startsWith("Bear ")) {

			jwtToken = requestTokenHeader.substring(7);

			try {
				username = jwtTokenUtil.getUsernameFromToken(jwtToken);
			} catch (IllegalArgumentException ex) {
				System.out.println("Unable to get JWT Token");
			} catch (ExpiredJwtException ex) {
				System.out.println("JWT Token has Expired");
			}
		}else {
			logger.warn("Jwt Token doesn't begin with Bearer String");
		}
		
		//Once we get the token validate it
		if((username != null) && SecurityContextHolder.getContext().getAuthentication() == null) {
			
		}
	}

}
