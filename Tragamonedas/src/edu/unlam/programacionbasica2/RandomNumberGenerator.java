package edu.unlam.programacionbasica2;

public class RandomNumberGenerator implements NumberGenerator{
	
	@Override
	public Integer generate() {
		
		return (int)(Math.random()*10+1);
	}

}
