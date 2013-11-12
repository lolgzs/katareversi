import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class InitialBoardTurnToBlackTest {
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
//        		{ 	"........\n" +
//        			"........\n" +
//        			"........\n" +
//        			"...BW...\n" +
//        			"...WB...\n" +
//        			"........\n" +
//        			"........\n" +
//        			"........\n" +
//        			"B",
//        			
//        			"........\n" +
//        			"........\n" +
//        			"....0...\n" +
//        			"...BW0..\n" +
//        			"..0WB...\n" +
//        			"...0....\n" +
//        			"........\n" +
//        			"........\n" +
//        			"B" },
//        			
//        			
//        			
//        			
//               	{ 	"........\n" +
//                	"........\n" +
//                	"........\n" +
//                	"...BW...\n" +
//                	"...WB...\n" +
//                	"........\n" +
//                	"........\n" +
//                	"........\n" +
//                	"W",
//                			
//                	"........\n" +
//                	"........\n" +
//                	"...0....\n" +
//                	"..0BW...\n" +
//                	"...WB0..\n" +
//                	"....0...\n" +
//                	"........\n" +
//                	"........\n" +
//                	"W" },
        			
        		{ 	"........\nB",
        			"........\nB"
        		},
        		
        		{ 	"........\nW",
        			"........\nW"
        		},
        		
        		{ 	"..WB....\nW",
        			"..WB0...\nW"
        		}
           });
    }
    
    
    @Parameter 
    public String boardInput;

    @Parameter (value=1)
    public String boardOutputExpected;
    
    @Test
    public void printLegalMovesShouldAnswerLegalMovesFromInput() {
    	Reversi reversi = new Reversi(); 
		assertEquals(this.boardOutputExpected, reversi.printLegalMoves(this.boardInput));
    }
}
