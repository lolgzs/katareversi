
public class Row {

	private String inputRow;
	private boolean shouldAddLegalMove;

	public Row(String row) {
		this.inputRow = row;
	}

	public void printLegalMovesOn(ReversiGUI gui) {
		this.shouldAddLegalMove = false;

		Cell cell = new Cell(this.inputRow.charAt(0));
		cell.printLegalMoveOn(gui);
	//	gui.appendCell(this.inputRow.charAt(0));
		for (int i = 1; i < this.inputRow.length(); i++) {
			cell = new Cell(this.inputRow.charAt(i), cell);
			cell.printLegalMoveOn(gui);
		//	this.printCellOn(this.inputRow.charAt(i), gui);
		}
		
		gui.endRow();
	}

	
	private void printCellOn(Character cell, ReversiGUI gui) {
		if ('W' == cell)
			shouldAddLegalMove = true;
		
		if (('.' == cell) && shouldAddLegalMove) {
			shouldAddLegalMove = false;
			gui.appendCell('0');
			return;
		}
		
		gui.appendCell(cell);
	}

}
