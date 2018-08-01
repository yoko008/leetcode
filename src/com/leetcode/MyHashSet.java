package com.leetcode;

public class MyHashSet {

    /**
     * 705. 设计哈希集合
     */
    private int nums[];
    /** Initialize your data structure here. */
    public MyHashSet() {
        this.nums = new int[10000];
        for (int i = 0; i < this.nums.length; i++) {
            this.nums[i] = -1;
        }
    }

    public void add(int key) {
        for (int i = 0; i < this.nums.length; i++) {
            if (this.nums[i] == key){
                return;
            }
        }
        for (int i = 0; i < this.nums.length; i++) {
            if (this.nums[i] == -1){
                this.nums[i] = key;
                break;
            }
        }
    }

    public void remove(int key) {
        for (int i = 0; i < this.nums.length; i++) {
            if (this.nums[i] == key){
                this.nums[i] = -1;
                break;
            }
        }
    }

    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        for (int i = 0; i < this.nums.length; i++) {
            if (this.nums[i] == key){
                return true;
            }
        }
        return false;
    }
}
