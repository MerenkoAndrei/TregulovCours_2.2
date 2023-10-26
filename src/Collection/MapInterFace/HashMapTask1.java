package Collection.MapInterFace;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Andrey");
        map.put(2344, "Alex");
        map.put(3543, "Anna");
        map.putIfAbsent(6535, "Oleg");
        System.out.println(map);
        System.out.println(map.get(1000));
        map.remove(2344);
        System.out.println(map);
        System.out.println(map.containsValue("Anna"));
        System.out.println(map.containsKey(3543));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
