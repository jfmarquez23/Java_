package com.marquez.logica;

public class Charmander extends Pokemon implements IFuego {

	public Charmander() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Charmander y este es mi ataque Placaje ");

	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Charmander y este es mi ataque Arañazo ");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Charmander y este es mi ataque Mordisco ");

	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Hola soy Charmander y este es mi ataque Puño Fuego ");

	}

	@Override
	public void atacarLanzaLlamas() {
		System.out.println("Hola soy Charmander y este es mi ataque Lanza Llamas ");

	}

	@Override
	public void atacarAscuas() {
		System.out.println("Hola soy Charmander y este es mi ataque Ascuas ");

	}

}
