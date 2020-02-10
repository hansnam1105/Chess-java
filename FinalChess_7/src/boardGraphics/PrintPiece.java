package boardGraphics;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import chessPiece.ChessPieceSprite;
import chessPiece.ImagePanel;
import chessPiece.ChessPieceSprite.ChessPieceSpriteType;

public class PrintPiece extends JFrame {

	//1vs1 체스말 출력
	public void PrintPiece1(JPanel squares[][]) {

		//Black PIECE
		//Pawn
		ImagePanel[] bPawn = new ImagePanel[8];
		for(int i = 0; i<8; i++){
			bPawn[i] = new ImagePanel();
			bPawn[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
			squares[1][i].setLayout(new BorderLayout());
			squares[1][i].add(bPawn[i], BorderLayout.CENTER);
		}

		//Rook
		ImagePanel[] bLook = new ImagePanel[2];
		for(int i = 0; i<2; i++) {
			bLook[i] = new ImagePanel();
			bLook[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
		}
		squares[0][0].setLayout(new BorderLayout());
		squares[0][0].add(bLook[0], BorderLayout.CENTER);
		squares[0][7].setLayout(new BorderLayout());
		squares[0][7].add(bLook[1], BorderLayout.CENTER);

		//Knight
		ImagePanel[] bKnight = new ImagePanel[2];
		for(int i = 0; i<2; i++) {
			bKnight[i] = new ImagePanel();
			bKnight[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
		}
		squares[0][1].setLayout(new BorderLayout());
		squares[0][1].add(bKnight[0], BorderLayout.CENTER);
		squares[0][6].setLayout(new BorderLayout());
		squares[0][6].add(bKnight[1], BorderLayout.CENTER);

		//Bishop
		ImagePanel[] bBishop = new ImagePanel[2];
		for(int i = 0; i<2; i++) {
			bBishop[i] = new ImagePanel();
			bBishop[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
		}
		squares[0][2].setLayout(new BorderLayout());
		squares[0][2].add(bBishop[0], BorderLayout.CENTER);
		squares[0][5].setLayout(new BorderLayout());
		squares[0][5].add(bBishop[1], BorderLayout.CENTER);

		//Queen
		ImagePanel bQueen = new ImagePanel();
		bQueen = new ImagePanel();
		bQueen.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
		squares[0][3].setLayout(new BorderLayout());
		squares[0][3].add(bQueen, BorderLayout.CENTER);

		//King
		ImagePanel bKing = new ImagePanel();
		bKing = new ImagePanel();
		bKing.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
		squares[0][4].setLayout(new BorderLayout());
		squares[0][4].add(bKing, BorderLayout.CENTER);







		//White PIECE
		//Pawn
		ImagePanel[] wPawn = new ImagePanel[8];
		for(int i = 0; i<8; i++){
			wPawn[i] = new ImagePanel();
			wPawn[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
			squares[6][i].setLayout(new BorderLayout());
			squares[6][i].add(wPawn[i], BorderLayout.CENTER);
		}

		//Rook
		ImagePanel[] wLook = new ImagePanel[2];
		for(int i = 0; i<2; i++) {
			wLook[i] = new ImagePanel();
			wLook[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
		}
		squares[7][0].setLayout(new BorderLayout());
		squares[7][0].add(wLook[0], BorderLayout.CENTER);
		squares[7][7].setLayout(new BorderLayout());
		squares[7][7].add(wLook[1], BorderLayout.CENTER);

		//Knight
		ImagePanel[] wKnight = new ImagePanel[2];
		for(int i = 0; i<2; i++) {
			wKnight[i] = new ImagePanel();
			wKnight[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
		}
		squares[7][1].setLayout(new BorderLayout());
		squares[7][1].add(wKnight[0], BorderLayout.CENTER);
		squares[7][6].setLayout(new BorderLayout());
		squares[7][6].add(wKnight[1], BorderLayout.CENTER);

		//Bishop
		ImagePanel[] wBishop = new ImagePanel[2];
		for(int i = 0; i<2; i++) {
			wBishop[i] = new ImagePanel();
			wBishop[i].setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
		}
		squares[7][2].setLayout(new BorderLayout());
		squares[7][2].add(wBishop[0], BorderLayout.CENTER);
		squares[7][5].setLayout(new BorderLayout());
		squares[7][5].add(wBishop[1], BorderLayout.CENTER);

		//Queen
		ImagePanel wQueen = new ImagePanel();
		wQueen = new ImagePanel();
		wQueen.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
		squares[7][3].setLayout(new BorderLayout());
		squares[7][3].add(wQueen, BorderLayout.CENTER);

		//King
		ImagePanel wKing = new ImagePanel();
		wKing = new ImagePanel();
		wKing.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
		squares[7][4].setLayout(new BorderLayout());
		squares[7][4].add(wKing, BorderLayout.CENTER);

	}


	//2vs2 체스말 출력
	public void PrintPiece2(JPanel squares2[][]) {
		//Pawn 출력
		for(int i = 3; i<11; i++)
		{
			ImagePanel Bishop1 = new ImagePanel();
			Bishop1.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
			squares2[12][i].setLayout(new BorderLayout());
			squares2[12][i].add(Bishop1, BorderLayout.CENTER);

			ImagePanel Bishop2 = new ImagePanel();
			Bishop2.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_PAWN));
			squares2[i][1].setLayout(new BorderLayout());
			squares2[i][1].add(Bishop2, BorderLayout.CENTER);

			ImagePanel Bishop3 = new ImagePanel();
			Bishop3.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
			squares2[1][i].setLayout(new BorderLayout());
			squares2[1][i].add(Bishop3, BorderLayout.CENTER);

			ImagePanel Bishop4 = new ImagePanel();
			Bishop4.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_PAWN));
			squares2[i][12].setLayout(new BorderLayout());
			squares2[i][12].add(Bishop4, BorderLayout.CENTER);

		}

		//White Piece
		ImagePanel Look = new ImagePanel();
		Look.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
		squares2[13][3].setLayout(new BorderLayout());
		squares2[13][3].add(Look, BorderLayout.CENTER);

		ImagePanel Look2 = new ImagePanel();
		Look2.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
		squares2[13][10].setLayout(new BorderLayout());
		squares2[13][10].add(Look2, BorderLayout.CENTER);

		ImagePanel knight = new ImagePanel();
		knight.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
		squares2[13][4].setLayout(new BorderLayout());
		squares2[13][4].add(knight, BorderLayout.CENTER);

		ImagePanel knight2 = new ImagePanel();
		knight2.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
		squares2[13][9].setLayout(new BorderLayout());
		squares2[13][9].add(knight2, BorderLayout.CENTER);

		ImagePanel bishop = new ImagePanel();
		bishop.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
		squares2[13][5].setLayout(new BorderLayout());
		squares2[13][5].add(bishop, BorderLayout.CENTER);

		ImagePanel bishop2 = new ImagePanel();
		bishop2.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
		squares2[13][8].setLayout(new BorderLayout());
		squares2[13][8].add(bishop2, BorderLayout.CENTER);

		ImagePanel queen = new ImagePanel();
		queen.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
		squares2[13][6].setLayout(new BorderLayout());
		squares2[13][6].add(queen, BorderLayout.CENTER);

		ImagePanel king = new ImagePanel();
		king.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
		squares2[13][7].setLayout(new BorderLayout());
		squares2[13][7].add(king, BorderLayout.CENTER);


		//Red Piece
		ImagePanel Look3 = new ImagePanel();
		Look3.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_LOOK));
		squares2[3][0].setLayout(new BorderLayout());
		squares2[3][0].add(Look3, BorderLayout.CENTER);

		ImagePanel Look4 = new ImagePanel();
		Look4.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_LOOK));
		squares2[10][0].setLayout(new BorderLayout());
		squares2[10][0].add(Look4, BorderLayout.CENTER);

