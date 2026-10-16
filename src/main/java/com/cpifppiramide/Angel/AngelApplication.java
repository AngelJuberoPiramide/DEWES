package com.cpifppiramide.Angel;

import com.cpifppiramide.Angel.persistencia.ConexionBD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class AngelApplication {

	public static void main(String[] args) {

		try {
			ConexionBD.getConexion();
		}catch (Exception e) {
			System.out.println("error");
		}

		SpringApplication.run(AngelApplication.class, args);
	}
}
