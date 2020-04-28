package Coursework2;

public class PartTimeStaffHire extends StaffHire{
    //Declaring instance private variable
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated; 
    //assigning variable in contructor
    public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHours,int wagesPerHour,String shifts){
        super(vacancyNumber,designation,jobType);//calling three variables
        //assigning variables
        this.workingHour=workingHours; 
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=false;
    }
    //getter method of workingHour
    public  int getWorkingHour(){
        return workingHour;

    }
    //getter method of wagesPerHour 
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    //getter method of staffName
    public String getStaffName(){
        return staffName;

    }
    //gettermethod of joiningDate
    public String getJoiningDate(){
        return joiningDate;

    }
    //getter method of qualification
    public String getQualification(){
        return qualification;

    }
    //getter method of shifts
    public String getShifts(){
        return shifts;
    }
    //getter method of appointedBy
    public String getAppointedBy(){
        return appointedBy;

    }
    //getter method of joined
    public boolean isJoined(){
        return joined;
    }
    //getter method of terminated
    public boolean isTerminated(){
        return terminated;

    }
    //mutator method of shifts
    public void setShifts(String shifts){
        if (joined==false){
            this.shifts=shifts;
        }
    }
    //method to hirePartTimeStaff 
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == true){
            System.out.println(staffName+"Was already appointed");
            System.out.println(joiningDate);
        } else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.terminated =false;
            this.joined =true;
        }
    }
    //method to terminated the staff
    public void terminateStaff(){
        if(terminated == true){
            System.out.println("Staff is already terminated");
        } else{
            this.staffName ="";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }
    //method for displaying staff details
    public void display(){
        super.display();
        if (joined == true){
            System.out.println("Staff Name : " + getStaffName());
            System.out.println("Wages Per Hour : " + getWagesPerHour());
            System.out.println("Working Hour : " + getWorkingHour());
            System.out.println("Joining Date : " + getJoiningDate());
            System.out.println("Qualification : " + getQualification());
            System.out.println("Appointed By : " + getAppointedBy());
            System.out.println("Income Per Day : " +(getWagesPerHour()*getWorkingHour()));
        }
    }
}