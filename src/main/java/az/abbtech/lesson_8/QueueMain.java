package az.abbtech.lesson_8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        queue.offer("World");
        queue.offer("Hello Everybody");
        queue.offer("Hello");
        queue.peek();
        queue.poll();
        queue.remove("Hello Everybody");
        for (String s : queue) {
            System.out.println(s);
        }
        };
    }
