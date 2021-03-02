package com.multithreadingQue1;

public class PrintSum {
	public static void main(String[] args) throws InterruptedException {
		RandomThread randomThread1 = new RandomThread();
		RandomThread randomThread2 = new RandomThread();
        RandomThread randomThread3 = new RandomThread();
        RandomThread randomThread4 = new RandomThread();
        RandomThread randomThread5 = new RandomThread();

	      Thread thread1=new Thread(randomThread1);
          Thread thread2=new Thread(randomThread2);
          Thread thread3=new Thread(randomThread3);
          Thread thread4=new Thread(randomThread4);
          Thread thread5=new Thread(randomThread5);

          thread1.start();
          thread2.start();
          thread3.start();

          thread4.start();

          thread5.start();

          thread1.join();

          thread2.join();

          thread3.join();

          thread4.join();

          thread5.join();

	      int RandomSum = 0; 
          RandomSum = RandomSum + randomThread1.getNumber();
          RandomSum = RandomSum + randomThread2.getNumber();
          RandomSum = RandomSum + randomThread3.getNumber();
          RandomSum = RandomSum + randomThread4.getNumber();
          RandomSum = RandomSum + randomThread5.getNumber();

	      System.out.println("RandomSum: " + RandomSum);

	   }
	}


