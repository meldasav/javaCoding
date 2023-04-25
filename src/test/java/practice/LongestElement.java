package practice;

public class LongestElement {

    public static void main(String[] args) {
        System.out.println(secondLongestWord(new String[] {"purple","orange","yellow","brown"}));
    }

    public static String secondLongestWord(String[] array){
        String longest = "";
        String secondLongest= "";

        for(String s : array){
            if(s.length() > longest.length()){
                secondLongest = longest;
                longest = s;
            }else if(s.length() > secondLongest.length() || secondLongest.equals("")){
                secondLongest = s;
            }
        }
        return "Longest word is " + secondLongest + " in the array.";
    }
}
