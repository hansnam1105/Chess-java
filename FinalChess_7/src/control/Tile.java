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
						if(Location.loc[i][j]/16==Board.turn)//자신의 말이 맞는 경우 갈 수 있는 위치를 표시.
						{

							PlayChess.ShowPos();
						}
						//자신의 말이 아닐 경우 무시하고 다시 클릭할 기회를 줌.
					}
				}

				else if(Board.a==false) {
					if(Board.squares[i][j] == p) {
						Board.row = i;
						Board.col = j;

						if(Location.loc[i][j]/16==Board.turn)//자신의 차례에 다른 자신의 말을 클릭하였으면, 그 말을 기준으로 옮길 수 있는 위치를 표시
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
						else if(Location.Pos[i][j]==0)//자신의 차례에 자신이 선택했던 말이 이동할 수 없는 위치를 선택할 경우, 무시
						{

						}
						else {//그 외에 이동할 수 있는 위치를 선택할 경우 이동.
							PlayChess.ShowMov();
							Board.turn = 3 - Board.turn;
							int ck=GameEnd.check(Board.turn);//체크는 아직 제대로 합쳐지지 않음. 
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