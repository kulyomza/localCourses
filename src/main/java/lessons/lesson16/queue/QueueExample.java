package lessons.lesson16.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    static Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {
        addMethod(myQueue);
        elementExample(myQueue);

    }
    //return up element, in case empty element of list drop Exception
    static void elementExample(Queue<Integer> queue) {
        System.out.println(queue.element());
    }
    //return up element, in case empty element of list don't drop Exception and return null
    static void peakExample(Queue<Integer> queue) {
        System.out.println(queue.peek());

    }
    static void offerExample(Queue<Integer> queue, int obj) {
        System.out.println("Before using offer method");
        showQueue(queue);
        queue.offer(obj);
        System.out.println('\n' + "After using offer method");
        showQueue(queue);
    }
    static void removeByObjectExample(Queue<Integer> queue, int obj) {
        System.out.println("Before deleting with remove by object method ");
        showQueue(queue);
        queue.remove(obj);
        System.out.println('\n' + "After deleting with remove by object method");
        showQueue(queue);
    }
    static void removeExample(Queue<Integer> queue) {
        System.out.println("Before deleting with remove method");
        showQueue(queue);
        queue.remove();
        System.out.println('\n' + "After deleting with remove method");
        showQueue(queue);
    }

    // delete up element, in empty case don't throw Exception
    static void pollExample(Queue<Integer> queue){
        System.out.println("Before deleting with poll method");
        showQueue(queue);
        queue.poll();
        System.out.println('\n' + "After deleting with poll method");

        showQueue(queue);

    }

    static void addMethod(Queue<Integer> queue){
        queue.add(3);
        queue.add(6);
        queue.add(34);
        queue.add(45);
        queue.add(67);
    }
    static void showQueue(Queue<Integer> queue){
        for (Integer i: queue) {
            System.out.print(i + " ");

        }
    }
}
