//package INNOVATION-LAB.DAILY_TASK.DAY_3;

class Company {
    private static String companyName = "TechCorp";
    private final String employeeName;
    public Company(String employeeName) {
        this.employeeName = employeeName;
    }
    public static void setCompanyName(String name) {
        companyName = name;
    }
    public void displayDetails() {
        System.out.println("Company: " + companyName + ", Employee: " + employeeName);
    }
    public static void main(String[] args) {
        Company emp1 = new Company("AJITH");
        Company emp2 = new Company("KUMAR");
        emp1.displayDetails();
        emp2.displayDetails();

        Company.setCompanyName("AK_TECH");

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
