import java.io.*;
import java.util.*;
public class Bomber {
  
  static char[][]rc;
  int i,j;
  static String[] set;
  public char[][] placingBomAll(char[][]rc, int r, int c)
  {
    //Dashboard  Algorithms  Implementation  The Bomberman Game
    int i,j;
    for (i = 0; i < r; i++) {   //Placing bomb in all blocks
     for (j = 0; j < c; j++) {
      rc[i][j] = 'O';
     }
    }
    return rc;
  }
  
  public void DispRC(char[][]rc, int r, int c)
  {
    int i,j;
    for(i = 0 ; i< r; i++){     //Displaying the 2d array set
      for(j = 0 ; j < c; j++)
      {
        System.out.print(rc[i][j]);
      }
      System.out.println();
    }
  }
  
  public String[] FindPosiBomb(String[] pos,String[] set,int r)
  {
    int i, index = 0;
    for (i = 0; i < r; i++) {   //Finding position of bomb
     pos[i] = "";
     index = set[i].indexOf("O");
     while (index >= 0) {
      pos[i] = pos[i] + index + ".";
      index = set[i].indexOf("O", index + 1);
     }
    }
    return pos;
  }
  
  public char[][] liveBombAfterBlast(String[] pos,char[][]rc, int r, int c)
  {
    int len, temp = 0,i,j;
    for (i = 0; i < r; i++) {   // Finding Live Bomb Positions
     len = pos[i].length();
     if (len > 0) {
      String[] store = pos[i].split("\\.");
      for (String k: store) {
       if (k.length() != 0) {
        temp = Integer.parseInt(k);
        rc[i][temp] = '.';
        if (temp - 1 >= 0 ) {
         rc[i][temp - 1] = '.';
        }
        
        if(temp + 1 <= (c - 1))
        {
           rc[i][temp + 1] = '.';
        }
        
        if (i - 1 >= 0) {
         rc[i - 1][temp] = '.';
        }
        if(i + 1 <= (r - 1))
        {
          rc[i + 1][temp] = '.';
        }
       }
      }
     }
    }
    return rc;
  }
  
 public static void SetToRC(char[][] rc,String[] set,int r)
 {
   int i;
  for (i = 0; i < r; i++) {   //converting into MxN
   rc[i] = set[i].toCharArray();
  }
 }
 
  public static String[] RcToSet(char[][] rc,String[] set,int r, int c)
   {
    int i,j;
    for (i = 0; i < r; i++) {   //converting into MxN
    set[i] = "";
      for(j = 0; j < c; j++)
      {
        set[i] = set[i] + rc[i][j];
      }
    }
    return set;
   }
  
 public static void main(String[] args) {
   
  Main m = new Main();
  Scanner sc = new Scanner(System.in);
  int r = sc.nextInt();
  int c = sc.nextInt();
  int n = sc.nextInt();
  int i, j = 0;
  String[] pos = new String[r];
  rc = new char[r][c];
  set = new String[r];
  
  for (i = 0; i < r; i++) {   //Taking grid input
   set[i] = sc.next();
  }

  m.SetToRC(rc, set, r);                        //converting to RxC
  
  if(n%2 == 0)
  {
    rc = m.placingBomAll(rc,r,c);                //Placing Bomb All over the ground by rc
  }else if(n%2 != 0 && n != 1)
  {
    n = n%100;
    for(i = n ; i >= 3 ; i = i-2)
    {
      rc = m.placingBomAll(rc,r,c);              //Placing Bomb All over the ground by rc
      pos = m.FindPosiBomb(pos,set, r);          //Find Bomb Position from String
      rc = m.liveBombAfterBlast(pos,rc, r, c);   //After Blast Bomb Location
      set = m.RcToSet(rc,set,r,c);
    }
  }
  System.out.println();
  System.out.println();
  System.out.println();
  m.DispRC(rc,r,c);                     //Bomb Current Position by rc
 }
}
