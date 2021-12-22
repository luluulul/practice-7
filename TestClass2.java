package ru.mirea.prac7;

import ru.mirea.prac7.res.Example;

import java.util.LinkedList;
import java.util.Queue;

public class TestClass2 {
    public static void main(String[] args) {
        Queue<Integer> p1 = new LinkedList<>() , p2 = new LinkedList<>();
        Example.fillQue(p1);
        Example.fillQue(p2);
        Example.qGame(p1,p2);
    }
}
