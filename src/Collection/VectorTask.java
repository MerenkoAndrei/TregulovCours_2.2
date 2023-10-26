package Collection;

import java.util.Vector;

public class VectorTask {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("Z");
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.remove(2);
        System.out.println(v);
    }
}
