package practice;

public class SwapFirstLastWord {
    public static void main(String[] args) {
        String sentence = "Selenium is automation tool";

        if (sentence.trim().indexOf(' ') >= 0) {
            String first = sentence.substring(0, sentence.indexOf(' '));
            String middle = sentence.substring(sentence.indexOf(' ') + 1,sentence.lastIndexOf(' '));
            String last = sentence.substring(sentence.lastIndexOf(' ')+1);
            System.out.println(last+" "+ middle + " " + first);
        }else {
            System.out.println("This sentence has not ");
        }
    }
}
