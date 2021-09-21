package org.formacion.abstractfactory;

public class factoryEn implements factory {
	@Override
	public Preguntas getpreguntas() { return new PreguntasEn(); }

	@Override
	public Saludos getsaludos(){return new SaludosEn();}
}