		ImagePanel knight3 = new ImagePanel();
		knight3.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KNIGHT));
		squares2[4][0].setLayout(new BorderLayout());
		squares2[4][0].add(knight3, BorderLayout.CENTER);

		ImagePanel knight4 = new ImagePanel();
		knight4.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KNIGHT));
		squares2[9][0].setLayout(new BorderLayout());
		squares2[9][0].add(knight4, BorderLayout.CENTER);

		ImagePanel bishop3 = new ImagePanel();
		bishop3.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_BISHOP));
		squares2[5][0].setLayout(new BorderLayout());
		squares2[5][0].add(bishop3, BorderLayout.CENTER);

		ImagePanel bishop4 = new ImagePanel();
		bishop4.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_BISHOP));
		squares2[8][0].setLayout(new BorderLayout());
		squares2[8][0].add(bishop4, BorderLayout.CENTER);

		ImagePanel queen2 = new ImagePanel();
		queen2.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_QUEEN));
		squares2[7][0].setLayout(new BorderLayout());
		squares2[7][0].add(queen2, BorderLayout.CENTER);

		ImagePanel king2 = new ImagePanel();
		king2.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KING));
		squares2[6][0].setLayout(new BorderLayout());
		squares2[6][0].add(king2, BorderLayout.CENTER);       

		//Black Piece
		ImagePanel Look5 = new ImagePanel();
		Look5.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
		squares2[0][3].setLayout(new BorderLayout());
		squares2[0][3].add(Look5, BorderLayout.CENTER);

		ImagePanel Look6 = new ImagePanel();
		Look6.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
		squares2[0][10].setLayout(new BorderLayout());
		squares2[0][10].add(Look6, BorderLayout.CENTER);

		ImagePanel knight5 = new ImagePanel();
		knight5.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
		squares2[0][4].setLayout(new BorderLayout());
		squares2[0][4].add(knight5, BorderLayout.CENTER);

		ImagePanel knight6= new ImagePanel();
		knight6.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
		squares2[0][9].setLayout(new BorderLayout());
		squares2[0][9].add(knight6, BorderLayout.CENTER);

		ImagePanel bishop5 = new ImagePanel();
		bishop5.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
		squares2[0][5].setLayout(new BorderLayout());
		squares2[0][5].add(bishop5, BorderLayout.CENTER);

		ImagePanel bishop6 = new ImagePanel();
		bishop6.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
		squares2[0][8].setLayout(new BorderLayout());
		squares2[0][8].add(bishop6, BorderLayout.CENTER);

		ImagePanel queen3 = new ImagePanel();
		queen3.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
		squares2[0][7].setLayout(new BorderLayout());
		squares2[0][7].add(queen3, BorderLayout.CENTER);

		ImagePanel king3 = new ImagePanel();
		king3.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
		squares2[0][6].setLayout(new BorderLayout());
		squares2[0][6].add(king3, BorderLayout.CENTER);



		//Green Piece
		ImagePanel Look7 = new ImagePanel();
		Look7.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_LOOK));
		squares2[3][13].setLayout(new BorderLayout());
		squares2[3][13].add(Look7, BorderLayout.CENTER);

		ImagePanel Look8 = new ImagePanel();
		Look8.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_LOOK));
		squares2[10][13].setLayout(new BorderLayout());
		squares2[10][13].add(Look8, BorderLayout.CENTER);

		ImagePanel knight7 = new ImagePanel();
		knight7.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KNIGHT));
		squares2[4][13].setLayout(new BorderLayout());
		squares2[4][13].add(knight7, BorderLayout.CENTER);

		ImagePanel knight8 = new ImagePanel();
		knight8.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KNIGHT));
		squares2[9][13].setLayout(new BorderLayout());
		squares2[9][13].add(knight8, BorderLayout.CENTER);

		ImagePanel bishop7 = new ImagePanel();
		bishop7.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_BISHOP));
		squares2[5][13].setLayout(new BorderLayout());
		squares2[5][13].add(bishop7, BorderLayout.CENTER);

		ImagePanel bishop8 = new ImagePanel();
		bishop8.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_BISHOP));
		squares2[8][13].setLayout(new BorderLayout());
		squares2[8][13].add(bishop8, BorderLayout.CENTER);

		ImagePanel queen4 = new ImagePanel();
		queen4.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_QUEEN));
		squares2[6][13].setLayout(new BorderLayout());
		squares2[6][13].add(queen4, BorderLayout.CENTER);

		ImagePanel king4= new ImagePanel();
		king4.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KING));
		squares2[7][13].setLayout(new BorderLayout());
		squares2[7][13].add(king4, BorderLayout.CENTER);   




	}

}