package Collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTask {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("Andrey");
        q.offer("Zaur");
        q.add("Ivan");
        q.add("Olken");
        q.add("Katya");
        System.out.println(q );
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.remove("Ivan"));
        System.out.println(q);
    }
}
