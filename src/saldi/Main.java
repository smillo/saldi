package saldi;

public class Main extends Thread{
	
	

	public static void main(String[] args ) throws InterruptedException {
		
		 OpenedDoorSignal porta= new OpenedDoorSignal();
		 
		 new Negozio(porta).start();
		 while(true){
		 int numC=10;
		 for(int i =0;i<numC;i++){
		 new Cliente(porta).start();
		 
		 }
		 Thread.sleep(10000);
		 
		 }
				
		 }
		 }
		