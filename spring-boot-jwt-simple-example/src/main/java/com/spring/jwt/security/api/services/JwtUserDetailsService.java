package com.spring.jwt.security.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JwtUserDetailsService implements UserDetailsService {
	
	@Value("${jwt.secret}")
	private String usrname;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(usrname.equals(username)) {
			return new User(usrname, "$2a$10$cYVVCtEN9k3RD2xmyNxajOMpPNR/pzchQ4/rT8e7tIrvkr3v0c1me", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Username not found with username: "+username);
		}
	}
}
