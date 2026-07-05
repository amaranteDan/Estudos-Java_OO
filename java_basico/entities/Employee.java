package java_basico.entities;

public class Employee {

    public float salary;
    public float salaryIncrease;
    public String name;

    public double CalculosIncrease() {
        return salary * (1 + salaryIncrease / 100);
    }

    public String toString() {
        return "Employee [salary=" + salary + ", salaryIncrease=" + salaryIncrease + ", name=" + name
                + ", CalculosIncrease()=" + CalculosIncrease() + "]";
    }

}
