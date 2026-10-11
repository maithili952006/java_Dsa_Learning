import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);  // [5, 10, 20]

        System.out.println(dq.getFirst());  // 5
        System.out.println(dq.getLast());   // 20

        dq.removeFirst();
        System.out.println(dq);  // [10, 20]

        dq.removeLast();
        System.out.println(dq);  // [10]

        System.out.println(dq.size());    // 1
        System.out.println(dq.isEmpty()); // false
    }
}