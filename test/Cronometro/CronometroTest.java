package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.Cronometro.Cronometro;

public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		Cronometro cronometro = new Cronometro();
		assertEquals("A test for Hello World String", "Hello World", cronometro.iniciarCronometro());
	}
}
