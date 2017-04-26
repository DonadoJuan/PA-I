package state;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private String legajo;
	private estadoCarrera estado;
	private IEstadoCarrera estadoCarrera;

	public Alumno(String nombre, String apellido, String legajo, state.estadoCarrera estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.estado = estado;
		this.estadoCarrera = new Ingreso();
	}
	
	public void cambiarEstado(){
		estadoCarrera.procesarEstado(this);
	}
	
	public void setEstadoCarrera(IEstadoCarrera estadoCarrera) {
		this.estadoCarrera = estadoCarrera;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public estadoCarrera getEstado() {
		return estado;
	}

	public IEstadoCarrera getEstadoCarrera() {
		return estadoCarrera;
	}

	public void setIEstadoCarrera(IEstadoCarrera ec){
		this.estadoCarrera = ec;
	}
	
	
	
	
	
	
}
