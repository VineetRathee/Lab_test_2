package com.singletonImplementation.Cloning;

public class CloneClass implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException  
	  { 
	    return super.clone(); 
	  } 

}
