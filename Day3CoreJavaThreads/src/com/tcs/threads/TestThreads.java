package com.tcs.threads;

public class TestThreads {

	public static void main(String[] args) {
		
		System.out.println("started the main");
		
		MyThread t1=new MyThread("t1");
		t1.start();
		
		MyThread t2=new MyThread("t2");
//		t1.setDaemon(true);
//		t2.setDaemon(true);
		
		t2.start();
		try {
			//hread.currentThread().join();
			t2.join();//main will not complete till t2 gets completed
			t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("exiting the main");

	}

}
