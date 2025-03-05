public final class Employee {
    
    private int id;
    private double salary;
    private static final double MIN_SALARY = 30000;

    public Employee(int id, double salary) {
        this.id = id;
        setSalary(salary);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= MIN_SALARY) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be less than " + MIN_SALARY);
        }
    }
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, 35000);
        emp1.displayEmployee();

        emp1.setSalary(25000);

        emp1.setSalary(40000);
        emp1.displayEmployee();
    }
}
