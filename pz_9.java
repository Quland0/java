1.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> wordCounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String mostFrequentWord = "";
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        
        System.out.println("слово, которое встречается чаще всего: " + mostFrequentWord);
    }
}

3.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            
            if (uniqueNumbers.contains(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                uniqueNumbers.add(number);
            }
        }
        
        sc.close();
    }
}

5.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Set<String>> children = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(": ");

            String name = tokens[0];
            String[] words = tokens[1].split(" ");

            Set<String> wordSet = new HashSet<>();
            for (String word : words) {
                word = word.toLowerCase();
                if (wordSet.contains(word)) {
                    continue; 
                }
                wordSet.add(word);
            }

            children.put(name, wordSet);
        }

        int k = sc.nextInt();

        Map<String, Integer> wordCount = new HashMap<>();
        for (String name : children.keySet()) {
            Set<String> wordSet = children.get(name);
            int count = 0;

            for (String word : wordSet) {
                if (word.length() >= k) {
                    count++;
                }
            }

            wordCount.put(name, count);
        }

        int maxCount = 0;
        String winner = "";
        for (String name : wordCount.keySet()) {
            int count = wordCount.get(name);
            if (count > maxCount) {
                maxCount = count;
                winner = name;
            }
        }

        System.out.println(winner + ": " + maxCount);
    }
}


