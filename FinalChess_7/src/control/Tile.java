package control;

import javax.swing.*;

import boardGraphics.Board;
import chessPiece.Location;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;


public class Tile extends JPanel{


	public Tile(int i, int j){



		setPreferredSize(new Dimension(80, 80));
		if((i+j)%2 !=0) {
			setBackground(Color.LIGHT_GRAY);

		}
		else
			setBackground(Color.white);



		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				JPanel p = new JPanel();
				p = (JPanel) e.getSource();


				if(Board.a) {
					if(Board.squares[i][j]== p) {


						Board.tempx = i;
						Board.tempy = j;
						if(Location.loc[i][j]/16==Board.turn)//�ڽ��� ���� �´� ��� �� �� �ִ� ��ġ�� ǥ��.
						{

							PlayChess.ShowPos();
						}
						//�ڽ��� ���� �ƴ� ��� �����ϰ� �ٽ� Ŭ���� ��ȸ�� ��.
					}
				}

				else if(Board.a==false) {
					if(Board.squares[i][j] == p) {
						Board.row = i;
						Board.col = j;

						if(Location.loc[i][j]/16==Board.turn)//�ڽ��� ���ʿ� �ٸ� �ڽ��� ���� Ŭ���Ͽ�����, �� ���� �������� �ű� �� �ִ� ��ġ�� ǥ��
						{
							for(int i=0;i<8;i++)
								for(int j=0; j<8; j++) {
									if((i+j)%2 !=0) {
										Board.squares[i][j].setBackground(Color.LIGHT_GRAY);

									}
									else
										Board.squares[i][j].setBackground(Color.white);

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
							Board.turn = 3 - Board.turn;
							int ck=GameEnd.check(Board.turn);//üũ�� ���� ����� �������� ����. 
							if(ck==1)
							{
								if(GameEnd.impos(Board.turn) == 0) {
									ShowCheck.CheckmateFrame();
								}
								else
									ShowCheck.CheckFrame();
							}
							else
							{
								if(GameEnd.impos(Board.turn) == 0) {
									ShowCheck.StalemateFrame();
								}
							}


						}
					}

				}

				System.out.println(Board.turn);         
			}
		});


	}

}