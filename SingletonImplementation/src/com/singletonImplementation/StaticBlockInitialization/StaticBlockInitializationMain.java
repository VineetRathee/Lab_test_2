package com.singletonImplementation.StaticBlockInitialization;

import com.singletonImplementation.EagerInitialization.EagerInitialization;

public class StaticBlockInitializationMain {
	public static void main(String[] args) {
		
		//calling for the first time 
		StaticBlockInitialization.getInstance();
		
		StaticBlockInitialization.getInstance();


		
	}

}
