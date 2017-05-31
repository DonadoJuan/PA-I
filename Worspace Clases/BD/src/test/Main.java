package test;

import java.sql.ResultSet;

import dao.DAO;

public class Main {

	public static void main(String[] args){
		
		DAO dao = new DAO();
		dao.testInsert("INSERT INTO persona (nombre,apellido) VALUES ('Juan','Donado')");
		dao.testSelect("SELECT * FROM persona");
	

	}

}
