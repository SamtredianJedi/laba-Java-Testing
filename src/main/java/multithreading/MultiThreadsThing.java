package multithreading;

public class MultiThreadsThing extends Thread{
	
	private int threadNumber;
	public MultiThreadsThing (int threadNumber) {
		
		this.threadNumber = threadNumber;
		
	}
	
	

	@Override
	public void run() {
		for (int i=0; i <= 5; i++) {
			System.out.println(i+" from thread "+ threadNumber);
			
			if (threadNumber == 3) {
				throw new RuntimeException();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}