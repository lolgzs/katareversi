
public class Reversi {
	public String printLegalMoves(String input) {
		String[] inputRows = input.split("\n");
		ReversiGUI gui = new ReversiGUI();
		
		for (int i = 0; i < inputRows.length - 1; i++) {
			Row row = new Row(inputRows[i]);
			row.printOn(gui);
		}
		
		gui.appendTurn(this.getTurn(input));
		return gui.toString();
	}

	
	private String getTurn(String input) {
		return String.valueOf(input.charAt(input.length() - 1));
	}
}
