import java.util.ArrayList;


public class Rows {
	private ArrayList<Row> rows = new ArrayList<Row>();

	public Rows(String input) {
		String[] lines = input.split("\n");
		
		for (int i = 0; i < lines.length - 1; i++)
			this.rows.add(new Row(lines[i]));
	}

	
	public void printLegalMovesOn(ReversiGUI gui) {
		for(Row row : this.rows)
			row.printLegalMovesOn(gui);
	}

}
