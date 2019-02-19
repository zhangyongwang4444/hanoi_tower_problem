package com.company;

import java.util.Stack;

public class Tower {
    private Stack<Integer> disks;

    /*
     * @param i: An integer from 0 to 2
     */
    public Tower(int i) {
        // create three towers
        disks = new Stack();
    }

    /*
     * @param d: An integer
     * @return: nothing
     */
    public void add(int d) {
        // Add a disk into this tower
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.println("Error placing disk " + d);
        } else {
            disks.push(d);
        }
    }

    /*
     * @param t: a tower
     * @return: nothing
     */
    public void moveTopTo(Tower t) {
        // Move the top disk of this tower to the top of t.
        if (t.disks.isEmpty() || (!disks.isEmpty() && t.disks.peek() >= disks.peek())) {
            t.disks.push(disks.pop());
        }

    }

    /*
     * @param n: An integer
     * @param destination: a tower
     * @param buffer: a tower
     * @return: nothing
     */
    public void moveDisks(int n, Tower destination, Tower buffer) {
        // Move n Disks from this tower to destination by buffer tower
        if (n <= 0) {
            return;
        } else if (n == 1) {
            moveTopTo(destination);
        } else {
            moveDisks(n - 1, buffer, destination);
            moveDisks(1, destination, buffer);
            buffer.moveDisks(n - 1, destination, this);
        }
    }

    /*
     * @return: Disks
     */
    public Stack<Integer> getDisks() {
        // write your code here
        System.out.println(disks);
        return disks;
    }
}