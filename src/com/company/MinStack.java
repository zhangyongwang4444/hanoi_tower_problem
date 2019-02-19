package com.company;


import java.util.Stack;

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();

    public void push(int x) {
        // 如果小于最小值min就push2个数据到栈中
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        // 如果拿出来的是最小值，就删除2个
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        System.out.println(stack.peek());
        return stack.peek();
    }

    public int getMin() {
        System.out.println(min);
        return min;
    }
}