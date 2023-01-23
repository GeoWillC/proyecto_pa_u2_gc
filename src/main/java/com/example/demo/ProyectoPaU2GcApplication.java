package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2GcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService iEstudianteService;
	@Autowired
	private ICiudadanoService iCiudadanoService;
	@Autowired
	private IEmpleadoService iEmpleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Error: object references an unsaved transient instance - save the transient instance before flushing
//		Ciudadano ciu=new Ciudadano();
//		ciu.setNombre("Willian");
//		ciu.setApellido("Conlago");
//		Empleado emp=new Empleado();
//		emp.setSalario(new BigDecimal(20));
//		emp.setFechaIngreso(LocalDateTime.now());
//		emp.setCiudadano(ciu);
//		ciu.setEmpleado(emp);
//		this.iEmpleadoService.guardar(emp);
//		this.iCiudadanoService.guardar(ciu);

		//Ciudadano no tiene la columna empleado (prescindible ? )
		Ciudadano ciu=new Ciudadano();
		ciu.setNombre("Willian");
		ciu.setApellido("Conlago");
		ciu.setEmpleado(null);
		this.iCiudadanoService.guardar(ciu);
		Empleado emp=new Empleado();
		emp.setSalario(new BigDecimal(20));
		emp.setFechaIngreso(LocalDateTime.now());
		emp.setCiudadano(ciu);
		this.iEmpleadoService.guardar(emp);
		ciu.setEmpleado(emp);
		this.iCiudadanoService.modificar(ciu);
		System.out.println("El ciudadano de id 1 es:"+ this.iCiudadanoService.encontrar(1));
		System.out.println("El empleado de id 1 es:"+ this.iEmpleadoService.encontrar(1));
	}

}
