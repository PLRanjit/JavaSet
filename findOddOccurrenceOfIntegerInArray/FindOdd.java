import java.util.*;
class FindOdd {
  public static void main(String[] args) {

    int[] A = {1,1,2,-2,5,2,4,4,-1,-2,5};
     
    List<Integer> intList = new ArrayList<Integer>();
    for (int index = 0; index < A.length; index++)
    {
    intList.add(A[index]);
    }

    Set<Integer> set = new LinkedHashSet<Integer>(intList);
    int[] occur = new int[set.size()];
    int i = 0;

    for(Integer s : set)
    {
       occur[i]= Collections.frequency(intList, s);
       if(occur[i]%2 != 0)
       {
         System.out.println(s);
       }
       i++;
    }
  }
}
