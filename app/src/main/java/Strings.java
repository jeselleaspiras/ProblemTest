import java.util.Arrays;

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

        // Print first non repeated character from string
//        System.out.println( s1.indexOf());

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




    }
}
