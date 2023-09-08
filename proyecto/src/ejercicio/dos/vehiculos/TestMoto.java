package ejercicio.dos.vehiculos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
	
public class TestMoto {
	@Test
	void crearMoto() {
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		Persona liz = new Persona();
		Motocicleta miMoto = new Motocicleta();
		assertEquals(0,miMoto.getKm());
		assertEquals(null,miMoto.getChofer());
		miMoto.asignarChofer(cacho);
		assertEquals(cacho,miMoto.getChofer());
		miMoto.agregarAcompañante(liz);
		miMoto.cambiarChofer(pepe);
		assertEquals(cacho,miMoto.getChofer());
		miMoto.bajarAcompañante(liz);
		miMoto.cambiarChofer(pepe);
		assertEquals(pepe,miMoto.getChofer());
	}
	
	@Test
	void vehiculoTest() {
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		Persona liz = new Persona();
		Vehiculo otraMoto = new Motocicleta();
		Motocicleta miMoto = (Motocicleta)otraMoto;
		
		assertEquals(0,miMoto.getKm());
		assertEquals(null,miMoto.getChofer());
		miMoto.asignarChofer(cacho);
		assertEquals(cacho,miMoto.getChofer());
		miMoto.agregarAcompañante(liz);
		miMoto.cambiarChofer(pepe);
		assertEquals(cacho,miMoto.getChofer());
		miMoto.bajarAcompañante(liz);
		miMoto.cambiarChofer(pepe);
		assertEquals(pepe,miMoto.getChofer());
	}
	
	@Test
	void crearAuto() {
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		Persona liz = new Persona();
		Autobus miMoto = new Autobus(25, null, 1);
		assertEquals(25,miMoto.getKm());
		assertEquals(null,miMoto.getChofer());
		
		miMoto.asignarChofer(cacho);
		assertEquals(cacho,miMoto.getChofer());
		
		
		miMoto.agregarPasajeros(liz);
		miMoto.cambiarChofer(pepe);
		assertEquals(cacho,miMoto.getChofer());
		
		miMoto.bajarPasajeros();
		miMoto.cambiarChofer(pepe);
		assertEquals(pepe,miMoto.getChofer());
	}
}
