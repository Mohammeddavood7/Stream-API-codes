package com.may16.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    static class Employee {
        private String employeeID;
        private String name;
        private String email;
        private String department;

        public Employee(String employeeID, String name, String email, String department) {
            this.employeeID = employeeID;
            this.name = name;
            this.email = email;
            this.department = department;
        }

        public String getEmployeeID() {
            return employeeID;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getDepartment() {
            return department;
        }

		@Override
		public String toString() {
			return "Employee [employeeID=" + employeeID + ", name=" + name + ", email=" + email + ", department="
					+ department + "]";
		}
        
        
        
    }

    private static Map<String, Employee> employeeRecords = new HashMap<>();

    public static void addEmployee(String employeeID, String name, String email, String department) {
        Employee employee = new Employee(employeeID, name, email, department);
        employeeRecords.put(employeeID, employee);
    }

    public static void removeEmployee(String employeeID) {
        employeeRecords.remove(employeeID);
    }

    public static void update(String employeeID, String newDepartment) {
        if (employeeRecords.containsKey(employeeID)) {
            Employee employee = employeeRecords.get(employeeID);
            employee.department = newDepartment;
        }
    }

    public static List<Employee> department(String department) {
        return employeeRecords.values().stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public static Employee email(String email) {
        return employeeRecords.values().stream()
                .filter(employee -> employee.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args)
    {
    	
        addEmployee("1", "smith", "smith@123", "HR");
        addEmployee("2", "john", "john@123.com", "IT");
        addEmployee("3", "ward", "ward@123", "HR");

        removeEmployee("2");

        update("1", "SW");

        List<Employee> hrEmployees = department("HR");
        System.out.println("HR Employees:");
        hrEmployees.forEach(employee -> System.out.println(employee.getName()));

        Employee f = email("smith@123");
        System.out.println(f);
        
    }
}
