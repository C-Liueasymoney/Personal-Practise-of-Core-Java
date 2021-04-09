package abstractClasses;

import java.time.*;
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDay(){
        return this.hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", this.salary);
    }

    public void raiseSalary(double byPercent){
        this.salary *= (1 + byPercent / 100);
    }


    public boolean equals(Object otherObject){
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee) otherObject;

        return name.equals(other.name) && salary == other.salary && hireDay == other.hireDay;
    }
}
