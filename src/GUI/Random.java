package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Random extends JFrame {

    JLabel username;
    JTextField usernamef;
    JLabel passweord;
    JTextField passwordf;
    JButton login;
    JButton clear;
    JFrame frame;
    public void grid() {
        frame = new JFrame("form");
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);

        username = new JLabel("Username: ");
        usernamef = new JTextField(25);

        passweord = new JLabel( "Password: ");
        passwordf = new JTextField(25);

        login = new JButton("LOGIN");
        clear = new JButton("Clear");

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(username, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(usernamef, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(passweord, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(passwordf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(login, gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(clear,gbc);

        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new Random().grid();
    }


}


