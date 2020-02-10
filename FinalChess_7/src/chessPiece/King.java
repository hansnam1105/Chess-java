package chessPiece;

import java.awt.Color;

import boardGraphics.Board;
import control.GameEnd;

public class King extends Piece{


	GameEnd GameEnd=new GameEnd();

	public void possible(int cur_x, int cur_y, int piece_type) {
		int team = 2-(piece_type/16)%2;
		int enemy =  3 - team;

		if(Board.mode == 1) {
			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y-1<=2)||(cur_x-1<=2&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y-1] == 0) {
					Pos[cur_x-1][cur_y-1] = 1;
					Board.squares[cur_x-1][cur_y-1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x-1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y-1] = 1;
					Board.squares[cur_x-1][cur_y-1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y<=2)||(cur_x-1<=2&&cur_y>=11)||(cur_x-1>=11&&cur_y>=11)||(cur_x-1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y] == 0) {
					Pos[cur_x-1][cur_y] = 1;
					Board.squares[cur_x-1][cur_y].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x-1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y] = 1;
					Board.squares[cur_x-1][cur_y].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y+1<=2)||(cur_x-1<=2&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y+1] == 0) {
					Pos[cur_x-1][cur_y+1] = 1;
					Board.squares[cur_x-1][cur_y+1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x-1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y+1] = 1;
					Board.squares[cur_x-1][cur_y+1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y-1<=2)||(cur_x<=2&&cur_y-1>=11)||(cur_x>=11&&cur_y-1>=11)||(cur_x>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y-1] == 0) {
					Pos[cur_x][cur_y-1] = 1;
					Board.squares[cur_x][cur_y-1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y-1] = 1;
					Board.squares[cur_x][cur_y-1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y+1<=2)||(cur_x<=2&&cur_y+1>=11)||(cur_x>=11&&cur_y+1>=11)||(cur_x>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y+1] == 0) {
					Pos[cur_x][cur_y+1] = 1;
					Board.squares[cur_x][cur_y+1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y+1] = 1;
					Board.squares[cur_x][cur_y+1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y-1<=2)||(cur_x+1<=2&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y-1] == 0) {
					Pos[cur_x+1][cur_y-1] = 1;
					Board.squares[cur_x+1][cur_y-1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x+1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y-1] = 1;
					Board.squares[cur_x+1][cur_y-1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y<=2)||(cur_x+1<=2&&cur_y>=11)||(cur_x+1>=11&&cur_y>=11)||(cur_x+1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y] == 0) {
					Pos[cur_x+1][cur_y] = 1;
					Board.squares[cur_x+1][cur_y].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x+1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y] = 1;
					Board.squares[cur_x+1][cur_y].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y+1<=2)||(cur_x+1<=2&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y+1] == 0) {
					Pos[cur_x+1][cur_y+1] = 1;
					Board.squares[cur_x+1][cur_y+1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x+1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y+1] = 1;
					Board.squares[cur_x+1][cur_y+1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}
		}

		else if(Board.mode == 2) {
			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y-1<=2)||(cur_x-1<=2&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y-1] == 0) {
					Pos[cur_x-1][cur_y-1] = 1;
					Board.squares2[cur_x-1][cur_y-1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x-1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y-1] = 1;
					Board.squares2[cur_x-1][cur_y-1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y<=2)||(cur_x-1<=2&&cur_y>=11)||(cur_x-1>=11&&cur_y>=11)||(cur_x-1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y] == 0) {
					Pos[cur_x-1][cur_y] = 1;
					Board.squares2[cur_x-1][cur_y].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x-1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y] = 1;
					Board.squares2[cur_x-1][cur_y].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y+1<=2)||(cur_x-1<=2&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y+1] == 0) {
					Pos[cur_x-1][cur_y+1] = 1;
					Board.squares2[cur_x-1][cur_y+1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x-1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y+1] = 1;
					Board.squares2[cur_x-1][cur_y+1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y-1<=2)||(cur_x<=2&&cur_y-1>=11)||(cur_x>=11&&cur_y-1>=11)||(cur_x>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y-1] == 0) {
					Pos[cur_x][cur_y-1] = 1;
					Board.squares2[cur_x][cur_y-1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y-1] = 1;
					Board.squares2[cur_x][cur_y-1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y+1<=2)||(cur_x<=2&&cur_y+1>=11)||(cur_x>=11&&cur_y+1>=11)||(cur_x>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y+1] == 0) {
					Pos[cur_x][cur_y+1] = 1;
					Board.squares2[cur_x][cur_y+1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y+1] = 1;
					Board.squares2[cur_x][cur_y+1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y-1<=2)||(cur_x+1<=2&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y-1] == 0) {
					Pos[cur_x+1][cur_y-1] = 1;
					Board.squares2[cur_x+1][cur_y-1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x+1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y-1] = 1;
					Board.squares2[cur_x+1][cur_y-1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y<=2)||(cur_x+1<=2&&cur_y>=11)||(cur_x+1>=11&&cur_y>=11)||(cur_x+1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y] == 0) {
					Pos[cur_x+1][cur_y] = 1;
					Board.squares2[cur_x+1][cur_y].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x+1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y] = 1;
					Board.squares2[cur_x+1][cur_y].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y+1<=2)||(cur_x+1<=2&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y+1] == 0) {
					Pos[cur_x+1][cur_y+1] = 1;
					Board.squares2[cur_x+1][cur_y+1].setBackground(Color.GREEN);
				}
				else if((2-(loc[cur_x+1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y+1] = 1;
					Board.squares2[cur_x+1][cur_y+1].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}
		}

		Pos[cur_x][cur_y]=0;
	}


	public void possible2(int cur_x, int cur_y, int piece_type) {
		int team = 2-(piece_type/16)%2;
		int enemy =  3 - team;
		if(Board.mode == 1) {
			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y-1<=2)||(cur_x-1<=2&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y-1] == 0) {
					Pos[cur_x-1][cur_y-1] = 1;
				}
				else if((2-(loc[cur_x-1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y-1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y<=2)||(cur_x-1<=2&&cur_y>=11)||(cur_x-1>=11&&cur_y>=11)||(cur_x-1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y] == 0) {
					Pos[cur_x-1][cur_y] = 1;
				}
				else if((2-(loc[cur_x-1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y+1<=2)||(cur_x-1<=2&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y+1] == 0) {
					Pos[cur_x-1][cur_y+1] = 1;
				}
				else if((2-(loc[cur_x-1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y+1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y-1<=2)||(cur_x<=2&&cur_y-1>=11)||(cur_x>=11&&cur_y-1>=11)||(cur_x>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y-1] == 0) {
					Pos[cur_x][cur_y-1] = 1;
				}
				else if((2-(loc[cur_x][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y-1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y+1<=2)||(cur_x<=2&&cur_y+1>=11)||(cur_x>=11&&cur_y+1>=11)||(cur_x>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y+1] == 0) {
					Pos[cur_x][cur_y+1] = 1;
				}
				else if((2-(loc[cur_x][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y+1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y-1<=2)||(cur_x+1<=2&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y-1] == 0) {
					Pos[cur_x+1][cur_y-1] = 1;
				}
				else if((2-(loc[cur_x+1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y-1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y<=2)||(cur_x+1<=2&&cur_y>=11)||(cur_x+1>=11&&cur_y>=11)||(cur_x+1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y] == 0) {
					Pos[cur_x+1][cur_y] = 1;
				}
				else if((2-(loc[cur_x+1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y+1<=2)||(cur_x+1<=2&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y+1] == 0) {
					Pos[cur_x+1][cur_y+1] = 1;
				}
				else if((2-(loc[cur_x+1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y+1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}
		}

		else if(Board.mode == 2) {
			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y-1<=2)||(cur_x-1<=2&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1>=11)||(cur_x-1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y-1] == 0) {
					Pos[cur_x-1][cur_y-1] = 1;
				}
				else if((2-(loc[cur_x-1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y-1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y<=2)||(cur_x-1<=2&&cur_y>=11)||(cur_x-1>=11&&cur_y>=11)||(cur_x-1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y] == 0) {
					Pos[cur_x-1][cur_y] = 1;
				}
				else if((2-(loc[cur_x-1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x-1<=2&&cur_y+1<=2)||(cur_x-1<=2&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1>=11)||(cur_x-1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x-1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x-1][cur_y+1] == 0) {
					Pos[cur_x-1][cur_y+1] = 1;
				}
				else if((2-(loc[cur_x-1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x-1][cur_y+1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y-1<=2)||(cur_x<=2&&cur_y-1>=11)||(cur_x>=11&&cur_y-1>=11)||(cur_x>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y-1] == 0) {
					Pos[cur_x][cur_y-1] = 1;
				}
				else if((2-(loc[cur_x][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y-1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x<=2&&cur_y+1<=2)||(cur_x<=2&&cur_y+1>=11)||(cur_x>=11&&cur_y+1>=11)||(cur_x>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x][cur_y+1] == 0) {
					Pos[cur_x][cur_y+1] = 1;
				}
				else if((2-(loc[cur_x][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x][cur_y+1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y-1<=2)||(cur_x+1<=2&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1>=11)||(cur_x+1>=11&&cur_y-1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y-1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y-1] == 0) {
					Pos[cur_x+1][cur_y-1] = 1;
				}
				else if((2-(loc[cur_x+1][cur_y-1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y-1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y<=2)||(cur_x+1<=2&&cur_y>=11)||(cur_x+1>=11&&cur_y>=11)||(cur_x+1>=11&&cur_y<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y] == 0) {
					Pos[cur_x+1][cur_y] = 1;
				}
				else if((2-(loc[cur_x+1][cur_y]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}

			try   {
				if((Board.mode==2)&&((cur_x+1<=2&&cur_y+1<=2)||(cur_x+1<=2&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1>=11)||(cur_x+1>=11&&cur_y+1<=2)))
					throw new ArrayIndexOutOfBoundsException();
				if((Board.mode==1)&&((cur_x+1>=8)||(cur_y+1>=8)))
					throw new ArrayIndexOutOfBoundsException();
				if(loc[cur_x+1][cur_y+1] == 0) {
					Pos[cur_x+1][cur_y+1] = 1;
				}
				else if((2-(loc[cur_x+1][cur_y+1]/16)%2 == enemy)) {
					Pos[cur_x+1][cur_y+1] = 1;
				}

			}
			catch(ArrayIndexOutOfBoundsException e){}
		}

		Pos[cur_x][cur_y]=0;
	}
}