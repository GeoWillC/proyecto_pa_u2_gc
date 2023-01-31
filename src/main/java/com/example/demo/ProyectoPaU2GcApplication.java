package com.example.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.ILibroService;
import com.example.demo.uce.service.IVehiculoService;

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
	@Autowired
	private IVehiculoService iVehiculoService;
	
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
		
//		Set<Autor> autores = new HashSet<Autor>();
//		Autor autor1=new Autor();
//		autor1.setNombre("O");
//		
//		Autor autor2=new Autor();
//		autor2.setNombre("D");
//		
//		Autor autor3=new Autor();
//		autor3.setNombre("J");
//		
//		autores.add(autor1);
//		autores.add(autor2);
//		autores.add(autor3);
//		
//		Libro libro=new Libro();
//		libro.setNombre("analisis");
//		libro.setEditorial("Norma");
//		libro.setAutores(autores);
//		this.iLibroService.agregar(libro);
		
		//Insertar vehiculos 
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setCategoria("A");
		vehiculo.setMarca("Toyota");
		vehiculo.setNumeroSerie("A12312313");
		vehiculo.setPrecioDia(new BigDecimal(50));
//		
		Vehiculo vehiculo2=new Vehiculo();
		vehiculo2.setCategoria("C");
		vehiculo2.setMarca("Chevrolet");
		vehiculo2.setNumeroSerie("B12312313");
		vehiculo2.setPrecioDia(new BigDecimal(60));
//		
		Cliente cliente1=new Cliente();
		cliente1.setApellido("Cuenca");
		cliente1.setNombre("Juan");
		cliente1.setTarjetaCredito("5540500001000004");
		cliente1.setCedula("1751242661");
		
		Cliente cliente2=new Cliente();
		cliente2.setApellido("Perez");
		cliente2.setNombre("Juan");
		cliente2.setTarjetaCredito("5020470001370055");
		cliente2.setCedula("1751242662");
		
		Cliente cliente3=new Cliente();
		cliente3.setApellido("Marco");
		cliente3.setNombre("Paez");
		cliente3.setTarjetaCredito("5020080001000006");
		cliente3.setCedula("1751242663");
		
		Cliente cliente4=new Cliente();
		cliente4.setApellido("Andrade");
		cliente4.setNombre("Mario");
		cliente4.setTarjetaCredito("4507670001000009");
		cliente4.setCedula("1751242664");
		
		Set<Cliente> clientes=new HashSet<Cliente>();  
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		
		vehiculo.setClientes(clientes);
		
		Set<Cliente> clientes2=new HashSet<Cliente>();
		clientes2.add(cliente1);
		clientes2.add(cliente3);
		
		this.iVehiculoService.agregar(vehiculo);
//		vehiculo2.setClientes(clientes2);
//		this.iVehiculoService.agregar(vehiculo2);
		
	}

}
