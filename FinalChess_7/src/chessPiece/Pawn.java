package chessPiece;

import java.awt.Color;

import boardGraphics.Board;
import control.GameEnd;

public class Pawn extends Piece{


	GameEnd GameEnd=new GameEnd();
	public static int tea(int turn){

		int te;
		if(turn == 1)
			te = 3;
		else if(turn == 2) 
			te = 4;
		else if(turn == 3) 
			te = 1;
		else
			te = 2;


		return te;
	}

	public void possible(int cur_x, int cur_y, int piece_type) {

		if(Board.mode == 1) {
			int team = piece_type / 16 ;
			int enemy = 3 - team;
			int t = 3 - 2 * team ;

			//최초의 움직임
			if(cur_x == -5 * team +11){
				if((loc[cur_x-t][cur_y]/16) == 0) {
					Pos[cur_x-t][cur_y] = 1;
					Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);


				}

				if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
					Pos[cur_x-2*t][cur_y] = 1;
					Board.squares[cur_x-2*t][cur_y].setBackground(Color.GREEN);
				}


			}

			//최초가 아닌 경우의 움직임
			else
			{
				if(team == 1) {
					if(cur_x > 5 * team - 5&& (loc[cur_x-t][cur_y]/16) == 0){
						Pos[cur_x-t][cur_y] = 1;
						Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);
					}
				}
				else{
					if(cur_x < 5 * team - 5&& (loc[cur_x-t][cur_y]/16) == 0){
						Pos[cur_x-t][cur_y] = 1;
						Board.squares[cur_x-t][cur_y].setBackground(Color.GREEN);
					}
				}
			}


			//폰의 다른 말 잡기
			try{
				if((loc[cur_x-t][cur_y-t]/16) == enemy){
					Pos[cur_x-t][cur_y-t] = 1;
					Board.squares[cur_x-t][cur_y-t].setBackground(Color.RED);
				}

			}
			catch(java.lang.ArrayIndexOutOfBoundsException e) {

			}

			try{
				if((loc[cur_x-t][cur_y+t]/16) == enemy) {
					Pos[cur_x-t][cur_y+t] = 1;
					Board.squares[cur_x-t][cur_y+t].setBackground(Color.RED);
				}

			}
			catch(java.lang.ArrayIndexOutOfBoundsException e) {

			}
		}
		else{
			int team = piece_type / 16 ;
			int te = tea(team);
			int enemy1 = 5 - team;
			int enemy2 = 5 - te;

			if(team ==1 || team == 3) {
				int t = 2 - team ;
				if(cur_x == (35-team*11)/2){

					if((loc[cur_x-t][cur_y]/16) == 0) {
						Pos[cur_x-t][cur_y] = 1;
						Board.squares2[cur_x-t][cur_y].setBackground(Color.GREEN);


					}

					if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
						Pos[cur_x-2*t][cur_y] = 1;
						Board.squares2[cur_x-2*t][cur_y].setBackground(Color.GREEN);
					}


				}
				else{

					if(team == 1) {
						if(cur_x >= 0&& (loc[cur_x-t][cur_y]/16) == 0){
							Pos[cur_x-t][cur_y] = 1;
							Board.squares2[cur_x-t][cur_y].setBackground(Color.GREEN);
						}
					}
					else{
						if(cur_x < 14&& (loc[cur_x-t][cur_y]/16) == 0){
							Pos[cur_x-t][cur_y] = 1;
							Board.squares2[cur_x-t][cur_y].setBackground(Color.GREEN);
						}
					}
				}


				//폰의 다른 말 잡기
				try{
					if((loc[cur_x-t][cur_y-t]/16) == enemy1||loc[cur_x-t][cur_y-t]/16 == enemy2){
						Pos[cur_x-t][cur_y-t] = 1;
						Board.squares2[cur_x-t][cur_y-t].setBackground(Color.RED);
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}

				try{
					if((loc[cur_x-t][cur_y+t]/16) == enemy1||loc[cur_x-t][cur_y+t]/16 == enemy2) {
						Pos[cur_x-t][cur_y+t] = 1;
						Board.squares2[cur_x-t][cur_y+t].setBackground(Color.RED);
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}	
			}
			else {
				int t = team - 3 ;
				if(cur_y == (-20+11*team)/2){

					if((loc[cur_x][cur_y-t]/16) == 0) {
						Pos[cur_x][cur_y-t] = 1;
						Board.squares2[cur_x][cur_y-t].setBackground(Color.GREEN);


					}

					if((loc[cur_x][cur_y-2*t]/16) == 0 && loc[cur_x-t][cur_y-2*t]/16 == 0) {
						Pos[cur_x][cur_y-2*t] = 1;
						Board.squares2[cur_x][cur_y-2*t].setBackground(Color.GREEN);
					}


				}

				//최초가 아닌 경우의 움직임
				else
				{

					if(team == 2) {
						if(cur_x >= 0&& (loc[cur_x][cur_y-t]/16) == 0)
						{
							Pos[cur_x][cur_y-t] = 1;
							Board.squares2[cur_x][cur_y-t].setBackground(Color.GREEN);
						}
					}
					else
					{
						if(cur_x < 14&& (loc[cur_x][cur_y-t]/16) == 0)
						{
							Pos[cur_x][cur_y-t] = 1;
							Board.squares2[cur_x][cur_y-t].setBackground(Color.GREEN);
						}
					}
				}


				//폰의 다른 말 잡기
				try{
					if((loc[cur_x-t][cur_y-t]/16) == enemy1||loc[cur_x-t][cur_y-t]/16 == enemy2){
						Pos[cur_x-t][cur_y-t] = 1;
						Board.squares2[cur_x-t][cur_y-t].setBackground(Color.RED);
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}

				try{
					if((loc[cur_x+t][cur_y-t]/16) == enemy1||loc[cur_x+t][cur_y-t]/16 == enemy2) {
						Pos[cur_x+t][cur_y-t] = 1;
						Board.squares2[cur_x+t][cur_y-t].setBackground(Color.RED);
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}	
			}
		}

	}


	public void possible2(int cur_x, int cur_y, int piece_type) {

		if(Board.mode == 1) {
			int team = piece_type / 16 ;
			int enemy = 3 - team;
			int t = 3 - 2 * team ;

			//최초의 움직임
			if(cur_x == -5 * team +11){
				if((loc[cur_x-t][cur_y]/16) == 0) {
					Pos[cur_x-t][cur_y] = 1;
				}
				if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
					Pos[cur_x-2*t][cur_y] = 1;
				}

			}

			//최초가 아닌 경우의 움직임
			else{
				if(team == 1) {
					if(cur_x > 5 * team - 5&& (loc[cur_x-t][cur_y]/16) == 0){
						Pos[cur_x-t][cur_y] = 1;
					}
				}
				else{
					if(cur_x < 5 * team - 5&& (loc[cur_x-t][cur_y]/16) == 0){
						Pos[cur_x-t][cur_y] = 1;
					}
				}
			}


			//폰의 다른 말 잡기
			try{
				if((loc[cur_x-t][cur_y-t]/16) == enemy){
					Pos[cur_x-t][cur_y-t] = 1;
				}

			}
			catch(java.lang.ArrayIndexOutOfBoundsException e) {

			}

			try{
				if((loc[cur_x-t][cur_y+t]/16) == enemy) {
					Pos[cur_x-t][cur_y+t] = 1;
				}

			}
			catch(java.lang.ArrayIndexOutOfBoundsException e) {

			}
		}
		else {
			int team = piece_type / 16 ;
			int te = tea(team);
			int enemy1 = 5 - team;
			int enemy2 = 5 - te;

			if(team ==1 || team == 3) {
				int t = 2 - team ;
				if(cur_x == (35-team*11)/2){
					if((loc[cur_x-t][cur_y]/16) == 0) {
						Pos[cur_x-t][cur_y] = 1;
					}

					if((loc[cur_x-2*t][cur_y]/16) == 0 && loc[cur_x-t][cur_y]/16 == 0) {
						Pos[cur_x-2*t][cur_y] = 1;
					}


				}

				else{

					if(team == 1) {
						if(cur_x >= 0&& (loc[cur_x-t][cur_y]/16) == 0){
							Pos[cur_x-t][cur_y] = 1;
						}
					}
					else{
						if(cur_x < 14&& (loc[cur_x-t][cur_y]/16) == 0){
							Pos[cur_x-t][cur_y] = 1;
						}
					}
				}


				//폰의 다른 말 잡기
				try{
					if((loc[cur_x-t][cur_y-t]/16) == enemy1||loc[cur_x-t][cur_y-t]/16 == enemy2){
						Pos[cur_x-t][cur_y-t] = 1;
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}

				try{
					if((loc[cur_x-t][cur_y+t]/16) == enemy1||loc[cur_x-t][cur_y+t]/16 == enemy2) {
						Pos[cur_x-t][cur_y+t] = 1;
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}	
			}
			else {
				int t = team - 3 ;
				if(cur_y == (-20+11*team)/2){
					if((loc[cur_x][cur_y-t]/16) == 0) {
						Pos[cur_x][cur_y-t] = 1;

					}

					if((loc[cur_x][cur_y-2*t]/16) == 0 && loc[cur_x-t][cur_y-2*t]/16 == 0) {
						Pos[cur_x][cur_y-2*t] = 1;
					}

				}

				//최초가 아닌 경우의 움직임
				else
				{

					if(team == 2) {
						if(cur_x >= 0&& (loc[cur_x][cur_y-t]/16) == 0){
							Pos[cur_x][cur_y-t] = 1;
						}
					}
					else{
						if(cur_x < 14&& (loc[cur_x][cur_y-t]/16) == 0){
							Pos[cur_x][cur_y-t] = 1;
						}
					}
				}

				//폰의 다른 말 잡기
				try{
					if((loc[cur_x-t][cur_y-t]/16) == enemy1||loc[cur_x-t][cur_y-t]/16 == enemy2){
						Pos[cur_x-t][cur_y-t] = 1;
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}

				try{
					if((loc[cur_x+t][cur_y-t]/16) == enemy1||loc[cur_x+t][cur_y-t]/16 == enemy2) {
						Pos[cur_x+t][cur_y-t] = 1;
					}

				}
				catch(java.lang.ArrayIndexOutOfBoundsException e) {

				}	
			}
		}

	}

}
