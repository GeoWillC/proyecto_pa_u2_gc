package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.ILibroService;

@SpringBootApplication
public class ProyectoPaU2GcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService iEstudianteService;
	@Autowired
	private ICiudadanoService iCiudadanoService;
	@Autowired
	private IEmpleadoService iEmpleadoService;
	@Autowired
	private IHotelService iHotelService;
	@Autowired
	private ILibroService iLibroService;
	@Autowired
	private IHabitacionService iHabitacionService;
	
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
				
		//Relacion uno a muchos}
		//Hotel
//		Hotel hotel=new Hotel();
//		hotel.setDireccion("Amazonas");
//		hotel.setNombre("Hilton");
//		//Habitaciones
//		List <Habitacion> habitacion=new ArrayList<>();
//		Habitacion habitacion1=new Habitacion();
//		habitacion1.setHotel(hotel);
//		habitacion1.setNumero("A10");
//		habitacion.add(habitacion1);
//		Habitacion habitacion2=new Habitacion();
//		habitacion2.setHotel(hotel);
//		habitacion2.setNumero("A11");
//		habitacion.add(habitacion2);
//		Habitacion habitacion3=new Habitacion();
//		habitacion3.setHotel(hotel);
//		habitacion3.setNumero("A12");
//		habitacion.add(habitacion3);
//		//Lista
//		//Inserto
//		hotel.setHabitacion(habitacion);
//		this.iHotelService.guardar(hotel);
//		this.iHotelService.eliminar(1);
//		hotel.setDireccion("Shyris");
//		this.iHotelService.modificar(hotel);
		

//		//Eliminarse la A11
//		this.iHotelService.encontrar(3);
//		this.iHabitacionService.encontrar(11);
//		this.iHabitacionService.eliminar(11);
		//Cascade une las dos tablas por lo que para insertar un nuevo hotel es necesario quitar el cascade
		//deberia haber una forma de intercalar entre las dos formas
//		detached entity passed to persist: com.example.demo.uce.modelo.Hotel
		
		//Consultar hotel y sus habitaciones
//		
//		Hotel hotel=this.iHotelService.encontrar(4);
//		System.out.println(hotel);
//		
				
		//Insertar libro
		
		Set<Autor> autores = new HashSet<Autor>();
		Autor autor1=new Autor();
		autor1.setNombre("O");
		
		Autor autor2=new Autor();
		autor2.setNombre("D");
		
		Autor autor3=new Autor();
		autor3.setNombre("J");
		
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		
		Libro libro=new Libro();
		libro.setNombre("analisis");
		libro.setEditorial("Norma");
		libro.setAutores(autores);
		this.iLibroService.agregar(libro);
		
	}

}
