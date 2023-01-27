package no1;
import  Model.Mahasiswa;
public class StackQueue {
    private Mahasiswa[] data;
    private int top;
    private int size;

    public StackQueue(int size) {
        this.size = size;
        data = new Mahasiswa[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Mahasiswa mahasiswa) {
        if (!isFull()) {
            top++;
            data[top] = mahasiswa;
        } else {
            System.out.println("Stack Sudah Penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Mahasiswa temp = data[top];
            top--;
            System.out.println("Data yang dihapus: " + temp);
        } else {
            System.out.println("Stack kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas: " + data[top]);
        } else {
            System.out.println("Stack kosong");
        }
    }

    public void print() {
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                pop();
            }
        } else {
            System.out.println("Stack Kosong");
        }
    }

    public void enqueue(Mahasiswa mahasiswa) {
        if (!isFull()) {
            top++;
            data[top] = mahasiswa;
        } else {
            System.out.println("Queue sudah Penuh");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            Mahasiswa temp = data[0];
            for (int i = 0; i < top; i++) {
                data[i] = data[i + 1];
            }
            top--;
            System.out.println("Data yang dihapus: " + temp);
        } else {
            System.out.println("Queue Kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terakhir: " + data[top]);
        } else {
            System.out.println("Queue Kosong");
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[0]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void printQueue() {
        System.out.println("Isi Queue: ");
        for (int i = 0; i <= top; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public void clearQueue() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                dequeue();
            }
        } else {
            System.out.println("Queue is Empty");
        }
    }

}
