package control;

import javax.swing.*;

import boardGraphics.Board;
import boardGraphics.ChessMain;
import chessPiece.Location;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;


public class Tile2 extends JPanel{


	public static int tea(int turn){

		int te;
		if(turn == 4) {
			te = 2;
		}
		else if(turn == 1) {
			te = 3;
		}
		else if(turn == 2){
			te = 4;
		}
		else {
			te = 1;   
		}


		return te;
	}

	public Tile2(int i, int j){

		Board board = new Board();

		setPreferredSize(new Dimension(50, 50));
		if((i % 2 == 1 && j % 2 ==1 ) || (i % 2 == 0 && j % 2 == 0)) {
			if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
			}
			else {
				setBackground(Color.WHITE);
			}
		}
		else {
			if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
			}
			else {
				setBackground(Color.LIGHT_GRAY);
			}
		}


		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				JPanel p = new JPanel();
				p = (JPanel) e.getSource();
				int m = Board.turn;
				int ta = Board.pat[m-1];

				if(Board.a) {
					if(Board.squares2[i][j]== p) {


						Board.tempx = i;
						Board.tempy = j;
						if(Location.loc[i][j]/16==ta)//�ڽ��� ���� �´� ��� �� �� �ִ� ��ġ�� ǥ��.
						{

							PlayChess.ShowPos();
						}
						//�ڽ��� ���� �ƴ� ��� �����ϰ� �ٽ� Ŭ���� ��ȸ�� ��.
					}
				}

				else if(Board.a==false) {
					if(Board.squares2[i][j] == p) {
						Board.row = i;
						Board.col = j;

						if(Location.loc[i][j]/16==ta)//�ڽ��� ���ʿ� �ٸ� �ڽ��� ���� Ŭ���Ͽ�����, �� ���� �������� �ű� �� �ִ� ��ġ�� ǥ��
						{
							for(int i=0;i<14;i++)
								for(int j=0; j<14; j++) {
									if((i % 2 == 1 && j % 2 ==1 ) || (i % 2 == 0 && j % 2 == 0)) {
										if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
										}
										else {
											Board.squares2[i][j].setBackground(Color.WHITE);
										}
									}
									else {
										if((i<=2 && j <=2) || (i<=2 && j>=11) || (i>=11 && j<=2) || (i>=11 && j>=11)) {
										}
										else {
											Board.squares2[i][j].setBackground(Color.LIGHT_GRAY);
										}
									}
								}

							Board.tempx = i;
							Board.tempy = j;
							PlayChess.ShowPos();
							Board.a = !Board.a; 
						}
						else if(Location.Pos[i][j]==0)//�ڽ��� ���ʿ� �ڽ��� �����ߴ� ���� �̵��� �� ���� ��ġ�� ������ ���, ����
						{

						}
						else {//�� �ܿ� �̵��� �� �ִ� ��ġ�� ������ ��� �̵�.
							PlayChess.ShowMov();

							int te;//Board.turn�� �Ʊ�
							if(Board.turn <=3)
								Board.turn++;
							else
								Board.turn = 1;

							int o = Board.turn;
							int tk = Board.pat[o-1];
							te = tea(tk);

							int ck1=GameEnd.check2(tk);
							int ck2=GameEnd.check2(te);
							//���� �� �����̶� üũ�� ��� üũ �߻�
							if(ck1==1)
							{
								if(GameEnd.impos2(tk) == 0 && Board.checkpat[tk-1]==0) {
									ShowCheck.CheckmateFrame2(tk);
								}
								else {
									if(GameEnd.check2(tk)==1 && Board.checkpat[tk-1]==0)
										ShowCheck.CheckFrame2(tk);

								}
							}

							else if(ck2==1) {
								if(GameEnd.impos2(te) == 0 && Board.checkpat[te-1]==0) {
									ShowCheck.CheckmateFrame2(te);
								}
								else {
									if(GameEnd.check2(te)==1 && Board.checkpat[te-1]==0)
										ShowCheck.CheckFrame2(te);

								}
							}



							else
							{
								if(GameEnd.impos2(tk) == 0) {
									ShowCheck.StalemateFrame2();
								}
							}

							System.out.println(tk);  
							if(Board.checkpat[tk-1]!=0&&Board.checkpat[te-1]!=0) {
								Board.board.dispose();
								new ChessMain();
							}


						}
					}

				}


			}
		});


	}

}