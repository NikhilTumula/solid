package openclosed;

public class HrEmployee extends Employee {

    int getexperienceYears;

    public HrEmployee(String employeeId, float employeeSalary, int experienceYears) {
        super(employeeId, employeeSalary);
        this.getexperienceYears = getexperienceYears;
    }


    public int getGetexperienceYears() {
        return this.getexperienceYears;
    }

    public void setGetexperienceYears(int getexperienceYears) {
        this.getexperienceYears = getexperienceYears;
    }


    @Override
    public String toString() {
        return "{" +
            " getexperienceYears='" + getGetexperienceYears() + "'" +
            "}";
    }
    

    
}
