package map;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDay(){
        return this.hireDay;
    }

    public void raiseSalary(double byPercent){
        this.salary *= (1 + byPercent / 100);
    }

    @Override
    public String toString(){
        return "Employee[name=" + name + " ,salary=" + salary + " ,hireDay=" + hireDay + "]";
    }
}
