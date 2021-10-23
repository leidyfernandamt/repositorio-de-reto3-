package com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;




@EntityScan(basePackages = {"com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.Entidad"})
@SpringBootApplication
public class DesarrollowebReto3Ciclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(DesarrollowebReto3Ciclo3Application.class, args);
	}

}
