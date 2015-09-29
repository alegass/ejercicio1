package Cronometro;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.Cronometro.Cronometro;

public class CronometroTest {
	@Test
	public void testCronometro(){
		Cronometro cronometro = new Cronometro();
		assertEquals("A test for Cronometro String", "Cronometro", cronometro.iniciarCronometro());
	}
}
