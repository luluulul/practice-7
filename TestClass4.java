package ru.mirea.prac7;

import ru.mirea.prac7.res.Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Stack;

class TestClass4 extends JFrame
{

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    private int h = 0;
    JButton but1 = new JButton("START THIS CRINGE");
    JLabel jl1 = new JLabel(stack1.toString());
    JLabel jl2 = new JLabel(stack2.toString());
    Label l = new Label("");
    JPanel[] pnl = new JPanel[12];

    public TestClass4()
    {
        setLayout(null);
        but1.setBounds(150,20,140,40);
        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!stack1.empty()&!stack2.empty()&h<106){
                    h++;
                    but1.setText(h+"");
                    System.out.println("Ход "+ h);
                    Example.sMove(stack1, stack2);
                    jl1.setText(stack1.toString());
                    jl2.setText(stack2.toString());
                }else{
                if(h==106){
                    but1.setText("BOTVA");
                    jl1.setText("BOTVA");
                    jl2.setText("BOTVA");
                        JFrame mainframe = new JFrame("gif");
                        Icon icon = new ImageIcon("src/ru/mirea/prac7/res/morgenshern.gif");
                        try {
                            mainframe.setContentPane(new JLabel(icon));
                        } catch (Exception aue) {
                            System.out.print("delete this");
                        }
                        mainframe.setBounds(0, 0, 1920, 1080);
                        mainframe.setVisible(true);

                }else if(stack1.empty()){
                    but1.setText("second "+h);
                }else{
                    but1.setText("first "+h);
                }}
            }
        });
        jl1.setBounds(150,50,140,40);
        jl2.setBounds(360,50,140,40);
        l.setBounds(580,50,180,40);
        add(but1);
        add(jl1);
        add(jl2);
        add(l);
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        Example.randomFillStack(stack1,stack2);
        new ru.mirea.prac7.TestClass4().setVisible(true);
    }
}
