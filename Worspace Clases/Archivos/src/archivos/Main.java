package archivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		
		// creamos el objeto File que representa al archivo FISICO en memoria
		File f1 = new File("src/achivo.txt");
		File f2 = new File("/direc"); 
		
		//Escritura
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f1,false))){
			f1.createNewFile();
			//creamos el archivo SI todavia no existe fisicamente
			System.out.println(f1.isFile());
			//creamos el archivo SI todavia no existe fisicamente
			bw.write("Escribiendo desde el buffer con try con recursos");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Lectura
		try(BufferedReader br = new BufferedReader(new FileReader(f1))){
			
			String s = br.readLine();
			while(s != null){
				System.out.println(s);
				s = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Stream - copiar informacion de un origen a un destino
		
		//Archivo origen
		File pdf = new File("src/mipdf.pdf");
		//Archivo destino
		File pdf2 = new File("mipdf.pdf");
		
		try{
			//Stream para leer
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(pdf));
			
			//Stream para escribir
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pdf2));
			
			int size = 1024;
			byte[] bites = new byte[size];
			int len;
			while((len = bis.read(bites)) != -1){
				bos.write(bites);
			}
			bis.close();
			bos.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		
		
		
		

	}

}