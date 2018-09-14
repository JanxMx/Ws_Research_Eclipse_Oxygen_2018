package com.threads.synchronizeds;

public class SynchronizedMethod {

	int count = 0;
	
	public synchronized void add(int value) {
		this.count += value;
		System.out.println(Thread.currentThread().getName() + "-count:" + count);
	}
	
}
