package genericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Box<Float> box1 = new Box<>();
		 
		box1.setValor(20f);
		
		System.out.println(box1.getValor());
		
		List <Alumno> listaAlumno = new ArrayList<>();
		listaAlumno.add(new Alumno("Matias","Rodriguez","123123"));
		listaAlumno.add(new Alumno("Juan","Pepe","2342342"));
		
		List <Persona> listaPersona = new ArrayList<>();
		listaPersona.add(new Persona("Roberto","Rodriguez"));
		listaPersona.add(new Persona("Carlos","Pepe"));
		
		Main.imprimir(listaAlumno);
		Main.imprimir(listaPersona);
	}
	
	public static void imprimir(List<? extends Persona> Lista){
		
		for (Persona persona : Lista) {
			System.out.println(persona.getNombre());
		}
	}

}
