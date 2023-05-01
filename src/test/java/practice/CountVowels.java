package practice;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("MeldaA1"));
    }
    public static int countVowels(String word) {

        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }

    public static int countVowels1(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            /**
            Program, belirtilen dizinden başlayarak cümleyi tarar ve istediğiniz harfi bulana kadar devam eder.
            Eğer harfi bulursa, ilk kez göründüğü konumu size söyler. Harfi bulamazsa, -1 der,
            bu da harfin hiçbir şekilde cümlede olmadığı anlamına gelir.
             */
            if(vowels.indexOf(str.charAt(i)) != -1)count++;
        }
        return count;
    }

}
