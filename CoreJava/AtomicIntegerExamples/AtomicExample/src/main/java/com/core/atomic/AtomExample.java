package com.core.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class ProcessingThread implements Runnable{
	
//	private int count;
	private AtomicInteger count = new AtomicInteger();
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			processSomething(i);
//			count++;
			count.incrementAndGet();
		}
	}
	
	public int getCount() {
		return this.count.get();
	}
	
	private void processSomething(int i) {
		System.out.println("Processing some jobs");
		try {
			Thread.sleep(i*1000);
			System.out.println(Thread.currentThread().getName());;
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public class AtomExample {
	public static void main(String[] args) throws InterruptedException {
		ProcessingThread pth = new ProcessingThread();
		Thread th = new Thread(pth, "processingThread-1");
		th.start();
		Thread th1 = new Thread(pth, "processingThread-2");
		th1.start();
		th.join();
		th1.join();
		System.out.println("Processing Count: "+pth.getCount());
	}
}
