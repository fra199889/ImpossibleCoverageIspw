package logic;

import java.util.Random;

public class RandomNumberCheck {
	
	
	public int randomGeneratorFunctionCheck() {
		
		
		Integer casualNumber = getRandomNumberInRange(1,100000);
		System.out.println(casualNumber.toString());
		
		
			
		
		if(casualNumber%2==0) {
			System.out.println("check numero pari eseguito");
			specialFunction();
			return 1;}
			
			
			
		else {
			System.out.println("check numero dispari eseguito");
			return 0;
		}
		
	
    
}
	
	public void specialFunction() {
		System.out.println("funzione eseguida");
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		/*if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}*/

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
