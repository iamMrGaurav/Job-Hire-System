package week20o;

public class FinalYear extends Student {
    private String projectName;
    private String supervisorName;
    private boolean submitted;


    public FinalYear(String name, int age, String projectName) {
        super(name, age);
        this.submitted = false;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    public void submit(String projectName, String supervisorName) {
        this.projectName = projectName;
        this.supervisorName = supervisorName;
        this.submitted = true;
    }

    public void display() {
        super.display();
        System.out.println("Project Name: " + getProjectName());
        System.out.println("SuperVisor Name: " + getSupervisorName());
        System.out.println("Submitted: " + isSubmitted());
    }
}