package trainRacing;

public class Train extends Thread {
	private String name;
	private volatile boolean running=true;
	private long startTime,tempTime,interval, endTime=5000;
	
	 Train(String _name) {
		this.name=_name;
		this.setName(_name);
		startTime = System.currentTimeMillis();
		tempTime = startTime;
		System.out.println(startTime);
	}
	@myAnnotation( name = "jakob")
	public Train(String _name, int _interval) {
		this(_name);
		this.interval= _interval;
	}

	@Override
	public void run() {
		/*while(running) {
			try {
				System.out.println(name);
				this.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// stoppa
			if( startTime+endTime < System.currentTimeMillis()) {
				running=false;
			}
		}*/
		
		// Jancky manuel timer 
		while(running) {
			 // interval som printas ut
			if( tempTime+interval < System.currentTimeMillis()) {
				System.out.println(name);
				tempTime=System.currentTimeMillis();   // updaterar så nästa interval funkar
			}
			// stoppa
			if( startTime+endTime < System.currentTimeMillis()) {
				running=false;
			}
		}
		
		System.out.println(name+" stopped!!");
		
	}

	@Override
	public void interrupt(){
		running=false;
	}
}
