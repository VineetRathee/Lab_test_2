package com.singletonImplementation.LazyInitialization;

public class LazyInitialization {
private static LazyInitialization instance;
    
    private LazyInitialization(){
    	System.out.println("constructor is called");
    }
    
    public static LazyInitialization getInstance(){
    	System.out.println("getInstance is called");
        if(instance == null){
        	
            instance = new LazyInitialization();
        }
        return instance;

}
}
