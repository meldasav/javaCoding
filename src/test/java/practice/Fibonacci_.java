package practice;

public class Fibonacci_ {
    public static void main(String[] args) {

        int number = 20;
        int n1 = 0, n2 = 1, n3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb.substring(0, sb.length() - 1));

    }
}
