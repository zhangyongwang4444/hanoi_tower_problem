package com.company;


import java.util.Stack;

class MinStack {
    //存gap, 当前栈顶和之前的最小值的差值
    Stack<Long> stack = new Stack<>();
    long min = Integer.MIN_VALUE;

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);//初始值存0
            min = x;
        } else {
            stack.push(x - min);//存gap
            if (x < min) {
                min = x;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        long peek = stack.peek();
        if (peek > 0) {
            stack.pop();
        } else {
            min -= peek;
            stack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        if (stack.peek() > 0) {
            return (int) (min + stack.peek());
        } else {
            return (int) min;
        }
    }

    public int getMin() {
        System.out.println(min);
        return (int) min;
    }
}