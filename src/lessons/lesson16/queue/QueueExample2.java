package lessons.lesson16.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Bananas");
        queue.add("Apel");
        queue.add("Cucumber");
        queue.add("Kivi");
        while (queue.peek() != null){
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
    }
}
