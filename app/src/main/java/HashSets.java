import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<>();

        hSet.add("Hello");
        hSet.add("World");
        hSet.add("This");
        hSet.add("Is");
        hSet.add("Jeselle");
        hSet.add("Making");
        hSet.add("A");
        hSet.add("Hash");
        hSet.add("Set");

        Iterator<String> iterator = hSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
