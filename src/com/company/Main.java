package com.company;

public class Main {

    public static void main(String[] args) {

        // new 出来 3 个 塔
//        Tower tower = new Tower(0);
//        Tower tower1 = new Tower(1);
//        Tower tower2 = new Tower(2);

        // tower 初始化
//        tower.add(5);
//        tower.add(4);
//        tower.add(3);
//        tower.add(2);
//        tower.add(1);
//        tower.add(0);

//        tower.moveTopTo(tower1);

//        tower.moveDisks(6,tower2,tower1);
//
//        tower.getDisks();
//        tower1.getDisks();
//        tower2.getDisks();


//        Difference difference = new Difference();
//        difference.findTheDifference("abc","abcd");

        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(4);
        minStack.push(2);
        minStack.push(9);

        minStack.getMin();

        minStack.top();

        minStack.pop();
        minStack.getMin();

    }
}
