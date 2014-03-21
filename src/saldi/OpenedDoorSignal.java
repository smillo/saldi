package saldi;

public class OpenedDoorSignal implements SignalSender,SignalWaiter {
	
	private boolean arrived=false;
	private int waiting=0;
	
	public synchronized void waitSignal() throws InterruptedException{
		try{
			while(!arrived){
				waiting++;
				wait();
				waiting--;
			}
			if(waiting<=0){
				arrived = false;
			}}
				catch(InterruptedException ie){
					waiting--;
					throw ie;
					
				}
			
		
		
		}
	public synchronized void sendSignal(){
		if(waiting >0){
			arrived=true;
			notifyAll();
		}
	}
	}

	