package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTask {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Andrey");
        arrayList.add("Alex");
        arrayList.add("Maria");

        Iterator<String> itr = arrayList.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(arrayList);
    }
}
