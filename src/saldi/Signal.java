package saldi;

public abstract class Signal implements SignalSender , SignalWaiter {
	protected boolean arrived = false ;


 public abstract void waitSignal() throws InterruptedException ;

 public synchronized void send() {
 arrived = true ;
 notify() ;
 } }
