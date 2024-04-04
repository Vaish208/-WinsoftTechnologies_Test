import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsHashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        countWords(str);
    }

    public static void countWords(String str) {
        String[] words = str.toLowerCase().split("\\s");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



// Output :- 
// Enter a string:
// hello how are you ?     (Given input)  
// how: 1
// are: 1
// hello: 1
// you: 1
// ?: 1
