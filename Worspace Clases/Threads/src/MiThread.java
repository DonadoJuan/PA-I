
public class MiThread implements Runnable {
	
	private String nombre;
	
	public MiThread(String nombre){
		this.nombre = nombre;
	}
	
	public void run(){
		for (int i = 0; i < 7; i++) {
			System.out.println(nombre + i);
			try {
				//Thread.sleep(1000);
				Thread.yield();
			} catch (Exception e) {
				
			}
		}
	}
}
