package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindMin {
    public static void main(String[] args) {
        System.out.println(min(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
    }

   public static int min(ArrayList<Integer> list){
       TreeSet<Integer> set = new TreeSet<>(list);
       return set.first();
   }
}
