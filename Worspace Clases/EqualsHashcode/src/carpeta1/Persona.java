package carpeta1;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona(){}
	
	public Persona(String nombre, String apellido, int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	@Override
	public String toString(){
		return this.nombre + " " + this.apellido;
	}
	
	@Override
	public boolean equals(Object b ){
		if(b instanceof Persona){
			Persona aux = (Persona) b;
			if(this.nombre.equals(aux.nombre))
				if(this.apellido.equals(aux.apellido))
					if(this.dni == aux.dni)
						return true;
			
		}
		
		return false;
	}
	
	@Override
	public int hashCode(){
		
		int numero = 31;
		int resultado = 1;
		if(this.dni != 0)
			resultado = numero * resultado + this.dni;
		if(this.nombre != null)
			resultado = numero * resultado + this.nombre.hashCode();
		if(this.apellido != null)
		resultado = numero * resultado + this.apellido.hashCode();
		
		return resultado;
		
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public int getDni(){
		return this.dni;
	}
	public void setDni(int dni){
		this.dni = dni;
	}
	
	
}
