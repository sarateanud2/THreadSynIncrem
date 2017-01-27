package com.thread.main;

import com.thread.commres.CommonResource;
import com.thread.thread.CommThread;

public class Main {

	public static void main(String[] args) {
		CommonResource res = new CommonResource();
		
		for(int i = 1; i<6; i++){
			
			Thread thread = new Thread(new CommThread(res));
			thread.setName("Thread_" + i);
			thread.start();
		}
	}

}
