package com.leetcode;

class MyCircularQueue {

    private int[] circularQueue;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.circularQueue = new int[k];
        for (int i = 0; i < circularQueue.length; i++) {
            this.circularQueue[i] = -1;
        }
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        try {
            boolean tf = false;
            for (int i = 0; i < this.circularQueue.length; i++) {
                if(this.circularQueue[i] == -1){
                    this.circularQueue[i] = value;
                    tf = true;
                    break;
                }
            }
            return tf;
        }
        catch (Exception e){
            return false;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        try {
            if (this.circularQueue[0] == -1){
                return false;
            }
            this.circularQueue[0] = -1;
            for (int i = 1; i < this.circularQueue.length; i++) {
                this.circularQueue[i-1] = this.circularQueue[i];
                if (this.circularQueue[i] == -1){
                    break;
                }
            }
            this.circularQueue[this.circularQueue.length-1] = -1;
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        try {
            return this.circularQueue[0];
        }
        catch (Exception e){
            return -1;
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        try {
            for (int i = 0; i < this.circularQueue.length; i++) {
                if (this.circularQueue[i] == -1){
                    return this.circularQueue[i-1];
                }
            }
            return this.circularQueue[this.circularQueue.length-1];
        }
        catch (Exception e){
            return -1;
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        boolean tf = true;
        for (int i = 0; i < this.circularQueue.length; i++) {
            if (this.circularQueue[i] != -1){
                tf = false;
                break;
            }
        }
        return tf;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        boolean tf = true;
        for (int i = 0; i < this.circularQueue.length; i++) {
            if (this.circularQueue[i] == -1){
                tf = false;
                break;
            }
        }
        return tf;
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