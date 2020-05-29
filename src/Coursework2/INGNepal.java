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


    ArrayList<StaffHire> staffHires;

    JFrame frame;
    JButton Add;
    JButton Appoint;
    JButton Clear;
    JButton Display;
    JButton Terminate;
    JButton AddVaccancy;

    JTextArea area;

    public  INGNepal(){
        staffHires = new ArrayList<>();
    }
    public void layout(){
        frame=new JFrame("form");
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();


        frame.setLayout(layout);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
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


         area  = new JTextArea();
         area.setEditable(false);

        Add = new JButton("Add");
        Appoint = new JButton("Appoint");
        Display = new JButton("Display");
        Clear = new JButton("Clear");
        Terminate = new JButton("Terminate");
        AddVaccancy = new JButton("Add Vaccancy");


        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
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

        gbc.gridx=0;
        gbc.gridy=9;
        gbc.gridwidth=4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(area,gbc);



        AddVaccancy.addActionListener(this);
        Appoint.addActionListener(this);
        Terminate.addActionListener(this);
        Display.addActionListener(this);
        Clear.addActionListener(this);


        frame.setVisible(true);


    }

    public int getVacancyNumber(){
        return Integer.parseInt(VaccancyNumberf.getText());
    }
    public String getJobType(){
        String jobType = "";
        if(checkBoxPartTime.isSelected()){
            jobType = "Part Time";
        }else if(checkBoxFulTime.isSelected()){
            jobType ="Full Time";
        }
        return jobType;
    }

    public int getWorkingHours(){
        return Integer.parseInt(WorkingHoursf.getText());
    }

    public int getWagesPerHours(){
        return Integer.parseInt(WagesPerHoursf.getText());
    }

    public String getDesignation(){
        return (Designationf.getText());
    }

    public String getJoiningDate(){
        return (JoiningDatef.getText());
    }

    public int getSalary(){
        return Integer.parseInt(Salaryf.getText());
    }

    public String getStaffName(){
        return (StaffNamef.getText());
    }

    public String getShifts(){
        return WorkingShiftsf.getText();
    }
    public String getQualification(){
        return Qualificationf.getText();
    }

    public String getAppointedBy(){
        return (AppointedByf.getText());
    }




    @Override
    public void actionPerformed(ActionEvent en){
        if (en.getSource() == AddVaccancy){
            try{
                if (checkBoxFulTime.isSelected()){
                    if(!VaccancyNumberf.equals("") && !getDesignation().equals("") && !Salaryf.equals("") && !WorkingHoursf.equals("")){
                        System.out.println(staffHires.size());
                        FullTimeStaffHire fullTimeStaffHire = new FullTimeStaffHire(Integer.parseInt(VaccancyNumberf.getText()), Designationf.getText(), labelFullTime.getText(), Integer.parseInt(Salaryf.getText()),  Integer.parseInt(WorkingHoursf.getText()));
                        staffHires.add(Integer.parseInt(VaccancyNumberf.getText()), fullTimeStaffHire);
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Empty fields detected");
                    }
                }else if(checkBoxPartTime.isSelected()){
                    if(!VaccancyNumberf.equals("") && !Designationf.equals("") && !WagesPerHoursf.equals("") && !WagesPerHoursf.equals("") && !WorkingShiftsf.equals("")){
                        System.out.println(staffHires.size());
                        PartTimeStaffHire partTimeStaffHire = new PartTimeStaffHire(Integer.parseInt(VaccancyNumberf.getText()),Designationf.getText(),labelPartTime.getText(),Integer.parseInt(WorkingHoursf.getText()),Integer.parseInt(WagesPerHoursf.getText()),WorkingShiftsf.getText());
                        staffHires.add(Integer.parseInt(VaccancyNumberf.getText()),partTimeStaffHire);
                        clearFields();
                    }
                    System.out.println("Brother is selected");
                }else{
                    JOptionPane.showMessageDialog(frame,"Please choose either full time or part time");
                }
            }catch (IndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(frame, "You cant use vacancy greater than " +staffHires.size()+ " at this time");
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please enter vacancy number, salary and working hour in number format.");
            }
        }else if(en.getSource() == Appoint){
            if (checkBoxFulTime.isSelected()){
                if (!VaccancyNumberf.getText().equals("")){
                    for(StaffHire staffHire : staffHires){
                        if (getVacancyNumber() == staffHire.getVacancyNumber()){
                            if(staffHires.get(getVacancyNumber()) instanceof FullTimeStaffHire){
                                if(!((FullTimeStaffHire) staffHire).getJoined()){
                                    if(!getStaffName().equals("") && !getAppointedBy().equals("") && !getQualification().equals("") && !getJoiningDate().equals("")){
                                        FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffHire;
                                        fullTimeStaffHire.HireFullTimeStaff(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());
                                        System.out.println("Appointed successfully");
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(frame, "This vacancy is not of fulltime please enter another");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "No vacancy available");
                        }
                    }
                }
            }else if(checkBoxPartTime.isSelected()){
                if (!VaccancyNumberf.getText().equals("")){
                    for(StaffHire staffHire : staffHires){
                        if (getVacancyNumber() == staffHire.getVacancyNumber()){
                            if(staffHires.get(getVacancyNumber()) instanceof PartTimeStaffHire){
                                if(!((PartTimeStaffHire) staffHire).isJoined()){
                                    if(!getStaffName().equals("") && !getAppointedBy().equals("") && !getQualification().equals("") && !getJoiningDate().equals("")){
                                        PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                                        partTimeStaffHire.hirePartTimeStaff(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());
                                        System.out.println("Part time staff Appointed successfully");
                                    }else {
                                        JOptionPane.showMessageDialog(frame,"please fill the fields.");
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(frame,"Already joined!!");

                                }
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(frame,"please enter vacancy number");

                }
            }
            System.out.println("Appoint");
        }else if(en.getSource() == Terminate){
            if (checkBoxPartTime.isSelected()){
                if (!VaccancyNumberf.getText().equals("")){
                    for (StaffHire staffHire :staffHires){
                        if (getVacancyNumber() == staffHire.getVacancyNumber()){
                            if (staffHires.get(getVacancyNumber()) instanceof PartTimeStaffHire){
                                if(!((PartTimeStaffHire) staffHire).isTerminated()){
                                    PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                                    partTimeStaffHire.terminateStaff();
                                    break;
                                }else{
                                    JOptionPane.showMessageDialog(frame, "Staff already terminated.");
                                }
                                break;
                            }else{
                                JOptionPane.showMessageDialog(frame, "You entered vacancy number of full time, Please try another");
                            }
                            break;
                        }else {
                            JOptionPane.showMessageDialog(frame, "There is no vacancy number associated.");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(frame, "Please enter vacancy number");
                }
            } else if(checkBoxFulTime.isSelected()){
                JOptionPane.showMessageDialog(frame, "You cant Terminate full time staff");
            } else{
                JOptionPane.showMessageDialog(frame, "Please select job type.");
            }
        }else if (en.getSource()==Display){
            StringBuilder builder = new StringBuilder();
            if(getJobType().equals("Full Time")){
                for(StaffHire staffHire : staffHires){
                    if (staffHire instanceof FullTimeStaffHire){
                        FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffHire;
                        fullTimeStaffHire.display();

                        builder.append(staffHire.getVacancyNumber());
                        builder.append(" | ");
                        builder.append(staffHire.getDesignation());
                        builder.append(" | ");
                        builder.append(staffHire.getJobType());
                        builder.append(" | ");
                        if(fullTimeStaffHire.getJoined()){
                            builder.append(((FullTimeStaffHire) staffHire).getQualification());
                            builder.append(" | ");
                            builder.append(((FullTimeStaffHire) staffHire).getStaffName());
                            builder.append(" | ");
                            builder.append(((FullTimeStaffHire) staffHire).getAppointedBy());
                            builder.append(" | ");
                            builder.append(((FullTimeStaffHire) staffHire).getJoiningDate());
                            builder.append(" | ");
                        }
                        builder.append("\n");
                    }
                }
                area.setText(String.valueOf(builder));
            }else  if (getJobType().equals("Part Time")){
                for(StaffHire staffHire : staffHires){
                    if (staffHire instanceof PartTimeStaffHire){
                        PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                        partTimeStaffHire.display();

                        builder.append(staffHire.getVacancyNumber());
                        builder.append(" | ");
                        builder.append(staffHire.getDesignation());
                        builder.append(" | ");
                        builder.append(staffHire.getJobType());
                        builder.append(" | ");
                        if(partTimeStaffHire.isJoined()){
                            builder.append(((PartTimeStaffHire) staffHire).getQualification());
                            builder.append(" | ");
                            builder.append(((PartTimeStaffHire) staffHire).getStaffName());
                            builder.append(" | ");
                            builder.append(((PartTimeStaffHire) staffHire).getAppointedBy());
                            builder.append(" | ");
                            builder.append(((PartTimeStaffHire) staffHire).getJoiningDate());
                            builder.append(" | ");
                        }
                        builder.append("\n");
                    }
                }
                area.setText(String.valueOf(builder));
            }else {
                JOptionPane.showMessageDialog(frame, "Please Select job type.");
            }
//            for (StaffHire staffHire:staffHires){
//                if(staffHire instanceof  FullTimeStaffHire) {
//                    FullTimeStaffHire fullTimeStaffHire =(FullTimeStaffHire) staffHire;
//
//                    builder.append(fullTimeStaffHire.getStaffName());
//                    if(!getStaffName().isEmpty()){
//                        builder.append(" ");
//                    }
//
//                    builder.append(fullTimeStaffHire.getDesignation());
//                    if(!getDesignation().isEmpty()){
//                        builder.append(" ");
//                    }
//
//                    builder.append(fullTimeStaffHire.getJoiningDate());
//                    if(!fullTimeStaffHire.getJoiningDate().isEmpty()){
//                        builder.append(" ");
//                    }
//
//                    builder.append(fullTimeStaffHire.getSalary());
//                    if(fullTimeStaffHire.getSalary() != 0){
//                        builder.append(" ");
//                    }
//
//                    builder.append(fullTimeStaffHire.getWorkingHour());
////                    if(!fullTimeStaffHire.getWorkingHour().isEmpty()){
////                        builder.append(",");
////                    }
//
//
//                    builder.append(fullTimeStaffHire.getAppointedBy());
//                    if(!fullTimeStaffHire.getAppointedBy().isEmpty()){
//                        builder.append(",");
//                    }
//
//                    builder.append(fullTimeStaffHire.getVacancyNumber());
//                    builder.append(",");
//
//                    builder.append(fullTimeStaffHire.getJobType());
//                    if(!fullTimeStaffHire.getJobType().isEmpty()){
//                        builder.append(",");
//                    }
//
//
//
//                }
//                if (builder.toString().isEmpty()){
//                    area.setText(" Data not available!");
//
//                }else {
//                    area.setText(builder.toString());
//                } if (staffHire instanceof PartTimeStaffHire){
//                    PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire)staffHire;
//
//                    builder.append(partTimeStaffHire.getStaffName());
////                    if(!PartTimeStaffHire.getStaffName().isEmpty()){
////                        builder.append(",");
////                    }
//
//                    builder.append(partTimeStaffHire.getVacancyNumber());
//                    builder.append(",");
//
//                    builder.append(partTimeStaffHire.getJobType());
//                    if(!partTimeStaffHire.getJobType().isEmpty()){
//                        builder.append(",");
//                    }
//
//                    builder.append(partTimeStaffHire.getWagesPerHour());
//                    builder.append(",");
//
//                    builder.append(partTimeStaffHire.getWorkingHour());
//                    builder.append(",");
//
//                    builder.append(partTimeStaffHire.getAppointedBy());
//                    if(!partTimeStaffHire.getAppointedBy().isEmpty()){
//                        builder.append(",");
//                    }
//    }
////
//////                    if(!PartTimeStaffHire.getShifts().isEmpty()){
//////                        builder.append(",");
//////                    }
////
////
////
////
////                }
////
////
////            }
//                    builder.append(partTimeStaffHire.getDesignation());
//                    if(!partTimeStaffHire.getDesignation().isEmpty()){
//                        builder.append(",");
//

        }
        else if (en.getSource()==Clear){
            clearFields();
        }

    }

    public void clearFields(){
        VaccancyNumberf.setText("");
        Designationf.setText("");
        Salaryf.setText("");
        WorkingHoursf.setText("");
        StaffNamef.setText("");
        Qualificationf.setText("");
        JoiningDatef.setText("");
        AppointedByf.setText("");
        WorkingShiftsf.setText("");
        WagesPerHoursf.setText("");
        area.setText("");
        checkBoxFulTime.setSelected(false);
        checkBoxPartTime.setSelected(false);

    }
    public static void main(String[] args) {
        new INGNepal().layout();
        System.out.println("hi");

    }

}
