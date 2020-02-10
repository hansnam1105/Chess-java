package control;

import chessPiece.Bishop;
import chessPiece.King;
import chessPiece.Knight;
import chessPiece.Location;
import chessPiece.Pawn;
import chessPiece.Piece;
import chessPiece.Queen;
import chessPiece.Rook;

public class GameEnd extends Location{
   public static int impos(int turn){
         int imp = 0;
         Rook Rook =new Rook();
         Bishop Bishop =new Bishop();
         Queen Queen =new Queen();
         King King =new King();
         Knight Knight =new Knight();
         Pawn Pawn =new Pawn();
         for(int i=0;i<8;i++)
            {
               for(int j=0;j<8;j++)
               {
                  if(loc[i][j]/16 == turn)
                  {
                     for(int k=0;k<8;k++)
                   {
                       for(int l=0;l<8;l++)
                          {
                             Pos[k][l]=0;
                          }
                    }
                     
                     if(loc[i][j]%0x10==0||loc[i][j]%0x10==7)
                      Rook.possible2(i, j, loc[i][j]);
                   else if(loc[i][j]%0x10==1||loc[i][j]%0x10==6)
                      Knight.possible2(i, j, loc[i][j]);
                   else if(loc[i][j]%0x10==2||loc[i][j]%0x10==5)
                      Bishop.possible2(i, j, loc[i][j]);
                   else if(loc[i][j]%0x10==4)
                      King.possible2(i, j, loc[i][j]);
                   else if(loc[i][j]%0x10==3)
                      Queen.possible2(i, j, loc[i][j]);
                   else if(loc[i][j]%0x10>=8&&loc[i][j]%0x10<=15)
                      Pawn.possible2(i, j, loc[i][j]);
                 //    King.possible2(i, j, loc[i][j]);
                  Piece.limit_possible(i,j,loc[i][j]);
                  //   PrintPos();
                     
                     for(int k=0;k<8;k++)
                     {
                        for(int l=0;l<8;l++)
                           {
                              imp+=Pos[k][l];
                           }
                     }
                     
                   
                  }
               }
            }
         return imp;
   }
   public static int impos2(int turn){
       int imp = 0;
       Rook Rook =new Rook();
       Bishop Bishop =new Bishop();
       Queen Queen =new Queen();
       King King =new King();
       Knight Knight =new Knight();
       Pawn Pawn =new Pawn();
       for(int i=0;i<14;i++)
          {
             for(int j=0;j<14;j++)
             {
                if(loc[i][j]/16 == turn)
                {
                   for(int k=0;k<14;k++)
                 {
                     for(int l=0;l<14;l++)
                        {
                           Pos[k][l]=0;
                        }
                  }
                   
                   if(loc[i][j]%0x10==0||loc[i][j]%0x10==7)
                    Rook.possible2(i, j, loc[i][j]);
                 else if(loc[i][j]%0x10==1||loc[i][j]%0x10==6)
                    Knight.possible2(i, j, loc[i][j]);
                 else if(loc[i][j]%0x10==2||loc[i][j]%0x10==5)
                    Bishop.possible2(i, j, loc[i][j]);
                 else if(loc[i][j]%0x10==4)
                    King.possible2(i, j, loc[i][j]);
                 else if(loc[i][j]%0x10==3)
                    Queen.possible2(i, j, loc[i][j]);
                 else if(loc[i][j]%0x10>=8&&loc[i][j]%0x10<=15)
                    Pawn.possible2(i, j, loc[i][j]);
                Piece.limit_possible2(i,j,loc[i][j]);
                //   PrintPos();
                   
                   for(int k=0;k<14;k++)
                   {
                      for(int l=0;l<14;l++)
                         {
                            imp+=Pos[k][l];
                         }
                   }
                   
                 
                }
             }
          }
       return imp;
 }
   
