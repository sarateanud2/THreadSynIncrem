package com.thread.commres;

public class CommonResource {
	private int x = 0;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public synchronized void increment(){
		
		x = 1;
		
		for(int i = 1; i < 6; i++){
			System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
			x++;
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	
}



/*
 int x;
    synchronized void increment(){
        x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
 */
