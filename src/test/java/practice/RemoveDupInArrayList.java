package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupInArrayList {
    public static void main(String[] args) {
        System.out.println(removeDup1(new ArrayList<>(Arrays.asList("banana", "apple", "apple", "banana"))));
        System.out.println(Arrays.toString(removeDUp(new String[]{"banana","apple","apple","banana"})));
        System.out.println(Arrays.toString(removeDUp1(new String[]{"banana", "apple", "apple", "banana"})));
    }

    public static ArrayList<String> removeDup(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (list1.contains(s)) {
                continue;
            }
            list1.add(s);
        }
        return list1;
    }
    public static ArrayList<String> removeDup1(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (!list1.contains(s)) {
                list1.add(s);
            }

        }
        return list1;
    }
    public static ArrayList<String> removeDup2(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
   public static String[] removeDUp(String[] array){
        HashSet<String> set = new HashSet<>(Arrays.asList(array));
        return set.toArray(new String[set.size()]);
   }

    public static String[] removeDUp1(String[] array){
    ArrayList<String> list = new ArrayList<>();

    for (String s : array){
        if(!list.contains(s))list.add(s);
    }
    String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }

        return arr;
    }
}
