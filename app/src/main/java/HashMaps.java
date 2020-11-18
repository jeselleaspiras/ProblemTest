import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {

    private static final int MAX_ENTRIES = 100;

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hMap = new LinkedHashMap<Integer, String>() {
                    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)
                    {
                        return size() > MAX_ENTRIES;
                    }
                };

    }
}
