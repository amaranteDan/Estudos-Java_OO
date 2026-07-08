package java_basico;

import java.util.Scanner;
import java.util.Locale;
import java_basico.entities.Employee;

public class CalculoSalary {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Informe o nome e o salario: ");
        emp.name = sc.nextLine();
        emp.salary = sc.nextFloat();

        System.out.println("Informe o aumento: ");
        emp.salaryIncrease = sc.nextFloat();

        System.out.println(emp);
        sc.close();

    }

}
