/* Q. An Employee Class has following attributes:
 ID String
 Name String
 Gender String
 Two employees are equal if their ID matches.
 a. Provide an implementation of Employee class and override the equals and hashCode method.
 b. Provide a unit test for the above implementation.*/

package com.Example;

import java.util.*;

class Employee {
    // Attributes
    private String ID;
    private String Name;
    private String Gender;

    // Constructor
    public Employee(String ID, String Name, String Gender) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(ID, employee.ID);
    }

    // HashCode method
    @Override
    public int hashCode() {
        return Objects.hash(ID);
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

public class Employee1 {
    public static void main(String[] args) {
        // Unit Test
        Employee emp1 = new Employee("1", "Krishna", "Male");
        Employee emp2 = new Employee("1", "Ramya", "Female");
        Employee emp3 = new Employee("2", "Ram", "Male");

        // Assert equality
        assert emp1.equals(emp2);
        assert emp2.equals(emp1);

        // Assert inequality
        assert !emp1.equals(emp3);
        assert !emp3.equals(emp1);

        System.out.println("Unit test passed successfully!");
    }
}

