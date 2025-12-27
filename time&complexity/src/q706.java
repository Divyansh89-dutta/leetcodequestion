import java.util.Arrays;

// HashMap implementation
class MyHashMap {

    int[] map;

    public MyHashMap() {
        // Constraint: 0 <= key <= 10^6
        map = new int[1_000_001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}

public class q706 {
    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();

        hashMap.put(1, 10);
        hashMap.put(2, 20);

        System.out.println(hashMap.get(1)); // 10
        System.out.println(hashMap.get(3)); // -1

        hashMap.put(2, 30);
        System.out.println(hashMap.get(2)); // 30

        hashMap.remove(2);
        System.out.println(hashMap.get(2)); // -1
    }
}
