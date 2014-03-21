package saldi;

public class Negozio extends Thread{
	
	private SignalSender porta;


	public Negozio(SignalSender porta){
		
		this.porta=porta;
		setName("negozio"+ getName());
	}

	public void run(){
		while(true){
			try {
				Thread.sleep(10000);
				System.out.println(getName() + " apro le porte");
				
				System.out.println(getName() + " porte aperte");
				this.porta.sendSignal();
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
	}

	
	
}