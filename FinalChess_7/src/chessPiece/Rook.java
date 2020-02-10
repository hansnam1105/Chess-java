package chessPiece;

import java.awt.Color;

import boardGraphics.Board;

public class Rook extends Piece {


	public void possible(int cur_x, int cur_y, int piece_type) {
		int team=2-(piece_type/0x10)%2;
		int enemy =  3 - team;
		int a, b, c, d;

		if(Board.mode == 1) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++){
					if((Board.mode==2)&&((a<=2&&cur_y<=2)||(a<=2&&cur_y>=11)||(a>=11&&cur_y>=11)||(a>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][cur_y]=1;
					Board.squares[a][cur_y].setBackground(Color.GREEN);
				}

				if(2-(loc[a][cur_y]/0x10)%2==enemy) {
					Pos[a][cur_y]=1;
					Board.squares[a][cur_y].setBackground(Color.RED);
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x-1;loc[b][cur_y]==0;b--) {
					if((Board.mode==2)&&((b<=2&&cur_y<=2)||(b<=2&&cur_y>=11)||(b>=11&&cur_y>=11)||(b>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][cur_y]=1;
					Board.squares[b][cur_y].setBackground(Color.GREEN);
				}

				if(2-(loc[b][cur_y]/0x10)%2==enemy) {
					Pos[b][cur_y]=1;
					Board.squares[b][cur_y].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_y+1;loc[cur_x][c]==0;c++){
					if((Board.mode==2)&&((cur_x<=2&&c<=2)||(cur_x<=2&&c>=11)||(cur_x>=11&&c>=11)||(cur_x>=11&&c<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][c]=1;
					Board.squares[cur_x][c].setBackground(Color.GREEN);
				}

				if(2-(loc[cur_x][c]/0x10)%2==enemy) {
					Pos[cur_x][c]=1;
					Board.squares[cur_x][c].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_y-1;loc[cur_x][d]==0;d--) {
					if((Board.mode==2)&&((cur_x<=2&&d<=2)||(cur_x<=2&&d>=11)||(cur_x>=11&&d>=11)||(cur_x>=11&&d<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][d]=1;
					Board.squares[cur_x][d].setBackground(Color.GREEN);
				}      
				if(2-(loc[cur_x][d]/0x10)%2==enemy) {
					Pos[cur_x][d]=1;
					Board.squares[cur_x][d].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}
		else if(Board.mode == 2) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++){
					if((Board.mode==2)&&((a<=2&&cur_y<=2)||(a<=2&&cur_y>=11)||(a>=11&&cur_y>=11)||(a>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][cur_y]=1;
					Board.squares2[a][cur_y].setBackground(Color.GREEN);
				}

				if(2-(loc[a][cur_y]/0x10)%2==enemy) {
					Pos[a][cur_y]=1;
					Board.squares2[a][cur_y].setBackground(Color.RED);
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x-1;loc[b][cur_y]==0;b--) {
					if((Board.mode==2)&&((b<=2&&cur_y<=2)||(b<=2&&cur_y>=11)||(b>=11&&cur_y>=11)||(b>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][cur_y]=1;
					Board.squares2[b][cur_y].setBackground(Color.GREEN);
				}

				if(2-(loc[b][cur_y]/0x10)%2==enemy) {
					Pos[b][cur_y]=1;
					Board.squares2[b][cur_y].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_y+1;loc[cur_x][c]==0;c++){
					if((Board.mode==2)&&((cur_x<=2&&c<=2)||(cur_x<=2&&c>=11)||(cur_x>=11&&c>=11)||(cur_x>=11&&c<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][c]=1;
					Board.squares2[cur_x][c].setBackground(Color.GREEN);
				}

				if(2-(loc[cur_x][c]/0x10)%2==enemy) {
					Pos[cur_x][c]=1;
					Board.squares2[cur_x][c].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_y-1;loc[cur_x][d]==0;d--) {
					if((Board.mode==2)&&((cur_x<=2&&d<=2)||(cur_x<=2&&d>=11)||(cur_x>=11&&d>=11)||(cur_x>=11&&d<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][d]=1;
					Board.squares2[cur_x][d].setBackground(Color.GREEN);
				}      
				if(2-(loc[cur_x][d]/0x10)%2==enemy) {
					Pos[cur_x][d]=1;
					Board.squares2[cur_x][d].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}


	}
	public void possible2(int cur_x, int cur_y, int piece_type) {
		int team=2-(piece_type/0x10)%2;
		int enemy =  3 - team;
		int a, b, c, d;

		if(Board.mode == 1) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++){
					if((Board.mode==2)&&((a<=2&&cur_y<=2)||(a<=2&&cur_y>=11)||(a>=11&&cur_y>=11)||(a>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][cur_y]=1;
				}

				if(2-(loc[a][cur_y]/0x10)%2==enemy) {
					Pos[a][cur_y]=1;
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x-1;loc[b][cur_y]==0;b--) {
					if((Board.mode==2)&&((b<=2&&cur_y<=2)||(b<=2&&cur_y>=11)||(b>=11&&cur_y>=11)||(b>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][cur_y]=1;
				}

				if(2-(loc[b][cur_y]/0x10)%2==enemy) {
					Pos[b][cur_y]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_y+1;loc[cur_x][c]==0;c++){
					if((Board.mode==2)&&((cur_x<=2&&c<=2)||(cur_x<=2&&c>=11)||(cur_x>=11&&c>=11)||(cur_x>=11&&c<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][c]=1;
				}

				if(2-(loc[cur_x][c]/0x10)%2==enemy) {
					Pos[cur_x][c]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_y-1;loc[cur_x][d]==0;d--) {
					if((Board.mode==2)&&((cur_x<=2&&d<=2)||(cur_x<=2&&d>=11)||(cur_x>=11&&d>=11)||(cur_x>=11&&d<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][d]=1;
				}      
				if(2-(loc[cur_x][d]/0x10)%2==enemy) {
					Pos[cur_x][d]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}
		else if(Board.mode == 2) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++){
					if((Board.mode==2)&&((a<=2&&cur_y<=2)||(a<=2&&cur_y>=11)||(a>=11&&cur_y>=11)||(a>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][cur_y]=1;
				}

				if(2-(loc[a][cur_y]/0x10)%2==enemy) {
					Pos[a][cur_y]=1;
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x-1;loc[b][cur_y]==0;b--) {
					if((Board.mode==2)&&((b<=2&&cur_y<=2)||(b<=2&&cur_y>=11)||(b>=11&&cur_y>=11)||(b>=11&&cur_y<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][cur_y]=1;
				}

				if(2-(loc[b][cur_y]/0x10)%2==enemy) {
					Pos[b][cur_y]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_y+1;loc[cur_x][c]==0;c++){
					if((Board.mode==2)&&((cur_x<=2&&c<=2)||(cur_x<=2&&c>=11)||(cur_x>=11&&c>=11)||(cur_x>=11&&c<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][c]=1;
				}

				if(2-(loc[cur_x][c]/0x10)%2==enemy) {
					Pos[cur_x][c]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_y-1;loc[cur_x][d]==0;d--) {
					if((Board.mode==2)&&((cur_x<=2&&d<=2)||(cur_x<=2&&d>=11)||(cur_x>=11&&d>=11)||(cur_x>=11&&d<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[cur_x][d]=1;
				}      
				if(2-(loc[cur_x][d]/0x10)%2==enemy) {
					Pos[cur_x][d]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}


	}
}