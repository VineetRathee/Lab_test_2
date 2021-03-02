package com.singletonImplementation.Cloning;

public class SingletonClone extends CloneClass {
	public static SingletonClone instance = new SingletonClone(); 
	  
	  private SingletonClone()  
	  { 
	    System.out.println("constructor is called");
	  } 
	} 

