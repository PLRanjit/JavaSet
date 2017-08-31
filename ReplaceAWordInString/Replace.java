class Replace {
 public static void main(String[] args) {
  String s = "WUBWUBIWUBAMWUBWUBX";
  String newS = "";
  String[] arr = s.split("WUB");
  
  for (String ss: arr) {
    if(ss.equals(""))
    {
      ss = " ";
    }
   newS = newS +" " + ss;
  }
  newS = newS.trim().replaceAll("\\s{2,}", " ");
  System.out.println(newS);
 }
}

/*
//we can also do it as...
s.replaceAll("(WUB)+", " ").trim(); //#Codewars
/////////
Arrays.stream(s.split("WUB"))
                   .filter(i -> !"".equals(i))
                   .collect(Collectors.joining(" ")); //#codewars
*/
