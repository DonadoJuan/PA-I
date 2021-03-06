import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.junit.Test;

public class Main {

	public static void main(String[] args) {
		
		Class c = new Persona().getClass();
		c = Persona.class;
		
		try {
			c = Class.forName("Persona");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Field f: c.getDeclaredFields()){
			//System.out.println(f.getName());
		}
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Donado");
		p1.setDni("38613611");
		
		for(Field f: c.getDeclaredFields()){
			try {
				f.setAccessible(true);
				f.set(p1,"XOXO");
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(Method m: c.getDeclaredMethods()){
			
			if(m.getAnnotation(Test.class) != null){
				
				try {
					System.out.println(m.invoke(p1, new Object[] {"Pepe"}));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					System.out.println("ERROR");
				}			
			}
		}
		
		System.out.println(p1);
		System.exit(0);
		
		for(Method m: c.getDeclaredMethods()){
			
			if(m.getName().startsWith("get")){
				
				try {
					System.out.println(m.invoke(p1, new Object[0]));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					
				}			
			}
		}
		Persona p2 = null;
		
		try {
			p2 = (Persona) c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		
		
		for(Constructor con : c.getConstructors()){
			try {
				if(con.getParameterTypes().length != 0)
					p2 = (Persona) con.newInstance(new Object[] {"pepe","roberto","524123"});
				
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(p2);

	}

}
