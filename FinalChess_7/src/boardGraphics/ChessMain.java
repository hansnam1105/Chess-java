package boardGraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ChessMain extends JFrame{
	
	//체스판 띄우기
	public ChessMain() {      
		JFrame frame= new JFrame("ChessMenu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 640);
		frame.setLayout(null);

		try {
			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("chess.jpg")))));
		} catch (IOException e) {
			e.printStackTrace();
		}

		JLabel name = new JLabel("CHESS");
		name.setFont(new Font("Serif", Font.BOLD, 30));
		name.setLocation(140, 100);
		name.setSize(200, 40);
		frame.add(name);

		JButton a = new JButton("1 VS 1");
		a.setFont(new Font("Serif", Font.BOLD, 30));
		a.setLocation(90, 200);
		a.setSize(200, 80);
		a.setBackground(new Color(204, 153, 153));
		a.setForeground(Color.WHITE);
		frame.add(a);

		JButton b = new JButton("2 VS 2");
		b.setFont(new Font("Serif", Font.BOLD, 30));
		b.setLocation(90, 300);
		b.setSize(200, 80);
		b.setBackground(new Color(204, 102, 102));
		b.setForeground(Color.WHITE);
		frame.add(b);

		JButton c = new JButton("EXIT");
		c.setFont(new Font("Serif", Font.BOLD, 30));
		c.setLocation(90, 400);
		c.setSize(200, 80);
		c.setBackground(new Color(255, 153, 153));
		c.setForeground(Color.WHITE);
		frame.add(c);

		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new SetBoardGraphic(); //1대1 체스 소환
			}
		});

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new SetBoardGraphic2(); //2대2 체스 소환
			}
		});

		c.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {

				System.exit(0); //프로그램 종료
			}
		});

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}



	public static void main(String[] args) throws IOException {
		new ChessMain();
	}
}




