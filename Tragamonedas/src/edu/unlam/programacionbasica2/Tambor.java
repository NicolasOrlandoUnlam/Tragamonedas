package edu.unlam.programacionbasica2;

public class Tambor {
private Integer posicion;
	
	public Tambor(NumberGenerator generator) {
		this.posicion=generator.generate();
	}
	
	public Integer getPosicion() {
		return this.posicion;
	}
	
	public void girar() {
		RandomNumberGenerator aleatorio = new RandomNumberGenerator();
		this.posicion=aleatorio.generate();
	}
}

