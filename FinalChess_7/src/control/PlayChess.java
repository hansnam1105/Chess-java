package control;


import java.awt.Color;

import boardGraphics.Board;
import chessPiece.Bishop;
import chessPiece.King;
import chessPiece.Knight;
import chessPiece.Location;
import chessPiece.Pawn;
import chessPiece.Piece;
import chessPiece.Queen;
import chessPiece.Rook;


public class PlayChess extends Location{
   
   public static void ShowPos() {
         int piece_type;
         System.out.println("<Loc>");
         PrintLoc();
         if(loc[Board.tempx][Board.tempy]==0)
            System.out.println("There is not corret input2.");
         
       
         Rook Rook =new Rook();
         Bishop Bishop =new Bishop();
         Queen Queen =new Queen();
         King King =new King();
         Knight Knight =new Knight();
         Pawn Pawn =new Pawn();
         
         
         for(int i=0; i<Pos.length; i++) {
             for(int j=0; j<Pos[0].length; j++)
                Pos[i][j]=0;
          }
         
         
         if(loc[Board.tempx][Board.tempy]!=0) {
            piece_type=loc[Board.tempx][Board.tempy];
            if(piece_type%0x10==0||piece_type%0x10==7)
               Rook.possible(Board.tempx, Board.tempy, piece_type);
            else if(piece_type%0x10==1||piece_type%0x10==6)
               Knight.possible(Board.tempx, Board.tempy, piece_type);
            else if(piece_type%0x10==2||piece_type%0x10==5)
               Bishop.possible(Board.tempx, Board.tempy, piece_type);
            else if(piece_type%0x10==4)
               King.possible(Board.tempx, Board.tempy, piece_type);
            else if(piece_type%0x10==3)
               Queen.possible(Board.tempx, Board.tempy, piece_type);
            else if(piece_type%0x10>=8&&piece_type%0x10<=15)
               Pawn.possible(Board.tempx, Board.tempy, piece_type);
            if(Board.mode == 1)
            Piece.limit_possible(Board.tempx, Board.tempy, piece_type);
            else
            Piece.limit_possible2(Board.tempx, Board.tempy, piece_type);	
            Board.a = !Board.a;
            System.out.println("<Pos>");
            PrintPos();
         }
            
   }
      

      public static void ShowMov() {
         int piece_type;

         piece_type=loc[Board.tempx][Board.tempy];
         if(Pos[Board.row][Board.col]!=1) 
               System.out.println("The input is not correct.");

        
         if(Pos[Board.row][Board.col]==1) { 
            Board.a = !Board.a;
            if(Board.mode == 1)
               Piece.move(Board.tempx, Board.tempy, Board.row, Board.col, piece_type);
            else if(Board.mode == 2)
               Piece.move2(Board.tempx, Board.tempy, Board.row, Board.col, piece_type);
               
             
            
         
            
         }
         
         if(Pos[Board.row][Board.col]==1) {
            
            if(Board.mode == 1) {
               for(int i=0; i<8; i++) {
                   for(int j=0; j<8; j++)
                      if((i+j)%2 !=0) {
                         Board.squares[i][j].setBackground(Color.LIGHT_GRAY); 
                   }
                   else
                      Board.squares[i][j].setBackground(Color.white);
                   
                }
            }
            
            else if(Board.mode == 2) {
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
               
            }
            }
            

         
         
            for(int i=0; i<Pos.length; i++) {
               for(int j=0; j<Pos[0].length; j++)
                  Pos[i][j]=0;
            }
         System.out.println("<Loc>");
         PrintLoc();
      
      }

   
   
   
}