package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	void CP1() {
		assertEquals(RockPaperScissors.checkGame("Rock", "Rock"),"It's a tie!");
	}
	
	@Test
	void CP2() {
		assertEquals(RockPaperScissors.checkGame("Rock", "Scissors"),"You win this round!");
	}
	
	@Test
	void CP3() {
		assertEquals(RockPaperScissors.checkGame("Scissors", "Paper"),"You win this round!");
	}
	
	@Test
	void CP4() {
		assertEquals(RockPaperScissors.checkGame("Scissors", "Rock"),"Computer wins this round!");
	}



}
