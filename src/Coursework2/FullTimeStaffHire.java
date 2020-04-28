package Coursework2;

public class FullTimeStaffHire extends StaffHire{
    private int salary; //declaring instance variable
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType);
        //Calling super constructor with parametres
        this.salary=salary;
        this.workingHour=workingHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        joined=false;

    }
    //getter method for salary
    public int getSalary(){
        return salary;
    }
    //getter method for workingHour
    public int getWorkingHour(){
        return workingHour;
    } 
    //getter method for StaffName
    public String getStaffName(){
        return staffName;
    }
    //getter method for JoiningDate
    public String getJoiningDate(){
        return joiningDate;
    }
    //getter method for Qualification
    public String getQualification(){
        return qualification;

    }
    //getter method for AppointedBy
    public String getAppointedBy(){
        return appointedBy;

    }
    //getter method for Joined
    public boolean getJoined(){
        return joined;
    }
//mutator method for salary
    public void setSalary(int salary){ 
        if (joined==false){
            this.salary=salary;
        } else{
            System.out.println("Developer is already appointed");

        }

    }
//mutator method for workingHour
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;

    }
//method to hire Full Time Staff
    public void HireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if (joined ==true ){

            System.out.println("Staff name is"+ getStaffName());
            System.out.println("Joined Date" + getJoiningDate());

        }else if (joined==false){
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
        }

    }
//method for displaying fullTimeStaff details
    public void display(){
        super.display();
        if(joined == true){
            System.out.println("Staff Name: "+getStaffName());
            System.out.println("Salary : "+ getSalary());
            System.out.println("WorkingHour: "+getWorkingHour());
            System.out.println("JoiningDate: "+getJoiningDate());
            System.out.println("Qualification: "+getQualification());
            System.out.println("AppointedBy: "+getAppointedBy());
        }
    }
}
