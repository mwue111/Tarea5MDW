package depuracionMDW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MDW_CalculadoraTest {

	private MDW_Calculadora calc = new MDW_Calculadora();
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}
	
	@Test
	void testCalculadora() {
		System.out.println("Casos de prueba de todos los métodos");
		assertEquals(8, calc.suma(3, 5));
		assertEquals(-2, calc.resta(3, 5));
		assertEquals(15, calc.multiplica(3, 5));
		assertEquals(3, calc.divide(15, 5));
	}
	
	@Test
	void testSuma() {
		System.out.println("Casos de prueba del método suma");
		assertEquals(2,calc.suma(1,1));
		assertNotEquals(3,calc.suma(1,1));
	}
	
	@Test
	void testResta() {
		int[] prueba = new int[10];
		for (int i = 0; i < prueba.length; i++) {
			prueba[i] = (int)(Math.random() * 10);
		}
		for (int i = 0; i < prueba.length; i++) {
			assertEquals(prueba[i] - prueba[i], calc.resta(prueba[i], prueba[i]));
		}	
	}
	
	@Test
	void testMultiplicacion() {
		int[] prueba = new int[10];
		for (int i = 0; i < prueba.length; i++) {
			prueba[i] = (int)(Math.random() * 10);
		}
		for (int i = 0; i < prueba.length; i++) {
			assertEquals(prueba[i] * prueba[i], calc.multiplica(prueba[i], prueba[i]));
		}
	}
	
	@Test
	public void testDivision() {
		System.out.println("Casos de prueba del método división");
		try {
		assertEquals(0, calc.divide(15, 0));
		} catch ( Exception e) {
			System.out.println("División por 0 producida");
		}
	}

}
