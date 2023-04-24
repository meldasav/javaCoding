package practice;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome1("madam"));
    }

    public static boolean isPalindrome(String str){

        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().equals(str);
    }

    public static boolean isPalindrome1(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
