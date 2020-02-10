package chessPiece;

import java.awt.Color;

import boardGraphics.Board;
import control.GameEnd;

public class Queen extends Piece {


	GameEnd GameEnd=new GameEnd();

	public void possible(int cur_x, int cur_y, int piece_type)  {
		int team= 2-(piece_type/0x10)%2;
		int enemy =  3 - team;
		int a, b, c, d, e ,f ,g, h, i, j, k ,l;

		if(Board.mode == 1) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++) {
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
				for(c=cur_y+1;loc[cur_x][c]==0;c++) {
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

			try {
				for(i=cur_x+1, e=cur_y+1;loc[i][e]==0;i++, e++) {
					if((Board.mode==2)&&((i<=2&&e<=2)||(i<=2&&e>=11)||(i>=11&&e>=11)||(i>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(i>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[i][e]=1;
					Board.squares[i][e].setBackground(Color.GREEN);
				}
				if(2-(loc[i][e]/0x10)%2==enemy) {
					Pos[i][e]=1;
					Board.squares[i][e].setBackground(Color.RED);
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(j=cur_x+1, f=cur_y-1;loc[j][f]==0;j++, f--) {
					if((Board.mode==2)&&(j<=2&&f<=2)||(j<=2&&f>=11)||(j>=11&&f>=11)||(j>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(j>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[j][f]=1;
					Board.squares[j][f].setBackground(Color.GREEN);
				}

				if(2-(loc[j][f]/0x10)%2==enemy) {
					Pos[j][f]=1;
					Board.squares[j][f].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(k=cur_x-1, g=cur_y-1;loc[k][g]==0;k--, g--) {
					if((Board.mode==2)&&(k<=2&&g<=2)||(k<=2&&g>=11)||(k>=11&&g>=11)||(k>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(k>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[k][g]=1;
					Board.squares[k][g].setBackground(Color.GREEN);
				}
				if(2-(loc[k][g]/0x10)%2==enemy) {
					Pos[k][g]=1;
					Board.squares[k][g].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(l=cur_x-1, h=cur_y+1;loc[l][h]==0;l--, h++) {
					if((Board.mode==2)&&(l<=2&&h<=2)||(l<=2&&h>=11)||(l>=11&&h>=11)||(l>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(l>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[l][h]=1;
					Board.squares[l][h].setBackground(Color.GREEN);
				}
				if(2-(loc[l][h]/0x10)%2==enemy) {
					Pos[l][h]=1;
					Board.squares[l][h].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}
		else if(Board.mode == 2) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++) {
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
				for(c=cur_y+1;loc[cur_x][c]==0;c++) {
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

			try {
				for(i=cur_x+1, e=cur_y+1;loc[i][e]==0;i++, e++) {
					if((Board.mode==2)&&((i<=2&&e<=2)||(i<=2&&e>=11)||(i>=11&&e>=11)||(i>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(i>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[i][e]=1;
					Board.squares2[i][e].setBackground(Color.GREEN);
				}
				if(2-(loc[i][e]/0x10)%2==enemy) {
					Pos[i][e]=1;
					Board.squares2[i][e].setBackground(Color.RED);
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(j=cur_x+1, f=cur_y-1;loc[j][f]==0;j++, f--) {
					if((Board.mode==2)&&(j<=2&&f<=2)||(j<=2&&f>=11)||(j>=11&&f>=11)||(j>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(j>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[j][f]=1;
					Board.squares2[j][f].setBackground(Color.GREEN);
				}

				if(2-(loc[j][f]/0x10)%2==enemy) {
					Pos[j][f]=1;
					Board.squares2[j][f].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(k=cur_x-1, g=cur_y-1;loc[k][g]==0;k--, g--) {
					if((Board.mode==2)&&(k<=2&&g<=2)||(k<=2&&g>=11)||(k>=11&&g>=11)||(k>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(k>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[k][g]=1;
					Board.squares2[k][g].setBackground(Color.GREEN);
				}
				if(2-(loc[k][g]/0x10)%2==enemy) {
					Pos[k][g]=1;
					Board.squares2[k][g].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(l=cur_x-1, h=cur_y+1;loc[l][h]==0;l--, h++) {
					if((Board.mode==2)&&(l<=2&&h<=2)||(l<=2&&h>=11)||(l>=11&&h>=11)||(l>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(l>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[l][h]=1;
					Board.squares2[l][h].setBackground(Color.GREEN);
				}
				if(2-(loc[l][h]/0x10)%2==enemy) {
					Pos[l][h]=1;
					Board.squares2[l][h].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}




	}
	public void possible2(int cur_x, int cur_y, int piece_type)  {
		int team= 2-(piece_type/0x10)%2;
		int enemy =  3 - team;
		int a, b, c, d, e ,f ,g, h, i, j, k ,l;

		if(Board.mode == 1) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++) {
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
				for(c=cur_y+1;loc[cur_x][c]==0;c++) {
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

			try {
				for(i=cur_x+1, e=cur_y+1;loc[i][e]==0;i++, e++) {
					if((Board.mode==2)&&((i<=2&&e<=2)||(i<=2&&e>=11)||(i>=11&&e>=11)||(i>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(i>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[i][e]=1;
				}
				if(2-(loc[i][e]/0x10)%2==enemy) {
					Pos[i][e]=1;
				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(j=cur_x+1, f=cur_y-1;loc[j][f]==0;j++, f--) {
					if((Board.mode==2)&&(j<=2&&f<=2)||(j<=2&&f>=11)||(j>=11&&f>=11)||(j>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(j>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[j][f]=1;

				}

				if(2-(loc[j][f]/0x10)%2==enemy) {
					Pos[j][f]=1;

				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(k=cur_x-1, g=cur_y-1;loc[k][g]==0;k--, g--) {
					if((Board.mode==2)&&(k<=2&&g<=2)||(k<=2&&g>=11)||(k>=11&&g>=11)||(k>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(k>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[k][g]=1;

				}
				if(2-(loc[k][g]/0x10)%2==enemy) {
					Pos[k][g]=1;

				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(l=cur_x-1, h=cur_y+1;loc[l][h]==0;l--, h++) {
					if((Board.mode==2)&&(l<=2&&h<=2)||(l<=2&&h>=11)||(l>=11&&h>=11)||(l>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(l>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[l][h]=1;

				}
				if(2-(loc[l][h]/0x10)%2==enemy) {
					Pos[l][h]=1;

				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}
		else if(Board.mode == 2) {
			try {
				for(a=cur_x+1;loc[a][cur_y]==0;a++) {
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
				for(c=cur_y+1;loc[cur_x][c]==0;c++) {
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

			try {
				for(i=cur_x+1, e=cur_y+1;loc[i][e]==0;i++, e++) {
					if((Board.mode==2)&&((i<=2&&e<=2)||(i<=2&&e>=11)||(i>=11&&e>=11)||(i>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(i>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[i][e]=1;

				}
				if(2-(loc[i][e]/0x10)%2==enemy) {
					Pos[i][e]=1;

				}
			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(j=cur_x+1, f=cur_y-1;loc[j][f]==0;j++, f--) {
					if((Board.mode==2)&&(j<=2&&f<=2)||(j<=2&&f>=11)||(j>=11&&f>=11)||(j>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(j>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[j][f]=1;

				}

				if(2-(loc[j][f]/0x10)%2==enemy) {
					Pos[j][f]=1;

				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(k=cur_x-1, g=cur_y-1;loc[k][g]==0;k--, g--) {
					if((Board.mode==2)&&(k<=2&&g<=2)||(k<=2&&g>=11)||(k>=11&&g>=11)||(k>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(k>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[k][g]=1;

				}
				if(2-(loc[k][g]/0x10)%2==enemy) {
					Pos[k][g]=1;

				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(l=cur_x-1, h=cur_y+1;loc[l][h]==0;l--, h++) {
					if((Board.mode==2)&&(l<=2&&h<=2)||(l<=2&&h>=11)||(l>=11&&h>=11)||(l>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(l>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[l][h]=1;

				}
				if(2-(loc[l][h]/0x10)%2==enemy) {
					Pos[l][h]=1;

				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}
	}
}