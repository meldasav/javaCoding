package practice;

public class sumInTheString {
    public static void main(String[] args) {

        String name = "Melda1983";

        int sum = 0;
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c + "");
            }
        }
        System.out.println(sum);
    }
}
