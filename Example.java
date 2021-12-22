package ru.mirea.prac7.res;

import java.util.*;

public class Example {
    public static void fillStack(Stack a){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a.add(s.nextInt());
        }
    }
    public static void fillQue(Queue a){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a.offer(s.nextInt());
        }
    }
    public static void fillDe(Deque a){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a.offer(s.nextInt());
        }
    }
    public static int sGetFirst(Stack a){
        Iterator x = a.listIterator(0);
        return (int)x.next();
    }
    public static int sClearNGet(Stack a){
        Iterator x = a.listIterator(0);
        int ans = (int)x.next();
        x.remove();
        return ans;
    }
    public static void sGame(Stack a, Stack b){
        int h = 0;
        while(!a.empty()&!b.empty()&h<106){
            h++;
            System.out.println("Ход "+ h);
            sMove(a, b);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
        if(h==106){
            System.out.println("botva");
        }else if(a.empty()){
            System.out.println("second "+h);
        }else{
            System.out.println("first "+h);
        }
    }
    public static void qGame(Queue a, Queue b){
        int h = 0;
        while(!(a.peek()==null)&!(b.peek()==null)&h<106){
            h++;
            System.out.println("Ход "+ h);
            qMove(a, b);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
        if(h==106){
            System.out.println("botva");
        }else if(a.peek()==null){
            System.out.println("second "+h);
        }else{
            System.out.println("first "+h);
        }
    }
    public static int qGetFirst(Queue a){
        Iterator <Integer>x = a.iterator();
        return (int)x.next();
    }
    public static int qClearNGet(Queue a){
        Iterator <Integer> x = a.iterator();
        int ans = (int)x.next();
        x.remove();
        return ans;
    }
    public static void qMove(Queue a, Queue b){ //да я знаю что это кринжово, но я устал уже делать штук 5 практик в день
        System.out.println(a+"\n"+b);
        System.out.println(qGetFirst(a) + " " + qGetFirst(b));
        if(qGetFirst(a)==9&qGetFirst(b)==0){
            b.add(qClearNGet(b));
            b.add(qClearNGet(a));
        }else
            if(qGetFirst(a)==0&qGetFirst(b)==9){
                a.add(qClearNGet(a));
                a.add(qClearNGet(b));
            }else
        if(qGetFirst(a)>qGetFirst(b)){
            a.add(qClearNGet(a));
            a.add(qClearNGet(b));
        }
        else
        {
            b.add(qClearNGet(b));
            b.add(qClearNGet(a));
        }
        System.out.println("\nстало\n"+a+"\n"+b);
    }
    public static void sMove(Stack a, Stack b){
        System.out.println(a+"\n"+b);
        System.out.println(sGetFirst(a) + " " + sGetFirst(b));
        if(sGetFirst(a)==9&sGetFirst(b)==0){
            b.add(sClearNGet(b));
            b.add(sClearNGet(a));
        }else
            if(sGetFirst(a)==0&sGetFirst(b)==9){
                a.add(sClearNGet(a));
                a.add(sClearNGet(b));
        }else if(sGetFirst(a)>sGetFirst(b)){
            a.add(sClearNGet(a));
            a.add(sClearNGet(b));
        }
        else
        {
            b.add(sClearNGet(b));
            b.add(sClearNGet(a));
        }
        System.out.println("\nстало\n"+a+"\n"+b);
    }
    public static void dGame(Deque a, Deque b){
        int h = 0;
        while(!(a.peek()==null)&!(b.peek()==null)&h<106){
            h++;
            System.out.println("Ход "+ h);
            qMove(a, b);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
        if(h==106){
            System.out.println("botva");
        }else if(a.peek()==null){
            System.out.println("second "+h);
        }else{
            System.out.println("first "+h);
        }
    }
    public static void shuffleArray(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private static void swap(int[] a, int i, int change) {
        int temp = a[i];
        a[i] = a[change];
        a[change] = temp;
    }
    public static void randomFillStack(Stack a, Stack b){
        int []arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        shuffleArray(arr);
        for (int i = 0; i < 5; i++) {
            a.add(arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            b.add(arr[i+5]);
        }
    }
}
