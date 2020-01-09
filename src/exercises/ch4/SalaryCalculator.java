package exercises.ch4;

import com.sun.deploy.security.SelectableSecurityManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rate;
        double hours;
        int employee;
        double salary;
        System.out.println("Input the employee number: ");
        employee = input.nextInt();
        while (employee != 0) {
            System.out.printf("Input hours for the employee %d: ", employee);
            hours = input.nextDouble();
            System.out.println("Input the salary per hour: ");
            rate = input.nextDouble();
            if (hours <= 40) {
                salary = hours * rate;
            } else
                salary = (40 * rate + (hours - 40) * 1.5 * rate); // count the salary
            System.out.printf("The employee salary  = %.2f %n", salary);
            System.out.println("Input the employee number: ");
            employee = input.nextInt();
        }


    }


}
