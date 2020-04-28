package Coursework2;

//defining a class
public class StaffHire{
    //declaring private instance variable
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //assigning variable in parameteres
    public StaffHire(int vacancyNumber,String designation,String jobType){

        this.vacancyNumber =vacancyNumber;
        this.designation=designation;
        this.jobType=jobType;
    }
    //getter method for vaccancyNumber
    public int getVacancyNumber() {
        return vacancyNumber;
    }
    //getter method for designation
    public String getDesignation() {
        return designation;
    }
    //gettermethod for jobType
    public String getJobType() {
        return jobType;
    }
    //mutator  method for shifts
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber=vacancyNumber;
    }
    //mutator for designation
    public void setDesignation(String designation){
        this.designation=designation;

    }
    //mutator for jobType
    public void setJobType(String jobType){
        this.jobType=jobType;
    }
    //display method
    public void display(){
        System.out.println ("The vaccancy number is " +"" +getVacancyNumber());
        System.out.println ("The Designation is "+""+getDesignation());
        System.out.println ("The Job Type is "+"" +getJobType());
    }

}
