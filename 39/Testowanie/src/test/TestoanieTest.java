package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import main.Testowanie;

class TestoanieTest {
	
	Testowanie t = new Testowanie();
	
	

	@Test
	void testDodawanie() {
		int x =2;
		int y =2;
		assertEquals(4, t.dodawanie(x, y));
	}
	@Test
	void testSprawdzZakresTrue() {
		int min = 3;
		int max =7;
		int liczba = 4;
		assertTrue(t.sprawdzZakres(min, max, liczba));
	}
	@Test
	void testSprawdzZakresFalse1() {
		int min = 3;
		int max =7;
		int liczba = 2;
		
		
		assertFalse(t.sprawdzZakres(min, max, liczba));
	}
		
		@Test
		@Disabled
		void testSprawdzZakresFalse2() {
			int min = 3;
			int max =7;
			int liczba = 9;
			
			assertFalse(t.sprawdzZakres(min, max, liczba));
			assertFalse(t.sprawdzZakres(min, max, liczba));
		

	}

}
