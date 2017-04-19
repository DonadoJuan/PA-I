package genericos;

public class Alumno extends Persona{
	
	private String legajo;
	
	
	public Alumno(String nombre, String apellido, String legajo) {
		super(nombre, apellido);
		this.legajo = legajo;
	}


	public String getLegajo() {
		return legajo;
	}
	
	
	
	
}
