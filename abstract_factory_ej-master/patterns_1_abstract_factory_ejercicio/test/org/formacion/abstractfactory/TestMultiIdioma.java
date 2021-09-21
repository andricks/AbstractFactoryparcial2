package org.formacion.abstractfactory;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
 
public  class TestMultiIdioma implements factory {

	
	@Test
	public void test_es() {
		
		factory Es = new factoryEs();
		Preguntas preguntas = Es.getpreguntas();
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = Es.getsaludos();
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());

	}
	@Test
	public void test_en() {
		factory En = new factoryEn();
		
		Preguntas preguntas = En.getpreguntas();
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );

		
		Saludos saludos = En.getsaludos();
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
		
	}
	@Override
	public Preguntas getpreguntas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Saludos getsaludos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}


