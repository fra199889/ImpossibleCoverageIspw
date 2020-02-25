package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.RandomNumberCheck;

public class TestRandomNumberCheck {
	@Test
	public void TestRandomGenerator() {
		RandomNumberCheck checker=new RandomNumberCheck();
	for(int i=0;i<10;i++) {
		
	
		int res=checker.randomGeneratorFunctionCheck();
		assertEquals(1,res);   /*voglio verificare che ,se esce un numero pari all'inizio,la funzione specialFunction viene effettivamente invocata e il programma reitera finchè non esce un dipsari,invece se esce dispari,il programma termina.
		in realtà potrebbe non uscire mai un iniziale numero pari,di conseguenza potrei dover fare infinite prove.Di conseguenza,come vediamo,non possiamo mai arrivare al 100% di coverage certa*/
	}}
}
