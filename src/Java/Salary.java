package Java;

public class Salary extends Employee {
    private double salary;
    public Salary(String name, String address, int number) {
        super(name, address, number);
        setSalary(salary);
    }
    public double getSalary(){
        return salary;
    }


    public void setSalary(double newSalary) {
        if (newSalary >=0.0){
            salary = newSalary;
        }
    }
}
