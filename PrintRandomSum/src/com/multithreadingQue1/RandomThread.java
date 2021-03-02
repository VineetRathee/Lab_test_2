package com.multithreadingQue1;

import java.util.Random;

public class RandomThread  implements Runnable{
	Random r = new Random();

	   int number;

	 

	   public void run() {

	      number = r.nextInt(10) + 1;

	   }

	   int getNumber(){

	      return number;

	   }


}
