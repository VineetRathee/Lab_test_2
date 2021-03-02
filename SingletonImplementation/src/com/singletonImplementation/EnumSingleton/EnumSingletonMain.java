package com.singletonImplementation.EnumSingleton;

public class EnumSingletonMain {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException {
		SingletonEnum enum1 = SingletonEnum.INSTANCE;
		SingletonEnum enum2 = SingletonEnum.INSTANCE;
       
       
        System.out.println(enum1.hashCode());
        System.out.println(enum2.hashCode());
    }
}
