package factory;

public class SueldoPorHora implements ICalculoSueldo {

	@Override
	public Double calcular(Empleado emp) {
		
		return emp.getCantidadHorasTrabajadas() * emp.getSueldo();
	}
}
