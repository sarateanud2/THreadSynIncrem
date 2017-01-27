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


/*
 synchronized(res){
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){}
            }
        }
 */