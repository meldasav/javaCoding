package practice;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        StringBuilder sb = new StringBuilder();
        for (String s : sentence.split(" ")){
            for (int i = s.length()-1; i >=0 ; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
