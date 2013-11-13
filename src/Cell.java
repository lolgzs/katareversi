
public class Cell {

	private Character cell;
	private Cell previousCell;

	public Cell(Character cell) {
		this.cell = cell;
	}

	public Cell(Character cell, Cell previousCell) {
		this.cell = cell;
		this.previousCell = previousCell;
	}

	public void printLegalMoveOn(ReversiGUI gui) {		
		if (this.isEmpty() && this.shouldAddLegalMove()) {
			gui.appendCell('0');
			return;
		}
		
		gui.appendCell(this.cell);
	}

	private boolean shouldAddLegalMove() {
		return this.previousCellIs('B') && this.previousCellsContains('W');
	}

	private boolean isEmpty() {
		return '.' == this.cell;
	}

	private boolean previousCellsContains(char c) {
		if (null == this.previousCell)
			return false;
		if (this.previousCellIs(c))
			return true;
		return this.previousCell.previousCellsContains(c);
	}

	private boolean previousCellIs(char c) {
		if (null == this.previousCell)
			return false;
		return this.previousCell.is(c);
	}

	private boolean is(char c) {
		return this.cell == c;
	}

}
