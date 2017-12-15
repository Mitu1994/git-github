package com.jpv1.component;

import java.io.Serializable;
import java.security.Principal;

public class MyPrincipal implements Principal,Serializable{

	@Override
	public String getName() {

		return "Returning the value from the principal.";
	}
 
}
