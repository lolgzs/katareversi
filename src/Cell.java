
public class Cell {

	private Character cell;
	private Cell previousCell;
	private Cell nextCell;

	public Cell(Character cell) {
		this.cell = cell;
	}

	public Cell(Character cell, Cell previousCell) {
		this.cell = cell;
		this.previousCell = previousCell;
		if (previousCell != null)
			previousCell.nextCell = this;
	}

	public void printLegalMoveOn(ReversiGUI gui) {		
		if (this.isEmpty() && this.shouldAddLegalMove()) {
			gui.appendCell('0');
			return;
		}
		
		gui.appendCell(this.cell);
	}

	private boolean shouldAddLegalMove() {
		return (this.previousCellIs('B') && this.previousCellsContains('W'))
			|| (this.nextCellIs('B') && this.nextCellsContains('W'));
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
	
	private boolean nextCellsContains(char c) {
		if (null == this.nextCell)
			return false;
		if (this.nextCellIs(c))
			return true;
		return this.nextCell.nextCellsContains(c);
	}

	private boolean nextCellIs(char c) {
		if (null == this.nextCell)
			return false;
		return this.nextCell.is(c);
	}

	private boolean is(char c) {
		return this.cell == c;
	}

}
