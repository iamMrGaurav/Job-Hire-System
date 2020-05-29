package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Students extends JFrame  {
    JLabel disName;
    JTextField stuName;
    JButton addButton;
    JButton displayButton;
    JButton clearButton;
    JButton removeButton;
    ArrayList<String> arr= new ArrayList<>();


    public Students(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(layout);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        stuName = new JTextField(25);
        addButton = new JButton("Add Name");
        addButton.setPreferredSize(new Dimension(120,30));
        displayButton = new JButton("Display");
        displayButton.setPreferredSize(new Dimension(120,30));
        disName = new JLabel("");
        clearButton = new JButton("Clear");
        clearButton.setPreferredSize(new Dimension(120,30));
        removeButton = new JButton("Remove");
        removeButton.setPreferredSize(new Dimension(120,30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(3,3,3,3);
        add(stuName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(3,3,3,3);
        add(addButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(3,3,3,3);
        add(displayButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(3,3,3,3);
        add(clearButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(3,3,3,3);
        add(removeButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(3,3,3,3);
        add(disName, gbc);


        setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arr.add(stuName.getText());
                stuName.setText("");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disName.setText(String.valueOf(arr));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stuName.setText("");
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arr.remove(stuName.getText());
                stuName.setText("");
                disName.setText(String.valueOf(arr));
            }
        });
    }

    public static void main(String[] args) {
        new Students();
    }
}
