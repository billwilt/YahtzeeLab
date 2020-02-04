import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class YahtzeeKataTest {

	@Test
	void yahtzeeTestYes() {
		int[] arr = {6,6,6,6,6};
		String cat = "Yahtzee";
		assertEquals(50, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void yahtzeeTestNo() {
		int[] arr = {3,3,3,3,1};
		String cat = "Yahtzee";
		assertEquals(0, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void yahtzeeTest() {
		int[] arr = {1,1,1,1,1};
		String cat = "Yahtzee";
		assertEquals(50, YahtzeeKata.score(arr, cat));
	}

	@Test
	void chanceTest15Score() {
		int[] arr = {1,2,3,4,5};
		String cat = "Chance";
		assertEquals(15, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void chanceTest14Score() {
		int[] arr = {1,1,3,3,6};
		String cat = "Chance";
		assertEquals(14, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void chanceTest21Score() {
		int[] arr = {4,5,5,6,1};
		String cat = "Chance";
		assertEquals(21, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void fourOfAKindTestYes() {
		int[] arr = {3,3,3,3,1};
		String cat = "fourOfAKind";
		assertEquals(12, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void fourOfAKindTestNo() {
		int[] arr = {1,3,3,3,1};
		String cat = "fourOfAKind";
		assertEquals(0, YahtzeeKata.score(arr, cat));
	}
	
	@Test
	void threeOfAKindTestYes() {
		int[] arr = {3,3,3,1,1};
		String cat = "threeOfAKind";
		assertEquals(9, YahtzeeKata.score(arr, cat));
	}
	
	
	@Test
	void threeOfAKindTestNo() {
		int[] arr = {1,3,3,2,1};
		String cat = "threeOfAKind";
		assertEquals(0, YahtzeeKata.score(arr, cat));
	}
	

}
