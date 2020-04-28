package Coursework2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class INGNepal implements ActionListener {
    JLabel VaccancyNumber;
    JTextField VaccancyNumberf;

    JLabel Designation;
    JTextField Designationf;

    JLabel JobType;
    JCheckBox checkBoxPartTime;
    JCheckBox checkBoxFulTime;
    JLabel labelPartTime;
    JLabel labelFullTime;

    JLabel StaffName;
    JTextField StaffNamef;

    JLabel Qualifiaction;
    JTextField Qualificationf;

    JLabel AppointedBy;
    JTextField AppointedByf;

    JLabel WorkingShifts;
    JTextField WorkingShiftsf;

    JLabel WagesPerHours;
    JTextField WagesPerHoursf;

    JLabel WorkingHours;
    JTextField WorkingHoursf;

    JLabel Salary;
    JTextField Salaryf;

    JLabel JoiningDate;
    JTextField JoiningDatef;


    ArrayList<FullTimeStaffHire> lol;

    JFrame frame;
    JButton Add;
    JButton Appoint;
    JButton Clear;
    JButton Display;
    JButton Terminate;
    JButton AddVaccancy;

    public  INGNepal(){

        lol = new ArrayList<FullTimeStaffHire>();
    }
    public void layout(){
        frame=new JFrame("form");
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();


        frame.setLayout(layout);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        VaccancyNumber = new JLabel("Vaccancy Number:");
        VaccancyNumberf = new JTextField(10);

        WorkingHours = new JLabel("WorkingHours:");
        WorkingHoursf = new JTextField(10);

        Designation = new JLabel("Designation:");
        Designationf = new JTextField(10);

        JobType = new JLabel("Job Type:");
        checkBoxFulTime = new JCheckBox();
        checkBoxPartTime = new JCheckBox();
        labelPartTime = new JLabel("Part Time");
        labelFullTime = new JLabel("Full Time");

        Salary = new JLabel("Salary");
        Salaryf = new JTextField(10);

        StaffName = new JLabel("Staff Name:");
        StaffNamef= new JTextField(10);

        JoiningDate = new JLabel("Joining Date:");
        JoiningDatef = new JTextField(10);

        Qualifiaction = new JLabel("Qualification:");
        Qualificationf = new JTextField(10);

        AppointedBy = new JLabel("Appointed By:");
        AppointedByf = new JTextField(10);

        WorkingShifts = new JLabel("Working Shifts:");
        WorkingShiftsf = new JTextField(10);

        WagesPerHours = new JLabel("Wages Per Hours:");
        WagesPerHoursf = new JTextField(10);


        Add = new JButton("Add");
        Appoint = new JButton("Appoint");
        Display = new JButton("Display");
        Clear = new JButton("Clear");
        Terminate = new JButton("Terminate");
        AddVaccancy = new JButton("Add Vaccancy");


        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=1;
        frame.add(StaffName,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(StaffNamef,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Qualifiaction,gbc);

        gbc.gridx=3;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Qualificationf,gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Designation,gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Designationf,gbc);

        gbc.gridx=2;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(JobType,gbc);

        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(checkBoxFulTime);
        panel.add(labelFullTime);
        panel.add(checkBoxPartTime);
        panel.add(labelPartTime);
        frame.add(panel, gbc);

        checkBoxFulTime.addActionListener(e -> {
            if (checkBoxPartTime.isSelected()){
                checkBoxPartTime.setSelected(false);
            }
        });

        checkBoxPartTime.addActionListener(e -> {
            if (checkBoxFulTime.isSelected()){
                checkBoxFulTime.setSelected(false);
            }
        });

        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(VaccancyNumber,gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(VaccancyNumberf,gbc);

        gbc.gridx=2;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Salary,gbc);

        gbc.gridx=3;
        gbc.gridy=3;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Salaryf,gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(WorkingHours,gbc);

        gbc.gridx=1;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(WorkingHoursf,gbc);

        gbc.gridx=2;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(WorkingShifts,gbc);

        gbc.gridx=3;
        gbc.gridy=4;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(WorkingShiftsf,gbc);

        gbc.gridx=0;
        gbc.gridy=5;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(WagesPerHours,gbc);

        gbc.gridx=1;
        gbc.gridy=5;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(WagesPerHoursf,gbc);

        gbc.gridx=2;
        gbc.gridy=5;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(AppointedBy,gbc);

        gbc.gridx=3;
        gbc.gridy=5;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(AppointedByf,gbc);

        gbc.gridx=0;
        gbc.gridy=6;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(JoiningDate,gbc);

        gbc.gridx=1;
        gbc.gridy=6;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(JoiningDatef,gbc);

        gbc.gridx=3;
        gbc.gridy=6;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(AddVaccancy,gbc);

        gbc.gridx=0;
        gbc.gridy=7;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Appoint,gbc);

        gbc.gridx=3;
        gbc.gridy=7;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Terminate,gbc);

        gbc.gridx=0;
        gbc.gridy=8;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Display,gbc);

        gbc.gridx=3;
        gbc.gridy=8;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(Clear,gbc);

        AddVaccancy.addActionListener(this);
        Appoint.addActionListener(this);
        Terminate.addActionListener(this);


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent en){
        if (en.getSource() == AddVaccancy){
            try{
                if (checkBoxFulTime.isSelected()){
                    if(!VaccancyNumberf.equals("") && !Designationf.equals("") && !Salaryf.equals("") && !WorkingHoursf.equals("")){
                        System.out.println(lol.size());
                        FullTimeStaffHire fullTimeStaffHire = new FullTimeStaffHire(Integer.parseInt(VaccancyNumberf.getText()), Designationf.getText(), labelFullTime.getText(), Integer.parseInt(Salaryf.getText()),  Integer.parseInt(WorkingHoursf.getText()));
                        lol.add(Integer.parseInt(VaccancyNumberf.getText()), fullTimeStaffHire);
                        System.out.println("Added successfully");
                        System.out.println(lol.size());
                    } else {
                        JOptionPane.showMessageDialog(frame, "Empty fields detected");
                    }
                }else if(checkBoxPartTime.isSelected()){
                    System.out.println("Brother is selected");
                }else{
                    JOptionPane.showMessageDialog(frame,"Please choose either full time or part time");
                }
            }catch (IndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(frame, "You cant use vacancy greater than " +lol.size()+ " at this time");
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please enter vacancy number, salary and working hour in number format.");
            }
        }else if(en.getSource() == Appoint){
            System.out.println("Appoint");
        }else if(en.getSource() == Terminate){
            System.out.println("Terminated");
        }
    }

    public static void main(String[] args) {
        new INGNepal().layout();
        System.out.println("hi");

    }

}
