package factory;

public class Empleado{
	
	private String nombre;
	private String apellido;
	private String cuil;
	private String estado;
	private Double sueldo;
	private Double cantidadHorasTrabajadas;
	private TipoCobro tipoCobro;
	
	
	
	public Empleado(String nombre, String apellido, String cuil, String estado, Double sueldo,
			Double cantidadHorasTrabajadas, TipoCobro tipoCobro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.tipoCobro = tipoCobro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCuil() {
		return cuil;
	}
	public String getEstado() {
		return estado;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public Double getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}
	public TipoCobro getTipoCobro() {
		return tipoCobro;
	}
	
	
}
