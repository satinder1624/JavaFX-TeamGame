package ULM3;

public class EmployeeClass {
    private int employeeNumber;
    private String employeeName;
    private double hourlyWage;
    private double noOfHours;
    private char type;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getNoOfHours() {
        return noOfHours;
    }

    public char getType() {
        return type;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setNoOfHours(double noOfHours) {
        this.noOfHours = noOfHours;
    }

    public EmployeeClass(int employeeNumber, String employeeName, Character type){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hourlyWage = 0;
        this.noOfHours = 0;
        this.type = type;

    }
}
