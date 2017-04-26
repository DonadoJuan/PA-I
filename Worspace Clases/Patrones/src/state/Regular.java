package state;

public class Regular implements IEstadoCarrera {

	@Override
	public void procesarEstado(Alumno alu) {
		alu.setEstadoCarrera(new Ingreso());
		System.out.println("Alumno volvio a Ingreso por copiarse");
		
	}

}
