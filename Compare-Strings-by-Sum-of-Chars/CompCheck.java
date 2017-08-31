import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class CompCheck {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    boolean ans = false;
    int sum1 = 0, sum2 = 0, i;
    s1 = (s1==null) ? "" : s1;
    s2 = (s2==null) ? "" : s2;
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();

    Pattern p = Pattern.compile("[^A-Z]");
    Matcher m1 = p.matcher(s1);
    Matcher m2 = p.matcher(s2);
    boolean b1 = m1.find();
    boolean b2 = m2.find();
    
    s1 = (b1) ? "" : s1;
    s2 = (b2) ? "" : s2;
    if(s1.length() != 0){for(i = 0; i < s1.length() ; i++){sum1 = sum1 + s1.charAt(i);}}
    if(s2.length() != 0){for(i = 0; i < s2.length() ; i++){sum2 = sum2 + s2.charAt(i);}}
    ans = (sum1 == sum2 ) ? true : false;
        
    System.out.println(ans ? "Equal" : "Not Equal");
    
    /*
    if (s1 == null || !s1.matches("[a-zA-Z]+")) s1 = "";      //Other Solutions Code war...
    if (s2 == null || !s2.matches("[a-zA-Z]+")) s2 = "";
    
    return s1.toUpperCase().chars().sum() == s2.toUpperCase().chars().sum();
    */
  }
}
