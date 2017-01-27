package com.thread.thread;

import com.thread.commres.CommonResource;

public class CommThread implements Runnable {

	CommonResource res = new CommonResource();
	
	public CommThread(CommonResource res) {
		this.res = res;
	}
	
	@Override
	public void run() {
		res.increment();
	}

}
