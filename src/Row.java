
public class Row {
	private String inputRow;

	public Row(String row) {
		this.inputRow = row;
	}

	public void printLegalMovesOn(ReversiGUI gui) {
		Cell cell = null;
		Cell[] cells = new Cell[this.inputRow.length()];
		
		for (int i = 0; i < this.inputRow.length(); i++) {
			cell = new Cell(this.inputRow.charAt(i), cell);
			cells[i] = cell;
		}
		
		for (int i = 0; i < cells.length; i++) {
			cells[i].printLegalMoveOn(gui);
		}
		
		gui.endRow();
	}

}
