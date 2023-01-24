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

//		//Segundo Ejemplo: Solo insertar un empleado sin cascade
//		Ciudadano ciu2=new Ciudadano();
//		ciu2.setNombre("Juan");
//		ciu2.setApellido("Padilla");
//		
//		Empleado emp2=new Empleado();
//		emp2.setSalario(new BigDecimal(100));
//		emp2.setFechaIngreso(LocalDateTime.now());
//		emp2.setCiudadano(ciu2);
//		this.iCiudadanoService.guardar(ciu2);
//		ciu2.setEmpleado(emp2);
//		this.iEmpleadoService.guardar(emp2);
		
			
		//Tercer ejemplo
		//Segundo Ejemplo: Solo insertar un empleado
//				Ciudadano ciu2=new Ciudadano();
//				ciu2.setNombre("Juan");
//				ciu2.setApellido("Padilla");
//				
//				Empleado emp2=new Empleado();
//				emp2.setSalario(new BigDecimal(100));
//				emp2.setFechaIngreso(LocalDateTime.now());
//				emp2.setCiudadano(ciu2);
//				ciu2.setEmpleado(emp2);
//				this.iEmpleadoService.guardar(emp2);
				//Esta linea es innecesaria ya que la de arriba ya realiza la insercion
				//this.iCiudadanoService.guardar(ciu2);
				//si se ejecuta los id son iguales a los de arriba creando duplicaciond e identidades
				//debido al cascade que se uso en ambas clases
				//terminando en un error
				//esos id son asignados por jakarta
				//Las dos cumplen la misma funcion, por lo que cualquiera de las dos es usable
				
		//Relacion uno a muchos
		
		
		
		
	}

}
