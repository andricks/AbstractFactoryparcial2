package org.formacion.abstractfactory;

public class factoryEs implements factory {

	@Override
	public Preguntas getpreguntas() { return new PreguntasEs(); }


	@Override
	public Saludos getsaludos(){return new SaludosEs();}


}
