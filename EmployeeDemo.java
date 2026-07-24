import java.util.*;


class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Salary=" + empSalary + "]";
    }
}


class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 75000));
        employees.add(new Employee(102, "Bob", 50000));
        employees.add(new Employee(103, "Charlie", 90000));
        employees.add(new Employee(104, "David", 60000));
        employees.add(new Employee(105, "Eve", 85000));

        
        employees.sort((e1, e2) -> Double.compare(e2.getEmpSalary(), e1.getEmpSalary()));

        System.out.println("Employees sorted by descending salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        try {
            Employee found = findEmployeeByName(employees, "Zara"); 
            System.out.println("Found: " + found);
        } catch (EmployeeNotFoundException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    
    public static Employee findEmployeeByName(ArrayList<Employee> employees, String name) throws EmployeeNotFoundException {
        for (Employee e : employees) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        throw new EmployeeNotFoundException("Employee with name '" + name + "' does not exist.");
        
    }
}