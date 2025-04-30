package com.stack;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);

        queue.display();

        System.out.println(queue.remove());

        queue.display();


    }
}

//25049027374
//MAHB0000B12