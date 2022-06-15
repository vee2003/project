public class SalaryTester {
    public static void main(String[] args) {
        Employee employee = new Employee("kate", 25, "939373750", "Planet Squanch", 
        25000, "Costumer Service");
        
        Manager manager = new Manager("kim", 30, "9285575648", "Apocalyptic Earth", 
        69500, "Management");
        employee.printSalary();
        manager.printSalary();
    }
}