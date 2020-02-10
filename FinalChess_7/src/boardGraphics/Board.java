package boardGraphics;


import javax.swing.JFrame;
import javax.swing.JPanel;

import chessPiece.ImagePanel;

//현재 판의 상태 정적 변수

public class Board {
	public static int mode;
	public static JPanel squares[][] = new JPanel[8][8];
	public static JPanel squares2[][] = new JPanel[14][14];
	public static JFrame board = new JFrame();
	public static int row;
	public static int col;
	public static boolean a = true;
	public static ImagePanel temp;
	public static int tempx;
	public static int tempy;
	public static int turn = 1; //2=black, 1 = white
	public static int team1=0,team2=0;
	public static int[]  pat= {1, 2, 3, 4};
	public static int[]  checkpat= {0, 0, 0, 0};
}