package factory;

public class SueldoMensual implements ICalculoSueldo {

	@Override
	public Double calcular(Empleado emp) {
		return emp.getSueldo();	
	}
	
}
