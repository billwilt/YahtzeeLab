
public class YahtzeeKata {

	public static void main(String[] args) {
		
	
		
		
		

	}
	
	public static int score(int[] dice, String cat) {
		int roll=0;
		if (cat.equals("Yahtzee")) {
				roll = scoreYahtzee(dice);
		} else if (cat.equals("Chance")) {
			roll = scoreChance(dice);
	} else if (cat.equals("fourOfAKind")) {
		roll = fourOfKind(dice);
} else if (cat.equals("threeOfAKind")) {
	roll = threeOfKind(dice);
}
		return roll;
	}
	
	private static int scoreYahtzee(int[] dice) {
		int roll = 0;
		int compare = dice[0];
		for (int i = 1; i < dice.length; i++) {
			if (compare != dice[i]) { 
				roll = 0;
			} else {
				roll = 50;
			}
		}
		
		return roll;
	}
	
	private static int scoreChance(int[] dice) {
		int chance = 0;
		int roll = 0;
		for (int j = 0; j < dice.length; j++) {
			chance = chance + dice[j];			
		} return roll = chance;
	}
	
	private static int fourOfKind(int[] dice) {
		int addItUp = 0;
		int roll = 0;
		int compare = dice[0];
		for (int i = 0; i < dice.length; i++) {
			if (compare == dice[i]) { 
				addItUp = addItUp + dice[i];
				roll = 0;
			} else {
				roll = addItUp;
			}
		}
		return roll;
	}
	
	private static int threeOfKind(int[] dice) {
		int addItUp = 0;
		int roll = 0;
		int compare = dice[0];
		for (int i = 0; i < dice.length; i++) {
			if (compare == dice[i]) { 
				addItUp = addItUp + dice[i];
				roll = 0;
			} else {
				roll = addItUp;
			}
		}
		return roll;
	}
	
	
}
