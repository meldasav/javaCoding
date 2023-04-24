package practice;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String str = "JAVA    IS     FUN";
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        System.out.println(sb);

        String input = "   Hello     world   !   ";

// Split the input string into words using one or more spaces as the delimiter
        String[] words = input.trim().split("\\s+");

// Concatenate the words using a single space
        StringBuilder outputBuilder = new StringBuilder();
        for (String word : words) {
            outputBuilder.append(word).append(" ");
        }
        String output = outputBuilder.toString().trim();

        System.out.println(output); // "Hello world !"

    }

}