   public static int check(int turn) {
      //king 4
      
      int x=0, y=0, a, b;
      int c = 0;
      //왕 위치 찾기//
      BLABEL:
      for(int l=0;l<loc.length;l++) {
          for(int m=0;m<loc[0].length;m++) {
             if(loc[l][m]%0x10==4&&loc[l][m]/0x10==turn) {
                x=l;
                y=m;
                break BLABEL;
             }
          }
      }
      
      if(turn == 1) {

         if(x+1<8) {
            if(loc[x+1][y]==0x24)
               c=1;
         }
         if(x+1<8&&y+1<8) {
            if(loc[x+1][y+1]==0x24)
               c=1;
         }
         if(x+1<8&&y-1>=0) {
            if(loc[x+1][y-1]==0x24)
            	c=1;
         }
         if(y-1>=0) {
            if(loc[x][y-1]==0x24)
            	c=1;
         }
         if(y+1<8) {
            if(loc[x][y+1]==0x24)
            	c=1;
         }
         if(x-1>=0&&y-1>=0) {
            if(loc[x-1][y-1]==0x24)
            	c=1;
         }
         if(x-1>=0){
            if(loc[x-1][y]==0x24)
            	c=1;
         }
         if(x-1>=0&&y+1<8) {
            if(loc[x-1][y+1]==0x24)
            	c=1;
      }
         
         
         
    //상하좌우 룩 체크
      a = x; b = y;
      try{
         a++;
         while(loc[a][b]==0)
         a++;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      a = x; b = y;
      try{
         a--;
         while(loc[a][b]==0)
         a--;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      a = x; b = y;
      try{
         b++;
         while(loc[a][b]==0)
         b++;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      a = x; b = y;
      try{
         b--;
         while(loc[a][b]==0)
         b--;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      
      
      //대각선 비숍퀸 체크
      a = x; b = y;
      try{
         a++;
         b++;
         while(loc[a][b]==0)
         {a++;
         b++;}
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      a = x; b = y;
      try{
         a--;
         b++;
         while(loc[a][b]==0)
         {a--;
         b++;}
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      a = x; b = y;
      try{
         a++;
         b--;
         while(loc[a][b]==0)
         {a++;
         b--;}
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      a = x; b = y;
      try{
         a--;
         b--;
         while(loc[a][b]==0)
         {a--;
         b--;}
      }
      catch(ArrayIndexOutOfBoundsException e){}
      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23)   
         c = 1;
      }
      catch(ArrayIndexOutOfBoundsException e){}
      
      
      //나이트 체크
      try   {
             if(loc[x+2][y+1] == 0x21 || loc[x+2][y+1] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x+2][y-1] == 0x21 || loc[x+2][y-1] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x-2][y+1] == 0x21 || loc[x-2][y+1] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x-2][y-1] == 0x21 || loc[x-2][y-1] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x+1][y+2] == 0x21 || loc[x+1][y+2] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x-1][y+2] == 0x21 || loc[x-1][y+2] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x+1][y-2] == 0x21 || loc[x+1][y-2] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
          try {
             if(loc[x-1][y-2] == 0x21 || loc[x-1][y-2] == 0x26)
                c = 1;
          }
          catch(ArrayIndexOutOfBoundsException e){}
      
      //폰 체크
          try{if(loc[x-1][y+1]/16==2&&loc[x-1][y+1]%16>7)   
              c = 1;
           }
           catch(ArrayIndexOutOfBoundsException e){}
            try{if(loc[x-1][y-1]/16==2&&loc[x-1][y-1]%16>7)   
              c = 1;
           }
           catch(ArrayIndexOutOfBoundsException e){}
      
      }
      
      else
      {
         if(x+1<8) {
            if(loc[x+1][y]==0x14)
              c=1;
         }
         if(x+1<8&&y+1<8) {
            if(loc[x+1][y+1]==0x14)
            	c=1;
         }
         if(x+1<8&&y-1>=0) {
            if(loc[x+1][y-1]==0x14)
            	c=1;
         }
         if(y-1>=0) {
            if(loc[x][y-1]==0x14)
            	c=1;
         }
         if(y+1<8) {
            if(loc[x][y+1]==0x14)
            	c=1;
         }
         if(x-1>=0&&y-1>=0) {
            if(loc[x-1][y-1]==0x14)
            	c=1;
         }
         if(x-1>=0){
            if(loc[x-1][y]==0x14)
            	c=1;
         }
         if(x-1>=0&&y+1<8) {
            if(loc[x-1][y+1]==0x14)
            	c=1;
      }
         
         
         //상하좌우 룩 체크
         a = x; b = y;
         try{
            a++;
            while(loc[a][b]==0)
            a++;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         a = x; b = y;
         try{
            a--;
            while(loc[a][b]==0)
            a--;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         a = x; b = y;
         try{
            b++;
            while(loc[a][b]==0)
            b++;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         a = x; b = y;
         try{
            b--;
            while(loc[a][b]==0)
            b--;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         
         
         //대각선 비숍퀸 체크
         a = x; b = y;
         try{
            a++;
            b++;
            while(loc[a][b]==0)
            {a++;
            b++;}
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         a = x; b = y;
         try{
            a--;
            b++;
            while(loc[a][b]==0)
            {a--;
            b++;}
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         a = x; b = y;
         try{
            a++;
            b--;
            while(loc[a][b]==0)
            {a++;
            b--;}
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         a = x; b = y;
         try{
            a--;
            b--;
            while(loc[a][b]==0)
            {a--;
            b--;}
         }
         catch(ArrayIndexOutOfBoundsException e){}
         try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13)   
            c = 1;
         }
         catch(ArrayIndexOutOfBoundsException e){}
         
         
         //나이트 체크
         try   {
                if(loc[x+2][y+1] == 0x11 || loc[x+2][y+1] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x+2][y-1] == 0x11 || loc[x+2][y-1] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x-2][y+1] == 0x11 || loc[x-2][y+1] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x-2][y-1] == 0x11 || loc[x-2][y-1] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x+1][y+2] == 0x11 || loc[x+1][y+2] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x-1][y+2] == 0x11 || loc[x-1][y+2] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x+1][y-2] == 0x11 || loc[x+1][y-2] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
             try {
                if(loc[x-1][y-2] == 0x11 || loc[x-1][y-2] == 0x16)
                   c = 1;
             }
             catch(ArrayIndexOutOfBoundsException e){}
         
         //폰 체크
            
             try{if(loc[x+1][y+1]/16==1&&loc[x+1][y+1]%16>7)   
                 c = 1;
              }
              catch(ArrayIndexOutOfBoundsException e){}
               try{if(loc[x+1][y-1]/16==1&&loc[x+1][y-1]%16>7)   
                 c = 1;
              }
              catch(ArrayIndexOutOfBoundsException e){}

      }
      return c;

   }
   
   public static int check2(int turn) {
	      //king 4
	      
	      int x=0, y=0, a, b;
	      int c = 0;
	      //왕 위치 찾기//
	      BLABEL:
	      for(int l=0;l<loc.length;l++) {
	          for(int m=0;m<loc[0].length;m++) {
	             if(loc[l][m]%0x10==4&&loc[l][m]/0x10==turn) {
	                x=l;
	                y=m;
	                break BLABEL;
	             }
	          }
	      }
	      
	      if(turn == 1 || turn == 3) {

	         if(x+1<14) {
	            if(loc[x+1][y]==0x24||loc[x+1][y]==0x44)
	            	c=1;
	         }
	         if(x+1<14&&y+1<14) {
	            if(loc[x+1][y+1]==0x24||loc[x+1][y+1]==0x44)
	            	c=1;
	         }
	         if(x+1<14&&y-1>=0) {
	            if(loc[x+1][y-1]==0x24||loc[x+1][y-1]==0x44)
	            	c=1;
	         }
	         if(y-1>=0) {
	            if(loc[x][y-1]==0x24||loc[x][y-1]==0x44)
	            	c=1;
	         }
	         if(y+1<14) {
	            if(loc[x][y+1]==0x24||loc[x][y+1]==0x44)
	            	c=1;
	         }
	         if(x-1>=0&&y-1>=0) {
	            if(loc[x-1][y-1]==0x24||loc[x-1][y-1]==0x44)
	            	c=1;
	         }
	         if(x-1>=0){
	            if(loc[x-1][y]==0x24||loc[x-1][y]==0x44)
	            	c=1;
	         }
	         if(x-1>=0&&y+1<14) {
	            if(loc[x-1][y+1]==0x24||loc[x-1][y+1]==0x44)
	            	c=1;
	      }
	         
	         
	         
	    //상하좌우 룩 체크
	      a = x; b = y;
	      try{
	         a++;
	         while(loc[a][b]==0)
	         a++;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23||loc[a][b]==0x40||loc[a][b]==0x47||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      a = x; b = y;
	      try{
	         a--;
	         while(loc[a][b]==0)
	         a--;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23||loc[a][b]==0x40||loc[a][b]==0x47||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      a = x; b = y;
	      try{
	         b++;
	         while(loc[a][b]==0)
	         b++;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23||loc[a][b]==0x40||loc[a][b]==0x47||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      a = x; b = y;
	      try{
	         b--;
	         while(loc[a][b]==0)
	         b--;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x20||loc[a][b]==0x27||loc[a][b]==0x23||loc[a][b]==0x40||loc[a][b]==0x47||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      
	      
	      //대각선 비숍퀸 체크
	      a = x; b = y;
	      try{
	         a++;
	         b++;
	         while(loc[a][b]==0)
	         {a++;
	         b++;}
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23||loc[a][b]==0x42||loc[a][b]==0x45||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      a = x; b = y;
	      try{
	         a--;
	         b++;
	         while(loc[a][b]==0)
	         {a--;
	         b++;}
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23||loc[a][b]==0x42||loc[a][b]==0x45||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      a = x; b = y;
	      try{
	         a++;
	         b--;
	         while(loc[a][b]==0)
	         {a++;
	         b--;}
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23||loc[a][b]==0x42||loc[a][b]==0x45||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      a = x; b = y;
	      try{
	         a--;
	         b--;
	         while(loc[a][b]==0)
	         {a--;
	         b--;}
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      try{if(loc[a][b]==0x22||loc[a][b]==0x25||loc[a][b]==0x23||loc[a][b]==0x42||loc[a][b]==0x45||loc[a][b]==0x43)   
	         c = 1;
	      }
	      catch(ArrayIndexOutOfBoundsException e){}
	      
	      
	      //나이트 체크
	      try   {
	             if(loc[x+2][y+1] == 0x21 || loc[x+2][y+1] == 0x26 || loc[x+2][y+1] == 0x41 || loc[x+2][y+1] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x+2][y-1] == 0x21 || loc[x+2][y-1] == 0x26 || loc[x+2][y-1] == 0x41 || loc[x+2][y-1] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x-2][y+1] == 0x21 || loc[x-2][y+1] == 0x26 || loc[x-2][y+1] == 0x41 || loc[x-2][y+1] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x-2][y-1] == 0x21 || loc[x-2][y-1] == 0x26 || loc[x-2][y-1] == 0x41 || loc[x-2][y-1] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x+1][y+2] == 0x21 || loc[x+1][y+2] == 0x26 || loc[x+1][y+2] == 0x41 || loc[x+1][y+2] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x-1][y+2] == 0x21 || loc[x-1][y+2] == 0x26 || loc[x-1][y+2] == 0x41 || loc[x-1][y+2] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x+1][y-2] == 0x21 || loc[x+1][y-2] == 0x26 || loc[x+1][y-2] == 0x41 || loc[x+1][y-2] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	          try {
	             if(loc[x-1][y-2] == 0x21 || loc[x-1][y-2] == 0x26 || loc[x-1][y-2] == 0x41 || loc[x-1][y-2] == 0x46)
	                c = 1;
	          }
	          catch(ArrayIndexOutOfBoundsException e){}
	      
	      //폰 체크
	          try{if(loc[x-1][y+1]/16==4&&loc[x-1][y+1]%16>7)   
	              c = 1;
	           }
	           catch(ArrayIndexOutOfBoundsException e){}
	          try{if(loc[x+1][y+1]/16==4&&loc[x+1][y+1]%16>7)   
	              c = 1;
	           }
	           catch(ArrayIndexOutOfBoundsException e){}
	          try{if(loc[x+1][y-1]/16==2&&loc[x-1][y-1]%16>7)   
	              c = 1;
	           }
	           catch(ArrayIndexOutOfBoundsException e){}
	            try{if(loc[x-1][y-1]/16==2&&loc[x-1][y-1]%16>7)   
	              c = 1;
	           }
	           catch(ArrayIndexOutOfBoundsException e){}
	      
	      }
	      
	      else {

		         if(x+1<14) {
		            if(loc[x+1][y]==0x14||loc[x+1][y]==0x34)
		            	c=1;
		         }
		         if(x+1<14&&y+1<14) {
		            if(loc[x+1][y+1]==0x14||loc[x+1][y+1]==0x34)
		            	c=1;
		         }
		         if(x+1<14&&y-1>=0) {
		            if(loc[x+1][y-1]==0x14||loc[x+1][y-1]==0x34)
		            	c=1;
		         }
		         if(y-1>=0) {
		            if(loc[x][y-1]==0x14||loc[x][y-1]==0x34)
		            	c=1;
		         }
		         if(y+1<14) {
		            if(loc[x][y+1]==0x14||loc[x][y+1]==0x34)
		            	c=1;
		         }
		         if(x-1>=0&&y-1>=0) {
		            if(loc[x-1][y-1]==0x14||loc[x-1][y-1]==0x34)
		            	c=1;
		         }
		         if(x-1>=0){
		            if(loc[x-1][y]==0x14||loc[x-1][y]==0x34)
		            	c=1;
		         }
		         if(x-1>=0&&y+1<14) {
		            if(loc[x-1][y+1]==0x14||loc[x-1][y+1]==0x34)
		            	c=1;
		      }
		         
		         
		         
		    //상하좌우 룩 체크
		      a = x; b = y;
		      try{
		         a++;
		         while(loc[a][b]==0)
		         a++;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13||loc[a][b]==0x30||loc[a][b]==0x37||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      a = x; b = y;
		      try{
		         a--;
		         while(loc[a][b]==0)
		         a--;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13||loc[a][b]==0x30||loc[a][b]==0x37||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      a = x; b = y;
		      try{
		         b++;
		         while(loc[a][b]==0)
		         b++;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13||loc[a][b]==0x30||loc[a][b]==0x37||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      a = x; b = y;
		      try{
		         b--;
		         while(loc[a][b]==0)
		         b--;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x10||loc[a][b]==0x17||loc[a][b]==0x13||loc[a][b]==0x30||loc[a][b]==0x37||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      
		      
		      //대각선 비숍퀸 체크
		      a = x; b = y;
		      try{
		         a++;
		         b++;
		         while(loc[a][b]==0)
		         {a++;
		         b++;}
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13||loc[a][b]==0x32||loc[a][b]==0x35||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      a = x; b = y;
		      try{
		         a--;
		         b++;
		         while(loc[a][b]==0)
		         {a--;
		         b++;}
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13||loc[a][b]==0x32||loc[a][b]==0x35||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      a = x; b = y;
		      try{
		         a++;
		         b--;
		         while(loc[a][b]==0)
		         {a++;
		         b--;}
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13||loc[a][b]==0x32||loc[a][b]==0x35||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      a = x; b = y;
		      try{
		         a--;
		         b--;
		         while(loc[a][b]==0)
		         {a--;
		         b--;}
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      try{if(loc[a][b]==0x12||loc[a][b]==0x15||loc[a][b]==0x13||loc[a][b]==0x32||loc[a][b]==0x35||loc[a][b]==0x33)   
		         c = 1;
		      }
		      catch(ArrayIndexOutOfBoundsException e){}
		      
		      
		      //나이트 체크
		      try   {
		             if(loc[x+2][y+1] == 0x11 || loc[x+2][y+1] == 0x16 || loc[x+2][y+1] == 0x31 || loc[x+2][y+1] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x+2][y-1] == 0x11 || loc[x+2][y-1] == 0x16 || loc[x+2][y-1] == 0x31 || loc[x+2][y-1] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x-2][y+1] == 0x11 || loc[x-2][y+1] == 0x16 || loc[x-2][y+1] == 0x31 || loc[x-2][y+1] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x-2][y-1] == 0x11 || loc[x-2][y-1] == 0x16 || loc[x-2][y-1] == 0x31 || loc[x-2][y-1] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x+1][y+2] == 0x11 || loc[x+1][y+2] == 0x16 || loc[x+1][y+2] == 0x31 || loc[x+1][y+2] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x-1][y+2] == 0x11 || loc[x-1][y+2] == 0x16 || loc[x-1][y+2] == 0x31 || loc[x-1][y+2] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x+1][y-2] == 0x11 || loc[x+1][y-2] == 0x16 || loc[x+1][y-2] == 0x31 || loc[x+1][y-2] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		          try {
		             if(loc[x-1][y-2] == 0x11 || loc[x-1][y-2] == 0x16 || loc[x-1][y-2] == 0x31 || loc[x-1][y-2] == 0x36)
		                c = 1;
		          }
		          catch(ArrayIndexOutOfBoundsException e){}
		      
		      //폰 체크
		          try{if(loc[x-1][y+1]/16==3&&loc[x-1][y+1]%16>7)   
		              c = 1;
		           }
		           catch(ArrayIndexOutOfBoundsException e){}
		          try{if(loc[x+1][y+1]/16==1&&loc[x+1][y+1]%16>7)   
		              c = 1;
		           }
		           catch(ArrayIndexOutOfBoundsException e){}
		          try{if(loc[x+1][y-1]/16==1&&loc[x-1][y-1]%16>7)   
		              c = 1;
		           }
		           catch(ArrayIndexOutOfBoundsException e){}
		            try{if(loc[x-1][y-1]/16==3&&loc[x-1][y-1]%16>7)   
		              c = 1;
		           }
		           catch(ArrayIndexOutOfBoundsException e){}
		      
		      }
	      
	      
	      
	      return c;

	   }
   
}