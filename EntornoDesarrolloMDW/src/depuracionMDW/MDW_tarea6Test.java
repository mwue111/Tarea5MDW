package depuracionMDW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MDW_tarea6Test {
	
	@Test
	void testEj1() {
		assertEquals(4, MDW_tarea6.ej1(0, 1, 1)); 
		assertEquals(4, MDW_tarea6.ej1(2, 4, 6)); 
		assertEquals(4, MDW_tarea6.ej1(2, 6, 5)); 
		assertEquals(6, MDW_tarea6.ej1(2, 6, 1)); 
	}

	
	@Test
	void testEj2() {
		assertEquals(4, MDW_tarea6.ej2(0, 1, 3));
		assertEquals(6, MDW_tarea6.ej2(2, 4, 6));
		assertEquals(6, MDW_tarea6.ej2(2, 6, 5));
		assertEquals(6, MDW_tarea6.ej2(2, 6, 1));
	}
	
	@Test
	void testEj5() {
		assertEquals(5, MDW_tarea6.ej5(5, 5));
		assertEquals(1, MDW_tarea6.ej5(6, 5));
		assertEquals(1, MDW_tarea6.ej5(5, 6));
	}
	
	
	@Test
	void testEj6() {
		assertEquals(-1, MDW_tarea6.ej6(0, 6, 5));
		assertEquals(1, MDW_tarea6.ej6(6, 5, 6));
		assertEquals(0, MDW_tarea6.ej6(9 , 5, 8));
		assertEquals(-1, MDW_tarea6.ej6(5, 6, 6));
	}
	

	@Test
	void testEj8() {
		assertEquals(0, MDW_tarea6.ej8(1, -1));
		assertEquals(2, MDW_tarea6.ej8(3, 5));
		assertEquals(1, MDW_tarea6.ej8(3, 0));
	}
}
