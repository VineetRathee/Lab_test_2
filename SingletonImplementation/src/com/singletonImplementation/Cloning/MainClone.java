package com.singletonImplementation.Cloning;

public class MainClone 
{ 
  public static void main(String[] args) throws CloneNotSupportedException  
  { 
    SingletonClone instance1 = SingletonClone.instance; 
    SingletonClone instance2 = (SingletonClone) instance1.clone(); 
    System.out.println("instance1 hashCode:- "
                           + instance1.hashCode()); 
    System.out.println("instance2 hashCode:- " 
                           + instance2.hashCode());  
  } 
} 