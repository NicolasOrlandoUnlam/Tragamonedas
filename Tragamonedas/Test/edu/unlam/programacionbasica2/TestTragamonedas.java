package edu.unlam.programacionbasica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	
	public void testTragamonedas() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
	}
	
	@Test
	
	public void testPremio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		while(miTragamonedas.entregaPremio() == false){
			miTragamonedas.activar();
		}
		if(miTragamonedas.entregaPremio() == true){
			
		}
	}
}
