package practice;

import java.util.StringTokenizer;

public class CountTheWords {
    public static void main(String[] args) {
        String str = "java is fun";
        System.out.println(str.split(" ").length);

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== (' ') && str.charAt(i + 1) != (' '))count++;
        }
        System.out.println(count);

        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        for(String s : str.split(" ")){
            System.out.println(s);
        }
    }

}