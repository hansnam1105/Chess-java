package boardGraphics;


import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import chessPiece.Location;
import control.Tile2;

public class SetBoardGraphic2 extends JFrame {

	
	public SetBoardGraphic2() {
		Board.mode=2;
		Location.setArray(Board.mode);
		Board.board = new JFrame("CHESS 2vs2");
		Board.board.setSize(700, 700);
		Board.board.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Board.board.setLocationRelativeTo(null);


		JPanel CHBoard = new JPanel(new GridLayout(14,14));
		for (int i = 0; i < Board.squares2.length; i++) {
			for (int j = 0; j < Board.squares2[i].length; j++) {
				Board.squares2[i][j] = new Tile2(i,j);


			}
		} 
		Board.board.setResizable(false);
		Board.board.setVisible(true);


		for (int i = 0; i<14; i++) {
			for (int j = 0; j<14; j++) {
				CHBoard.add(Board.squares2[i][j]);
				Board.squares2[i][j].setLayout(null);
			}
		}
		Board.board.add(CHBoard);

		PrintPiece printpiece2 = new PrintPiece();
		printpiece2.PrintPiece2(Board.squares2);
	}
}