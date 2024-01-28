/* An Employee Class has following attributes:

 ID String
 Name String
 Gender String

 a. Provide an implementation to sort a collection of employee's on the Name attribute.
 b. Provide a unit test for the above implementation.*/

package com.Example;

import java.util.*;

class EmployeeEmp {
    // Attributes
    private String ID;
    private String Name;
    private String Gender;

    // Constructor
    public EmployeeEmp(String ID, String Name, String Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
    }

    // Getter methods (assumed to be present)
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }
}

public class Employee2 {
    public static void main(String[] args) {
        // Creating a list of employees
        List<EmployeeEmp> employees = new ArrayList<EmployeeEmp>();
        employees.add(new EmployeeEmp("2", "Ramya", "Female"));
        employees.add(new EmployeeEmp("1", "Krishna", "Male"));
        employees.add(new EmployeeEmp("3", "Ram", "Male"));

        // Sorting employees based on Name
        employees.sort(Comparator.comparing(EmployeeEmp::getName));

        // Unit Test: Assert the correct order
        assert employees.get(0).getName().equals("Ramya");
        assert employees.get(1).getName().equals("Ram");
        assert employees.get(2).getName().equals("Krishna");

        System.out.println("Unit test passed successfully!");
    }
}