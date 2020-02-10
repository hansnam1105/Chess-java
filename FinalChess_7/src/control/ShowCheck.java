package control;

import javax.swing.JButton;
import javax.swing.JFrame;

import boardGraphics.Board;
import boardGraphics.ChessMain;
import chessPiece.Location;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class ShowCheck extends JFrame{

   public static void CheckFrame() {

       JFrame inf = new JFrame("Information");
       JButton showcheck = new JButton();
       
       if(Board.turn == 1) {
          showcheck = new JButton("<html>White<br />checked<html>");
          showcheck.setFont(new Font("Serif", Font.BOLD, 15));
          showcheck.setBackground(new Color(255, 153, 204));
            inf.add(showcheck);
       }
       else if(Board.turn == 2) {
          showcheck = new JButton("<html>Black<br />checked<html>");
          showcheck.setFont(new Font("Serif", Font.BOLD, 15));
          showcheck.setBackground(new Color(255, 153, 204));
            inf.add(showcheck);
       }
       //inf.setSize(120, 120);
       showcheck.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             inf.dispose();
          }
       });
       inf.setSize(120, 120);
       inf.setLocationRelativeTo(null);
       inf.setVisible(true);
     }
   
   public static void CheckFrame2(int n) {
      JFrame inf = new JFrame("Information");
       JButton showcheck = new JButton();
       
       if(n==1) {
          showcheck = new JButton("<html>WHITE<br />checked<html>");
          showcheck.setFont(new Font("Serif", Font.BOLD, 15));
          showcheck.setBackground(new Color(255, 153, 204));
            inf.add(showcheck);
       }
       else if(n==2) {
          showcheck = new JButton("<html>RED<br />checked<html>");
          showcheck.setFont(new Font("Serif", Font.BOLD, 15));
          showcheck.setBackground(new Color(255, 153, 204));
            inf.add(showcheck);
       }
       else if(n==3) {
          showcheck = new JButton("<html>BLACK<br />checked<html>");
          showcheck.setFont(new Font("Serif", Font.BOLD, 15));
          showcheck.setBackground(new Color(255, 153, 204));
            inf.add(showcheck);
       }
       else if(n==4) {
          showcheck = new JButton("<html>GREEN<br />checked<html>");
          showcheck.setFont(new Font("Serif", Font.BOLD, 15));
          showcheck.setBackground(new Color(255, 153, 204));
            inf.add(showcheck);
       }
       //inf.setSize(120, 120);
       showcheck.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             inf.dispose();
          }
       });
       inf.setSize(120, 120);
       inf.setLocationRelativeTo(null);
       inf.setVisible(true);
   }
   
   public static void CheckmateFrame() {
        JFrame inf = new JFrame("Information");
          inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
          JButton ckmate = new JButton();
          
          if(Board.turn == 1) {
             ckmate = new JButton("<html>CheckMate - Black wins <br /> Click x to finish Program<html>");
             ckmate.setFont(new Font("Serif", Font.BOLD, 20));
             ckmate.setBackground(new Color(255, 153, 204));
               inf.add(ckmate);
          }
          else if(Board.turn == 2) {
             ckmate = new JButton("<html>CheckMate - White wins <br />  Click x to finish Program<html>");
             ckmate.setFont(new Font("Serif", Font.BOLD, 20));
             ckmate.setBackground(new Color(255, 153, 204));
             inf.add(ckmate);
          }
          
          
          ckmate.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                Board.turn=1; 
                inf.dispose();
                Board.board.dispose();
                new ChessMain();
                
             }
          });
          
          inf.setSize(320, 160);
          inf.setLocationRelativeTo(null);
          inf.setVisible(true);
     }
   
   public static void CheckmateFrame2(int n) {
      int w = 0;
      int r = 0;
      int b = 0;
      int g = 0;
      JFrame inf = new JFrame("Information");
       inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
       JButton ckmate = new JButton();
       
       if(n == 1) {
          //흰색 말 없애기
          for(int i = 0; i<14; i++) {
             for(int j = 0; j<14; j++) {
                if(Location.loc[i][j]>=0x10 && Location.loc[i][j]<=0x1f) {
                   Location.loc[i][j] = 0;
                   Board.squares2[i][j].removeAll();
                   Board.squares2[i][j].revalidate();
                   Board.squares2[i][j].repaint();
                }         
             }
          }
          w=1;
          ckmate = new JButton("<html>CheckMate - White out <br /> <html>");
          ckmate.setFont(new Font("Serif", Font.BOLD, 20));
          ckmate.setBackground(new Color(255, 153, 204));
          ckmate.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                 inf.dispose();
              }
           });
            inf.add(ckmate);
            Board.pat[0] = 3;
            Board.checkpat[0]=1;
       }
       else if(n == 2) {
          //빨간 말 없애기
          for(int i = 0; i<14; i++) {
             for(int j = 0; j<14; j++) {
                if(Location.loc[i][j]>=0x20 && Location.loc[i][j]<=0x2f) {
                   Location.loc[i][j] = 0;
                   Board.squares2[i][j].removeAll();
                   Board.squares2[i][j].revalidate();
                   Board.squares2[i][j].repaint();
                }         
             }
          }
          r=1;
          ckmate = new JButton("<html>CheckMate - Red out <br /> <html>");
          ckmate.setFont(new Font("Serif", Font.BOLD, 20));
          ckmate.setBackground(new Color(255, 153, 204));
          ckmate.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                 inf.dispose();
              }
           });
          inf.add(ckmate);
          Board.pat[1] = 4;

          Board.checkpat[1]=1;
       }
       else if(n==3) {
          //검정 말 없애기
          for(int i = 0; i<14; i++) {
             for(int j = 0; j<14; j++) {
                if(Location.loc[i][j]>=0x30 && Location.loc[i][j]<=0x3f) {
                   Location.loc[i][j] = 0;
                   Board.squares2[i][j].removeAll();
                   Board.squares2[i][j].revalidate();
                   Board.squares2[i][j].repaint();
                }         
             }
          }
          b=1;
          ckmate = new JButton("<html>CheckMate - Black out <br /> <html>");
          ckmate.setFont(new Font("Serif", Font.BOLD, 20));
          ckmate.setBackground(new Color(255, 153, 204));
          ckmate.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                 inf.dispose();
              }
           });
            inf.add(ckmate);
            Board.pat[2] = 1;

            Board.checkpat[2]=1;
       }
       else if(n==4) {
          //빨간 말 없애기
          for(int i = 0; i<14; i++) {
             for(int j = 0; j<14; j++) {
                if(Location.loc[i][j]>=0x40 && Location.loc[i][j]<=0x4f) {
                   Location.loc[i][j] = 0;
                   Board.squares2[i][j].removeAll();
                   Board.squares2[i][j].revalidate();
                   Board.squares2[i][j].repaint();
                }         
             }
          }
          g=1;
          ckmate = new JButton("<html>CheckMate - Green out <br /> <html>");
          ckmate.setFont(new Font("Serif", Font.BOLD, 20));
          ckmate.setBackground(new Color(255, 153, 204));
          ckmate.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                 inf.dispose();
              }
           });
            inf.add(ckmate);
            Board.pat[3] = 2;

            Board.checkpat[3]=1;
       }
       
       if(w==1 && b==1) {
          ckmate = new JButton("<html>CheckMate - Red and Green Win <br /> <html>");
           ckmate.setFont(new Font("Serif", Font.BOLD, 20));
           ckmate.setBackground(new Color(255, 153, 204));
           ckmate.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                 Board.turn =1;
                  inf.dispose();
                  Board.board.dispose();
                  new ChessMain();
               }
            });
             inf.add(ckmate);
       
   
       }
          
          
       if(r==1&&g==1) {
       
          ckmate = new JButton("<html>CheckMate - White and Black Win <br /> <html>");
           ckmate.setFont(new Font("Serif", Font.BOLD, 20));
           ckmate.setBackground(new Color(255, 153, 204));
           ckmate.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                 Board.turn =1;
                  inf.dispose();
                  Board.board.dispose();
                  new ChessMain();
               }
            });
             inf.add(ckmate);
             
          
       } 
       inf.setSize(320, 160);
       inf.setLocationRelativeTo(null);
       inf.setVisible(true);
      
   }
   
   public static void StalemateFrame() {

       JFrame inf = new JFrame("Information");
       inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
       JButton stmate = new JButton("<html>Stalemate! <br /> Click x to finish Program<html>");
       stmate.setFont(new Font("Serif", Font.BOLD, 20));
       stmate.setBackground(new Color(255, 153, 204));
       inf.add(stmate);
       stmate.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             Board.turn=1;  
             inf.dispose();
             Board.board.dispose();
             new ChessMain();
          }
       });
       
       inf.setSize(320, 160);
       inf.setLocationRelativeTo(null);
       inf.setVisible(true);
     }
   
   
   public static void StalemateFrame2() {
          JFrame inf = new JFrame("Information");
          inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
          
          JButton stmate = new JButton("<html>Stalemate! <br /> Click x to finish Program<html>");
          stmate.setFont(new Font("Serif", Font.BOLD, 20));
          stmate.setBackground(new Color(255, 153, 204));
          inf.add(stmate);
          stmate.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                Board.turn=1;  
                inf.dispose();
                Board.board.dispose();
                new ChessMain();
             }
          });
          
          inf.setSize(320, 160);
          inf.setLocationRelativeTo(null);
          inf.setVisible(true);
   }
   
   
   
}