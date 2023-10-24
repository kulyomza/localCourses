package lessons.lesson16.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(3);
        deque.push(6);
        deque.push(34);
        deque.push(45);
        deque.push(67);
        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }
        System.out.println(deque.size());
    }
}
