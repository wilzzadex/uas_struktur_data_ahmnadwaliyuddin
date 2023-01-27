package no1;

import Model.Mahasiswa;

public class no1 {
    public static void getNo1() {
        StackQueue stack = new StackQueue(10);
        stack.push(new Mahasiswa("Ahmad", "22552011106", "TIF RM 22 A "));
        stack.push(new Mahasiswa("Willy", "22552011110", "TIF RM 22 B "));
        stack.push(new Mahasiswa("Waliyuddin", "22552011199", "TIF RM 22 C "));

        stack.print();
        stack.peek();
        stack.pop();
        stack.print();
        stack.clear();
        stack.print();

        StackQueue queue = new StackQueue(10);
        queue.enqueue(new Mahasiswa("Ahmad", "22552011106", "TIF RM 22 A "));
        queue.enqueue(new Mahasiswa("Willy", "22552011110", "TIF RM 22 B "));
        queue.enqueue(new Mahasiswa("Waliyuddin", "22552011199", "TIF RM 22 C "));

        queue.printQueue();
        queue.peekFront();
        queue.peekRear();
        queue.dequeue();
        queue.printQueue();
    }
}
