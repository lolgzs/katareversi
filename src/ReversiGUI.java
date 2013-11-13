
public class ReversiGUI {
	private String output = "";

	public void appendCell(Character cell) {
		this.output = this.output + cell.toString();
	}
	
	public String toString() {
		return this.output;
	}

	public void endRow() {
		this.output = this.output + "\n";		
	}

	public void appendTurn(String turn) {
		this.output = this.output + turn;		
	}

}
