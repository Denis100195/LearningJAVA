package QueueStack;

import java.util.LinkedList;
import java.util.List;

/**Implementation the MyCircularQueue class:

 MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 int Front() Gets the front item from the queue. If the queue is empty, return -1.
 int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
 boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
 boolean isEmpty() Checks whether the circular queue is empty or not.
 boolean isFull() Checks whether the circular queue is full or not.
 You must solve the problem without using the built-in queue data structure in your programming language.*/
public class MyCircularQueue {
    int size;
    LinkedList<Integer> list;
    public MyCircularQueue(int k) {
        this.size = k;
        this.list = new LinkedList<>();
    }
    public boolean enQueue(int value) {
        if (list.size() < size){
            list.add(value);
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!list.isEmpty()){
            list.remove(0);
            return true;
        }
        return false;
    }

    public int Front() {
        if (list.size() > 0) {
            return list.get(0);
        }
        return -1;
    }

    public int Rear() {
        if (list.size() > 0){
            return list.get(list.size() - 1);
        }
        return -1;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

