package withsaga;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.game.test.witchsaga.MyStatsApp;

class TestMyStatsApp {
	
	private MyStatsApp myStatsApp;

	@Test
	public void run() {
		myStatsApp = new MyStatsApp();
		int ageOfDeath1 = 10;
		int yearOfDeath1 = 12;
		int ageOfDeath2 = 13;
		int yearOfDeath2 = 17;
		
		assertEquals(2, yearOfDeath1-ageOfDeath1);
		assertEquals(4, yearOfDeath2-ageOfDeath2);
		
		int numPeopleKill1 = callFibonacci(2);
		int numPeopleKill2 = callFibonacci(4);
		
		/*
		 * Person A born on Year = 12 – 10 = 2, number of people killed on year 2 is 2.
		 * Person B born on Year = 17 – 13 = 4, number of people killed on year 4 is 7
		 */
		
		assertEquals(2, numPeopleKill1);
		assertEquals(7, numPeopleKill2);
		
		Double divider = 2.0; //number of total players
		Double average = (numPeopleKill1+numPeopleKill2)/divider;
		Double res = 4.5;
		
		assertEquals(res, average);
		
	}

    @Test
    public int callFibonacci(int i) {
        int testIndex = 2;
        int expectedResult = 2;
        
        assertEquals(expectedResult, myStatsApp.callFibonacci(testIndex));
        
        return myStatsApp.callFibonacci(i);
    }
}
