import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Strings {

    public static void main(String[] args) {

        String s1 = "abcdefg";
        String s2 = "efgabcd";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        // Check if two strings are rotation of each other
        String s3 = s1 + s1;
        if ( s1.length() == s2.length() )
            if ( !s3.contains(s2) )
                System.out.println("Strings are not a rotation of each other.");
            else
                System.out.println(s1 + " is a rotation of " + s2);
        else
            System.out.println("Strings are not a rotation of each other.");

        // Check if two strings are anagrams of each other
        if ( s1.length() == s2.length() )
            if ( !Arrays.equals(c1, c2) )
                System.out.println("Strings are not an anagram of each other.");
            else
                System.out.println(s1 + " is an anagram of " + s2);
        else
            System.out.println("Strings are not an anagram of each other.");

        // Count a number of vowels and consonants in a string
        int countVowels = 0;
        int countConsonants = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
                countVowels++;
            else if(s1.charAt(i) >= 'a' && s1.charAt(i)<='z')
                countConsonants++;
        }
        System.out.println(s1 + " has " + countVowels + " vowels and " + countConsonants + " consonants.");

        // Replace each given character to other e.g. blank with %20
        String s4 = "Hello World! Welcome to my code!";
        String oldCharacter = " ";
        String newCharacter = "%20";
        System.out.println(s4.replace(oldCharacter, newCharacter));

        // Print first non repeated character from string
        String s5 = "Jessie J";
        char[] c5 = s5.toCharArray();
        for (int i = 0; i < s5.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s5.length(); j++) {
                if (i != j && c5[i] == c5[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("First non-repeated character of " + s5 + " is: " + c5[i]);
                break;
            }
        }

        // Find the longest substring without repeating characters
        String s6 = "helloworld!";
        String res = "";
        Map<Character, Integer> visited = new HashMap<>();
        for (int start=0, end=0; end < s6.length(); end++) {
            char current = s6.charAt(end);
            if (visited.containsKey(current)) {
                start = Math.max(visited.get(current)+1, start);
            }
            if (res.length() < end - start + 1) {
                res = s6.substring(start, end + 1);
            }
            visited.put(current, end);
        }
        System.out.println("Longest substring of " + s6 + " is: " + res);

        // Find all permutations of string
        System.out.println("Permutations of abc are: ");
        permutation("abc");
    }

    public static void permutation(String word) {
        permutation("", word);
    }

    private static void permutation(String prefix, String word) {
        int n = word.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + word.charAt(i), word.substring(0, i) + word.substring(i+1, n));
        }
    }

}
