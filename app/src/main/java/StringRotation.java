public class StringRotation {

    public static void main(String[] args) {

        String s1 = "abcdefg";
        String s2 = "efgabcd";
        String s3 = s1 + s1;

        if ( s1.length() == s2.length() )
            if ( !s3.contains(s2) )
                System.out.println("Strings are not a rotation of each other.");
            else
                System.out.println(s1 + " is a rotation of " + s2);
        else
            System.out.println("Strings are not a rotation of each other.");

    }
}
