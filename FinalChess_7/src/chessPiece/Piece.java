package chessPiece;

import java.awt.BorderLayout;
import java.awt.Color;

import boardGraphics.Board;
import chessPiece.ChessPieceSprite;
import chessPiece.ImagePanel;
import chessPiece.ChessPieceSprite.ChessPieceSpriteType;
import control.GameEnd;

public abstract class Piece extends Location implements InterfacePiece{


	public static void move(int cur_x, int cur_y, int after_x, int after_y, int piece_type) {
		loc[cur_x][cur_y] = 0;
		Board.temp = new ImagePanel();
		if(piece_type%0x10>=8&&piece_type%0x10<=15) {

			if(piece_type/16 ==2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}



			loc[after_x][after_y] = piece_type;
		}


		if(piece_type%0x10==0||piece_type%0x10==7) {

			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}   

			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			loc[after_x][after_y] = piece_type;
		}


		if(piece_type%0x10==1||piece_type%0x10==6) {

			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==2||piece_type%0x10==5) {
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==4) {
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==3) {
			if(piece_type/16 == 2) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			else if(piece_type/16 == 1) {
				Board.squares[cur_x][cur_y].removeAll();
				Board.squares[cur_x][cur_y].revalidate();
				Board.squares[cur_x][cur_y].repaint();
				Board.squares[after_x][after_y].removeAll();
				Board.squares[after_x][after_y].revalidate();
				Board.squares[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
				Board.squares[after_x][after_y].setLayout(new BorderLayout());
				Board.squares[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}

			loc[after_x][after_y] = piece_type;
		}





	}


	public static void move2(int cur_x, int cur_y, int after_x, int after_y, int piece_type) {
		loc[cur_x][cur_y] = 0;
		Board.temp = new ImagePanel();
		if(piece_type%0x10>=8 && piece_type%0x10<=15) {
			if(piece_type/16 == 1) {
				//Èò»ö
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			else if(piece_type/16 == 2) {
				//»¡°­
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_PAWN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 3) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 4) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_PAWN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==0||piece_type%0x10==7) {
			if(piece_type/16 == 1) {
				//Èò»ö
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			else if(piece_type/16 == 2) {
				//»¡°­
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_LOOK));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 3) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 4) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_LOOK));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}

			loc[after_x][after_y] = piece_type;

		}

		if(piece_type%0x10==1||piece_type%0x10==6) {
			if(piece_type/16 == 1) {
				//Èò»ö
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			else if(piece_type/16 == 2) {
				//»¡°­
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KNIGHT));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 3) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 4) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KNIGHT));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==2||piece_type%0x10==5) {
			if(piece_type/16 == 1) {
				//Èò»ö
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			else if(piece_type/16 == 2) {
				//»¡°­
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_BISHOP));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 3) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 4) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_BISHOP));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==4) {
			if(piece_type/16 == 1) {
				//Èò»ö
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			else if(piece_type/16 == 2) {
				//»¡°­
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_KING));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 3) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 4) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KING));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}

			loc[after_x][after_y] = piece_type;
		}

		if(piece_type%0x10==3) {
			if(piece_type/16 == 1) {
				//Èò»ö
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);
			}
			else if(piece_type/16 == 2) {
				//»¡°­
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_QUEEN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 3) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}
			else if(piece_type/16 == 4) {
				Board.squares2[cur_x][cur_y].removeAll();
				Board.squares2[cur_x][cur_y].revalidate();
				Board.squares2[cur_x][cur_y].repaint();
				Board.squares2[after_x][after_y].removeAll();
				Board.squares2[after_x][after_y].revalidate();
				Board.squares2[after_x][after_y].repaint();
				Board.temp.setImage(ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_QUEEN));
				Board.squares2[after_x][after_y].setLayout(new BorderLayout());
				Board.squares2[after_x][after_y].add(Board.temp,BorderLayout.CENTER);

			}

			loc[after_x][after_y] = piece_type;
		}


	}






	public static void limit_possible(int cur_x, int cur_y, int piece_type) {
		int team=piece_type/0x10;
		int ck;
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if(Pos[i][j]==1)
				{
					int temp = loc[i][j];
					loc[i][j] = piece_type;
					loc[cur_x][cur_y] = 0;
					ck = GameEnd.check(team);
					if(ck == 1) {
						Pos[i][j] = 0;
						if((i+j)%2 !=0) 
							Board.squares[i][j].setBackground(Color.LIGHT_GRAY); 

						else
							Board.squares[i][j].setBackground(Color.white);
					}      


					loc[cur_x][cur_y] = piece_type;
					loc[i][j] = temp;

				}
			}
		}
	}



	public static void limit_possible2(int cur_x, int cur_y, int piece_type) {
		int team=piece_type/0x10;
		int ck;
		for(int i=0;i<14;i++)
		{
			for(int j=0;j<14;j++)
			{
				if(Pos[i][j]==1)
				{
					int temp = loc[i][j];
					loc[i][j] = piece_type;
					loc[cur_x][cur_y] = 0;
					ck = GameEnd.check2(team);
					if(ck == 1) {
						Pos[i][j] = 0;

						if((i+j)%2 !=0) {
							Board.squares2[i][j].setBackground(Color.LIGHT_GRAY); 
						}
						else
							Board.squares2[i][j].setBackground(Color.white);
					}      
					loc[cur_x][cur_y] = piece_type;
					loc[i][j] = temp;


				}
			}
		}
	}
}