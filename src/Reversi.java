
public class Reversi {
	public String printLegalMoves(String input) {
		String[] inputRows = input.split("\n");
		String outputRows = "";
		
		for (int i = 0; i < inputRows.length - 1; i++) {
			outputRows = outputRows + this.injectLegalMovesForRow(inputRows[i]) + "\n";
		}
		
		return outputRows + this.getTurn(input);
	}

	
	private String getTurn(String input) {
		return String.valueOf(input.charAt(input.length() - 1));
	}


	private String injectLegalMovesForRow(String row) {
		Boolean shouldAddLegalMove = false;
		String resultRow = "";
		
		for (int i = 0; i < row.length(); i++) {
			Character cell = row.charAt(i);
			Character resultCell = cell;
			
			if ('W' == cell)
				shouldAddLegalMove = true;
			
			if (('.' == cell) && shouldAddLegalMove) {
				shouldAddLegalMove = false;
				resultCell = '0';
			}
			
			resultRow = resultRow + resultCell.toString();
		}
		return resultRow;
	}

}
