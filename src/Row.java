
public class Row {

	private String inputRow;

	public Row(String row) {
		this.inputRow = row;
	}

	public void printLegalMovesOn(ReversiGUI gui) {
		Boolean shouldAddLegalMove = false;
		
		for (int i = 0; i < this.inputRow.length(); i++) {
			Character cell = this.inputRow.charAt(i);
			
			if ('W' == cell)
				shouldAddLegalMove = true;
			
			if (('.' == cell) && shouldAddLegalMove) {
				shouldAddLegalMove = false;
				gui.appendCell('0');
				continue;
			}
			
			gui.appendCell(cell);
		}
		gui.endRow();
	}

}
