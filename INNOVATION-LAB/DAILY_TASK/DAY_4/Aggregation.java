import java.util.*;

class Battery {
    private int capacity;
    
    public Battery(int capacity) {
        this.capacity = capacity;
    }
    
    public int getCapacity() {
        return capacity;
    }
}

class Mobile {
    private Battery battery;
    
    public Mobile(int batteryCapacity) {
        this.battery = new Battery(batteryCapacity);
    }
    
    public void showBatteryInfo() {
        System.out.println("Mobile battery capacity: " + battery.getCapacity() + "mAh");
    }
}

class Employee {
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;
    
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName());
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(5000);
        mobile.showBatteryInfo();
        
        Department dept = new Department("IT");
        dept.addEmployee(new Employee("Alice"));
        dept.addEmployee(new Employee("Bob"));
        dept.showEmployees();
    }
}