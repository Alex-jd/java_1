package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String messege = "You click me";

            JOptionPane.showMessageDialog(null, messege,"My Message", JOptionPane.PLAIN_MESSAGE);

        }
    };

    public static ActionListener listenerBtn = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton tempBtn = (JButton) e.getSource();

                String labelContent = myLbl.getText();
                Integer labelNum = Integer.parseInt(labelContent);

                if(tempBtn == plusBtn)
                    labelNum++;
                 else
                    labelNum--;



                myLbl.setText(labelNum.toString());
            }

        }
    };

    public static Label myLbl;
    public static JButton plusBtn;
    public static JButton minusBtn;

    public static void main(String[] args) {
	    JFrame myWindow = new JFrame("My First Window");
        //myWindow.setLayout(new FlowLayout());


        myWindow.setSize(200,200);

        JPanel panel = new JPanel();
        //panel.setLayout(new FlowLayout());
        //panel.setLayout(new BorderLayout(10, 10));
        GridLayout layout = new GridLayout(4, 5);
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);

        JPanel childPanel = new JPanel();
        panel.add(childPanel);
        /*JButton myBtn = new JButton("Click me!");
        myBtn.addActionListener(listener);
        panel.add(myBtn);*/
        plusBtn = new JButton("+");
        plusBtn.addActionListener(listenerBtn);
        minusBtn = new JButton("-");
        minusBtn.addActionListener(listenerBtn);

        myLbl = new Label("0");

        panel.add(plusBtn);
        panel.add(minusBtn);
        panel.add(myLbl);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("1");
        JButton btn3 = new JButton("1");
        JButton btn4 = new JButton("1");
        JButton btn5 = new JButton("1");

        childPanel.add(btn1, BorderLayout.NORTH);
        childPanel.add(btn2, BorderLayout.CENTER);
        childPanel.add(btn3, BorderLayout.EAST);
        childPanel.add(btn4, BorderLayout.NORTH);
        childPanel.add(btn5, BorderLayout.EAST);


        myWindow.getContentPane().add(panel);
        myWindow.setVisible(true);

    }
}
