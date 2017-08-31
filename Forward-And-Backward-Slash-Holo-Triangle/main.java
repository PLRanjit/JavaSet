import java.util.Scanner;
class Main {
 public static void main(String[] args) {
  int i, j, k, n;
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
  for (i = 1; i <= n; i++) {

   for (j = (n - 1); j >= i; j--) {
    System.out.print(" ");
   }

   System.out.print("/");
   if (i < n) {
    for (k = 1; k <= (2 * i - 2); k++) {
     System.out.print(" ");
    }
   } else {
    for (k = 1; k <= (2 * i - 2); k++) {
     System.out.print("_");
    }
   }
   System.out.print("\\");
   System.out.println("");
  }
 }
}
