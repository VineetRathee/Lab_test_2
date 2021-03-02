package com.singletonImplementation.EagerInitialization;

public class MainEagerInit {
	public static void main(String[] args) {
		
		//calling for the first time
		EagerInitialization.getInstance();
		
		EagerInitialization.getInstance();
		
		
		
	}

}
