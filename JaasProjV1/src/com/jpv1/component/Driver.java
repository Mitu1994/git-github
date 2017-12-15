package com.jpv1.component;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class Driver {

	public static void main(String[] args) throws LoginException {
		System.setProperty("java.security.auth.login.config","jaas.config");
		LoginContext context=new LoginContext("abcd",new MyCallbackHandler());
		context.login();
	}
}
