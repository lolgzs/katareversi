import static org.junit.Assert.*;

import org.junit.Test;


public class InitialBoardTurnToBlackTest {

	@Test
	public void legalMovesShouldAnswerStringWithLegalPositionsForBlack() {
		String input = 	""+
				"........\n" +
				"........\n" +
				"........\n" +
				"...BW...\n" +
				"...WB...\n" +
				"........\n" +
				"........\n" +
				"........\n" +
				"B";

		String output =	""+
				"........\n" +
				"........\n" +
				"....0...\n" +
				"...BW0..\n" +
				"..0WB...\n" +
				"...0....\n" +
				"........\n" +
				"........\n" +
				"B";
		Reversi reversi = new Reversi(); 
		assertEquals(output, reversi.printLegalMoves(input));
	}
	
	@Test
	public void legalMovesShouldAnswerStringWithLegalPositionsForWhite() {
		String input = 	
				"........\n" +
				"........\n" +
				"........\n" +
				"...BW...\n" +
				"...WB...\n" +
				"........\n" +
				"........\n" +
				"........\n" +
				"W";

		String output =	
				"........\n" +
				"........\n" +
				"...0....\n" +
				"..0BW...\n" +
				"...WB0..\n" +
				"....0...\n" +
				"........\n" +
				"........\n" +
				"W";
		Reversi reversi = new Reversi(); 
		assertEquals(output, reversi.printLegalMoves(input));
	}


}
