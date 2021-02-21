import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project {
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private String title;
    private long directCost;
    private long indirectCost;

    public Project()
    {}
    public Project(ArrayList<Employee> employees, String title, long directCost, long indirectCost)
    {
        this.employees = employees;
        this.title = title;
        this.directCost = directCost;
        this.indirectCost = indirectCost;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDirectCost() {
        return directCost;
    }

    public void setDirectCost(long directCost) {
        this.directCost = directCost;
    }

    public long getIndirectCost() {
        return indirectCost;
    }

    public void setIndirectCost(long indirectCost) {
        this.indirectCost = indirectCost;
    }

    public void addEmployee(Employee employee)
    {
        try{
            employees.add(employee);
            System.out.println("");
        }
        catch(NullPointerException exception)
        {
            exception.printStackTrace();
        }
    }

    public boolean removeEmployee(String employeeName)
    {
        for(int i = 0; i < employees.size(); i++)
        {
            if(employees.get(i).getFirstName().equals(employeeName))
            {
                employees.remove(i);
                System.out.println("You have kicked employee №" + (i+1) + " with name: " + employeeName);
                return true;
            }
            else if(employees.get(i).getSecondName().equals(employeeName))
            {
                employees.remove(i);
                System.out.println("You have kicked employee №" + (i+1) + " with name: " + employeeName);
                return true;
            }
        }
        return false;
    }

    public void printAllStaff()
    {
        System.out.println("All workers: ");
        if(employees.size() != 0)
        {
            for(Employee employee : employees)
            {
                System.out.println(employee.getFirstName() + " " + employee.getSecondName());
            }
        }
        else
        {
            System.out.println("No one works on project...");
        }
    }

    public double printTotalCostProject()
    {
        System.out.print("Total cost of project: ");
        return getDirectCost() + getIndirectCost();
    }

    public String toString() {
        String employeesString = "";
        for(Employee employee : employees)
        {
            employeesString += "\n" + employee;
        }
        return "Project{" +
                "title='" + title + '\'' +
                ", directCost=" + directCost +
                ", indirectCost=" + indirectCost +
                '}' + "\n" +" Employees in project: " + employeesString;
    }

}

