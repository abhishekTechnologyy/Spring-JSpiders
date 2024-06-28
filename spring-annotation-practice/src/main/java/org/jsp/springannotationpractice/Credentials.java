package org.jsp.springannotationpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Credentials {

	@Value(value="${jdbc.user.name}")
	private String username;
	
	@Value(value="${jdbc.user.password}")
	private String password;

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
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
