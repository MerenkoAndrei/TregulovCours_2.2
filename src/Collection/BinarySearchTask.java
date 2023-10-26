package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(0);
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(25);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(160);
        arrayList.add(70);
        arrayList.add(28);
        arrayList.add(7);
        System.out.println(arrayList.size());
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);
        Collections.sort(arrayList);
        int index2 = Collections.binarySearch(arrayList, 12);
        System.out.println(arrayList);
        System.out.println(index2);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

    }
}
