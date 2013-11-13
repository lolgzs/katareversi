
public class Reversi {
	public String printLegalMoves(String input) {
		Rows rows = new Rows(input);
		ReversiGUI gui = new ReversiGUI();
		
		rows.printLegalMovesOn(gui);
		gui.appendTurn(this.getTurn(input));
		
		return gui.toString();
	}

	
	private String getTurn(String input) {
		return String.valueOf(input.charAt(input.length() - 1));
	}
}
