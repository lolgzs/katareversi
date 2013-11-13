
public class Row {
	private String inputRow;

	public Row(String row) {
		this.inputRow = row;
	}

	public void printLegalMovesOn(ReversiGUI gui) {
		Cell cell = null;
		
		for (int i = 0; i < this.inputRow.length(); i++) {
			cell = new Cell(this.inputRow.charAt(i), cell);
			cell.printLegalMoveOn(gui);
		}
		
		gui.endRow();
	}

}
