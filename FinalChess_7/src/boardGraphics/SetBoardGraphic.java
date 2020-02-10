package boardGraphics;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import chessPiece.Location;
import control.Tile;

public class SetBoardGraphic extends JFrame{

	
	public SetBoardGraphic() {

		Board.board = new JFrame("CHESS 1vs1");
		Board.mode=1;
		Location.setArray(Board.mode);
		Board.board.setSize(640,640);
		Board.board.setDefaultCloseOperation(Board.board.EXIT_ON_CLOSE);
		Board.board.setLocationRelativeTo(null);

		JPanel CHBoard = new JPanel(new GridLayout(8, 8));
		for (int i = 0; i < Board.squares.length; i++) {
			for (int j = 0; j < Board.squares[i].length; j++) {            
				Board.squares[i][j] = new Tile(i,j);      

			}
		}
		Board.board.setResizable(false);
		Board.board.setVisible(true);


		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				CHBoard.add(Board.squares[i][j]);
				Board.squares[i][j].setLayout(null);
			}
		}
		Board.board.add(CHBoard);

		PrintPiece printpiece = new PrintPiece();
		printpiece.PrintPiece1(Board.squares);


	}
}