package lessons.lesson16.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Bananas");
        queue.add("Apel");
        queue.add("Cucumber");
        queue.add("Kivi");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
    }
}

