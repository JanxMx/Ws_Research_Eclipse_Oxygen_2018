package com.threads.synchronizeds;

public class RunnableSynchronized implements Runnable {

	private int counter = 0;
	
	@Override
	public synchronized void run() {
		
		//*** Execution state
		while(counter<50) {
			
			System.out.println("FirstRunnable - counter: FR_" + counter++);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException iex) {
				iex.printStackTrace();
			}
		}
		
		//*** Dead state
	}
	

}
