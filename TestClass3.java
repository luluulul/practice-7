package ru.mirea.prac7;

import ru.mirea.prac7.res.Example;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestClass3 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(), d2 = new ArrayDeque<>();
        Example.fillDe(d1);
        Example.fillDe(d2);
        Example.dGame(d1,d2);
    }
}
