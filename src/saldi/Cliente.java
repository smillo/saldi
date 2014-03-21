package saldi;

public class Cliente extends Thread{

	
	private SignalWaiter porta;

	public Cliente(SignalWaiter porta){
		this.porta=porta;
		setName("cliente" + getName());
		
	}
	
	

	public void run(){
		System.out.println(getName() + " mi metto in coda");
		try{
			this.porta.waitSignal();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(getName() + " sono entrato nel negozio");
	}
}