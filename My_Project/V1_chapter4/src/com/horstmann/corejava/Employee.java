package com.horstmann.corejava;
import java.time.*;
public class Employee {
    private final String name;      // 因为没改变name，所以可以设为final
    private  double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
//        double raise = salary * byPercent / 100;
//        salary += raise;
        this.salary += this.salary * byPercent / 100;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }


}
