package com.ronak.queue;

import java.util.*;

public class QueueUsingLinkedList {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(34);
        queue.add(54);
        queue.add(58);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        // check the next element for remove
        System.out.println(queue.element());

    }

}
