package carpeta1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan","Donado",38613611);
		
		Persona p2 = new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Donado");
		p2.setDni(38613611);
		
		Persona p3 = new Persona();
		
		
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());

	}

}
