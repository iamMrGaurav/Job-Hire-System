package week19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout implements ActionListener {

    private JButton button1;
    private JLabel label;
    private int counter = 0;

    public void go() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        label = new JLabel(String.valueOf(counter));
        button1 = new JButton("counter");
        button1.addActionListener(this);

        frame.add(BorderLayout.PAGE_START, label);
        frame.add(BorderLayout.CENTER, button1);
        frame.setTitle("welcome to first counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
          label.setText(String.valueOf(counter++));
    }

    public static void main(String[] args) {
         Layout obj = new Layout();
         obj.go();
    }
}
