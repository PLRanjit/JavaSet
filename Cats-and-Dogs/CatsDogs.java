import java.util.Scanner;
class CatsDogs {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int j=0, count = 0;
  
  int[] c = new int[n];
  int[] d = new int[n];
  int[] l = new int[n];
  
  for (j = 0; j < n; j++) {
   c[j] = sc.nextInt();
   d[j] = sc.nextInt();
   l[j] = sc.nextInt();
  }
  
  for (j = 0; j < n; j++) {
    if(((l[j]%4) == 0) && ((l[j] >= (d[j] * 4)) && (l[j] <= ((d[j]+c[j])*4))))
    {
      if((c[j] >= d[j]))
      {
        if((l[j] >= ((d[j] + (c[j] - 2 * (d[j]))) * 4)))
        {
          System.out.println("yes");
        }else{
          System.out.println("no");
        }
      }else{
          System.out.println("yes");
      }
    }else{
      System.out.println("no");
    }
  }
 }
}
