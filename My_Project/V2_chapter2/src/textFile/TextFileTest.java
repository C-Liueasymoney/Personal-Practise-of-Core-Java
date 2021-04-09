package textFile;

import jdk.nio.mapmode.ExtendedMapMode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.rmi.server.ExportException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/3/23 5:32 下午
 */
public class TextFileTest {
    public static void main(String[] args) throws IOException{
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        try(PrintWriter out = new PrintWriter("employee.dat", StandardCharsets.UTF_8)){
            writeData(staff, out);
        }

        try(Scanner in = new Scanner(new FileInputStream("employee.dat"), StandardCharsets.UTF_8)){
            Employee[] newStaff = readData(in);

            for (Employee e: newStaff)
                System.out.println(e);
        }
    }

    private static void writeData(Employee[] employees, PrintWriter out) throws IOException{
        out.println(employees.length);
        for (Employee e : employees)
            writeEmployee(out, e);
    }

    private static void writeEmployee(PrintWriter out, Employee e){
        out.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
    }

    private static Employee[] readData(Scanner in){
        int n = in.nextInt();
        in.nextLine();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++){
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    private static Employee readEmployee(Scanner in){
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        LocalDate hireDate = LocalDate.parse(tokens[2]);
        int year = hireDate.getYear();
        int month = hireDate.getMonthValue();
        int day = hireDate.getDayOfMonth();
        return new Employee(name, salary, year, month, day);
    }
}
