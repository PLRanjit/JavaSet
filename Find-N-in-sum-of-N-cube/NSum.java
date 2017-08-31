import java.util.Scanner;
class NSum {
 public static void main(String[] args) {

  //long m = 24723578342962L;
  Scanner sc = new Scanner(System.in);
  long m;
  m = sc.nextLong();
  boolean nn = true;
  long strt = 1L, end = 500L;
  long ans = -1;
  long g = (long) Math.sqrt(m);
  while (nn) {
   if (g <= ((end * (end + 1))/2) && m == (g*g))    {    //(m <= ((Math.pow((end * (end + 1) / 2), 2)))) {
    for (long n = strt; n <= end; n++) {
     if (g == ((n * (n + 1))/2)) {
      ans = n;
     } else {
      nn = false;
     }
    }
   }else if(g <= ((end * (end + 1))/2)){
     break;
   }
   end = end + 500L;
   strt = strt + 500L;
  }
  System.out.println(ans);
 }
}
