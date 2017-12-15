package com.jpv1.component;

import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

public class MyLoginModule implements javax.security.auth.spi.LoginModule{

	@Override
	public boolean abort() throws LoginException {
		System.out.println("LoginModule abort() method.");
		return false;
	}

	@Override
	public boolean commit() throws LoginException {
		System.out.println("LoginModule commit() method.");
		return false;
	}

	@Override
	public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState,
			Map<String, ?> options) {
		System.out.println("LoginModule initialize() method.");		
	}

	@Override
	public boolean login() throws LoginException {
		System.out.println("LoginModule login() method.");
		return false;
	}

	@Override
	public boolean logout() throws LoginException {
		System.out.println("LoginModule logout() method.");
		return false;
	}

}
