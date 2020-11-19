import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMaps {

    private static final int MAX_ENTRIES = 100;

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>() {
                    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)
                    {
                        return size() > MAX_ENTRIES;
                    }
                };

        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(22, "Apple");
        hMap.put(39, "Banana");
        hMap.put(18, "Chico");
        hMap.put(50, "Dalandan");
        hMap.put(47, "Eggplant");

        System.out.println("HashMap: ");
//        System.out.println(Arrays.asList(hMap));
        System.out.println(Collections.singletonList(hMap));

        System.out.println("Sorting HashMap by keys: ");
        List<Integer> sortKeys = new ArrayList<>(hMap.keySet());
        Collections.sort(sortKeys);
        System.out.println(Collections.singletonList(sortKeys));

        System.out.println("Sorting HashMap by values: ");
        List<String> sortValues = new ArrayList<>(hMap.values());
        Collections.sort(sortValues);
        System.out.println(Collections.singletonList(sortValues));

    }
}
