package week20o;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentEntry extends JFrame {
    ArrayList<Student> students;
    JFrame frame;
    JLabel msg ;
    JLabel age;
    JLabel name;
    JLabel favouriteSubject;
    JTextField namef;
    JTextField agef;
    JTextField favouriteSubjectf;
    JButton add;
    JButton display;

    public StudentEntry(){
        students = new ArrayList<>();
    }

    public void firstYear(){

        frame=new JFrame("form");
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setLayout(layout);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        msg = new JLabel("For First Year");
        name = new JLabel("Name");
        age = new JLabel("Age");
        agef = new JTextField(13);
        namef = new JTextField(13);
        add = new JButton("ADD");
        display = new JButton("DISPLAY");
        favouriteSubjectf=new JTextField(13);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 try{
                     FirstYear obj= new FirstYear(namef.getText(),Integer.parseInt(agef.getText()));
                     obj.setFavouriteSubject(favouriteSubjectf.getText());
                     students.add(obj);
                 }catch (Exception ex){

                 }

                 namef.setText("");
                 agef.setText("");
                 favouriteSubjectf.setText("");

            }
        });


        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder builder = new StringBuilder();
                for(Student student:students){
                    if (student instanceof FirstYear) {
                        FirstYear firstYear = (FirstYear) student;
                        builder.append(firstYear.getName());
                        builder.append(",");
                        builder.append(firstYear.getAge());
                        builder.append(firstYear.getFavouriteSubject());
                        builder.append("\n");
                    }
                }

            }
        });

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=3;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(msg,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(name,gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(namef,gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(age,gbc);

        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(agef,gbc);

        gbc.gridx=2;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(add,gbc);

        gbc.gridx=2;
        gbc.gridy=5;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(display,gbc);













         frame.setVisible(true);
    }

    public static void main(String[] args) {
        StudentEntry obj1= new StudentEntry();
        obj1.firstYear();
    }





}
