import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MiThread("ROBERTO"));
		Thread t2 = new Thread(new MiThread("JORGE"));
		
		//t1.start();
		//t2.start();
	}
	
	public synchronized void met(){
	}

}
