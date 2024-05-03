package com.spring.jwt.security.api.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 271951690493297298L;

	private String username;
	private String password;

	public JwtRequest() {

	}

	public JwtRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
