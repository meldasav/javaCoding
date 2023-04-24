package practice;

public class Interview2 {
    public static void main(String[] args) {

        String word = "automation";
        for(int i=0; i<word.length();i++){
            for(int j=i+1;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    System.out.println(word.charAt(i));
                }
            }
        }

    }
}
