import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BancTest {
	
	@Test 
	public void crearTitularTest() {
		Titular titular = new Titular(12345,"pepe");
		assertEquals(12345,titular.getCbu());
		assertEquals("pepe",titular.getNom());
		
		CuentaDeAhorro ca = new CuentaDeAhorro(666,0.0,titular);
		
		assertEquals(titular,ca.getTitular());
		assertEquals(666,ca.getNrodecuenta());
		assertEquals(0.0,ca.getSaldo());
		
		}
	
	
}
