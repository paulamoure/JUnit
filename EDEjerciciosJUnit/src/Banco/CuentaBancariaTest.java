package Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	CuentaBancaria cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new CuentaBancaria(1500,"1234");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDepositar1() {
		int resultadoEsperado = 1800;
		int resultadoReal = cuenta.depositar(300);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	@Test
	void testDepositar2() {
		assertEquals(-1, cuenta.depositar(-20));
		
	}
	@Test
	void testRetirar1() {
		assertEquals(1300,cuenta.retirar(200, "1234"));
	}
	@Test
	void testRetirar2() {
		assertEquals(-1,cuenta.retirar(5000, "1234"));
	}
	@Test
	void testRetirar3() {
		assertEquals(-2,cuenta.retirar(200, "4321"));
	}
	@Test
	void testPasswordCorrecta() {
		assertTrue(cuenta.passwordCorrecta("1234"));
	}
	@Test
	void testPasswordFalsa() {
		assertFalse(cuenta.passwordCorrecta("2000"));
	}

}
