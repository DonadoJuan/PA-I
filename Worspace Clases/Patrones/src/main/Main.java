package main;

import factory.Empleado;
import factory.Factory;
import factory.ICalculoSueldo;
import static factory.TipoCobro.mensual;
import static factory.TipoCobro.porHora;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// FACTORY
		
		Empleado emp1 = new Empleado("Juan","Donado","38613611","Activo",45620D,23D,mensual);
		Empleado emp2 = new Empleado("Juan","Donado","38613611","Activo",45620D,23D,porHora);
		Empleado emp3 = new Empleado("Juan","Donado","38613611","Activo",45620D,23D,mensual);
		
		List<Empleado> lsemp = new ArrayList<>();
		lsemp.add(emp1);
		lsemp.add(emp2);
		lsemp.add(emp3);
		
		for (Empleado emp : lsemp) {
			Double sueldoLiquidado = Factory.calcular(emp.getTipoCobro()).calcular(emp);
			System.out.println(sueldoLiquidado);
		}
		
		//STATE
		
		//Alumno al1 = new Alumno();
		
		
	}

}
