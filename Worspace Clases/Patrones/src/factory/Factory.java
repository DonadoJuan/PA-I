package factory;

public class Factory {
	
	
	public static ICalculoSueldo calcular(TipoCobro tc){
		
		if(tc == TipoCobro.mensual)
			return new SueldoMensual();
		else
			return new SueldoPorHora();
	}
}
