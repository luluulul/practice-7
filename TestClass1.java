package ru.mirea.prac7;

import ru.mirea.prac7.res.Example;

import java.util.Stack;

public class TestClass1 {
    //private Stack<int> deck;

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>(), stack2 = new Stack<>();
        Example.fillStack(stack1);
        Example.fillStack(stack2);
        Example.sGame(stack1,stack2);
    }
}
