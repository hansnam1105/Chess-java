package chessPiece;

import java.awt.Color;

import boardGraphics.Board;

public class Bishop extends Piece {

	public void possible(int cur_x, int cur_y, int piece_type) {
		int team=2-(piece_type/0x10)%2;
		int enemy =  3 - team;
		int a, b, c, d, e ,f ,g, h;

		if(Board.mode == 1) {
			try {
				for(a=cur_x+1, e=cur_y+1;loc[a][e]==0;a++, e++) {
					if((Board.mode==2)&&((a<=2&&e<=2)||(a<=2&&e>=11)||(a>=11&&e>=11)||(a>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][e]=1;
					Board.squares[a][e].setBackground(Color.GREEN);
				}

				if(2-(loc[a][e]/0x10)%2==enemy) {
					Pos[a][e]=1;
					Board.squares[a][e].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x+1, f=cur_y-1;loc[b][f]==0;b++, f--) {
					if((Board.mode==2)&&(b<=2&&f<=2)||(b<=2&&f>=11)||(b>=11&&f>=11)||(b>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][f]=1;
					Board.squares[b][f].setBackground(Color.GREEN);
				}

				if(2-(loc[b][f]/0x10)%2==enemy) {
					Pos[b][f]=1;
					Board.squares[b][f].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_x-1, g=cur_y-1;loc[c][g]==0;c--, g--) {
					if((Board.mode==2)&&(c<=2&&g<=2)||(c<=2&&g>=11)||(c>=11&&g>=11)||(c>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[c][g]=1;
					Board.squares[c][g].setBackground(Color.GREEN);
				}

				if(2-(loc[c][g]/0x10)%2==enemy) {
					Pos[c][g]=1;
					Board.squares[c][g].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_x-1, h=cur_y+1;loc[d][h]==0;d--, h++) {
					if((Board.mode==2)&&(d<=2&&h<=2)||(d<=2&&h>=11)||(d>=11&&h>=11)||(d>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[d][h]=1;
					Board.squares[d][h].setBackground(Color.GREEN);
				}

				if(2-(loc[d][h]/0x10)%2==enemy) {
					Pos[d][h]=1;
					Board.squares[d][h].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}

		else if(Board.mode == 2) {
			try {
				for(a=cur_x+1, e=cur_y+1;loc[a][e]==0;a++, e++) {
					if((Board.mode==2)&&((a<=2&&e<=2)||(a<=2&&e>=11)||(a>=11&&e>=11)||(a>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][e]=1;
					Board.squares2[a][e].setBackground(Color.GREEN);
				}

				if(2-(loc[a][e]/0x10)%2==enemy) {
					Pos[a][e]=1;
					Board.squares2[a][e].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x+1, f=cur_y-1;loc[b][f]==0;b++, f--) {
					if((Board.mode==2)&&(b<=2&&f<=2)||(b<=2&&f>=11)||(b>=11&&f>=11)||(b>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][f]=1;
					Board.squares2[b][f].setBackground(Color.GREEN);
				}

				if(2-(loc[b][f]/0x10)%2==enemy) {
					Pos[b][f]=1;
					Board.squares2[b][f].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_x-1, g=cur_y-1;loc[c][g]==0;c--, g--) {
					if((Board.mode==2)&&(c<=2&&g<=2)||(c<=2&&g>=11)||(c>=11&&g>=11)||(c>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[c][g]=1;
					Board.squares2[c][g].setBackground(Color.GREEN);
				}

				if(2-(loc[c][g]/0x10)%2==enemy) {
					Pos[c][g]=1;
					Board.squares2[c][g].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_x-1, h=cur_y+1;loc[d][h]==0;d--, h++) {
					if((Board.mode==2)&&(d<=2&&h<=2)||(d<=2&&h>=11)||(d>=11&&h>=11)||(d>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[d][h]=1;
					Board.squares2[d][h].setBackground(Color.GREEN);
				}

				if(2-(loc[d][h]/0x10)%2==enemy) {
					Pos[d][h]=1;
					Board.squares2[d][h].setBackground(Color.RED);
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}

	}
	public void possible2(int cur_x, int cur_y, int piece_type) {
		int team=2-(piece_type/0x10)%2;
		int enemy =  3 - team;
		int a, b, c, d, e ,f ,g, h;

		if(Board.mode == 1) {
			try {
				for(a=cur_x+1, e=cur_y+1;loc[a][e]==0;a++, e++) {
					if((Board.mode==2)&&((a<=2&&e<=2)||(a<=2&&e>=11)||(a>=11&&e>=11)||(a>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][e]=1;
				}

				if(2-(loc[a][e]/0x10)%2==enemy) {
					Pos[a][e]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x+1, f=cur_y-1;loc[b][f]==0;b++, f--) {
					if((Board.mode==2)&&(b<=2&&f<=2)||(b<=2&&f>=11)||(b>=11&&f>=11)||(b>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][f]=1;
				}

				if(2-(loc[b][f]/0x10)%2==enemy) {
					Pos[b][f]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_x-1, g=cur_y-1;loc[c][g]==0;c--, g--) {
					if((Board.mode==2)&&(c<=2&&g<=2)||(c<=2&&g>=11)||(c>=11&&g>=11)||(c>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[c][g]=1;
				}

				if(2-(loc[c][g]/0x10)%2==enemy) {
					Pos[c][g]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_x-1, h=cur_y+1;loc[d][h]==0;d--, h++) {
					if((Board.mode==2)&&(d<=2&&h<=2)||(d<=2&&h>=11)||(d>=11&&h>=11)||(d>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[d][h]=1;
				}

				if(2-(loc[d][h]/0x10)%2==enemy) {
					Pos[d][h]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}

		else if(Board.mode == 2) {
			try {
				for(a=cur_x+1, e=cur_y+1;loc[a][e]==0;a++, e++) {
					if((Board.mode==2)&&((a<=2&&e<=2)||(a<=2&&e>=11)||(a>=11&&e>=11)||(a>=11&&e<=2)))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(a>=8||e>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[a][e]=1;
				}

				if(2-(loc[a][e]/0x10)%2==enemy) {
					Pos[a][e]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(b=cur_x+1, f=cur_y-1;loc[b][f]==0;b++, f--) {
					if((Board.mode==2)&&(b<=2&&f<=2)||(b<=2&&f>=11)||(b>=11&&f>=11)||(b>=11&&f<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(b>=8||f>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[b][f]=1;
				}

				if(2-(loc[b][f]/0x10)%2==enemy) {
					Pos[b][f]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(c=cur_x-1, g=cur_y-1;loc[c][g]==0;c--, g--) {
					if((Board.mode==2)&&(c<=2&&g<=2)||(c<=2&&g>=11)||(c>=11&&g>=11)||(c>=11&&g<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(c>=8||g>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[c][g]=1;
				}

				if(2-(loc[c][g]/0x10)%2==enemy) {
					Pos[c][g]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}

			try {
				for(d=cur_x-1, h=cur_y+1;loc[d][h]==0;d--, h++) {
					if((Board.mode==2)&&(d<=2&&h<=2)||(d<=2&&h>=11)||(d>=11&&h>=11)||(d>=11&&h<=2))
						throw new ArrayIndexOutOfBoundsException();
					if((Board.mode==1)&&(d>=8||h>=8))
						throw new ArrayIndexOutOfBoundsException();
					Pos[d][h]=1;
				}

				if(2-(loc[d][h]/0x10)%2==enemy) {
					Pos[d][h]=1;
				}

			}
			catch(ArrayIndexOutOfBoundsException ex){}
		}
	}
}