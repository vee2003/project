class Member {
    	private String name;
    	private int age;
    	private String phoneNumber;
    	private String address;
    	private int salary;

    	public Member(String name, int age, String phoneNumber, String address, int salary) {
        	this.name = name;
        	this.age = age;
        	this.phoneNumber = phoneNumber;
        	this.address = address;
        	this.salary = salary;
    	}

    	public void printSalary() {
        	System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    	private String specialization;

    	public Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) {
        	super(name, age, phoneNumber, address, salary);
        	this.specialization = specialization;
    	}
}

class Manager extends Member {
    	private String department;

    	public Manager(String name, int age, String phoneNumber, String address, int salary, String department) {
        	super(name, age, phoneNumber, address, salary);
        	this.department = department;
    	}
}

class Salary {
    	public static void main(String[] args) {
        	Employee employee = new Employee("Patricia ", 28, "09876543210", "Old Cabalan", 25276, "Database");
        	Manager manager = new Manager("Andrea", 30, "09123456789", "Gordon Heights", 50163, "IT");

        	employee.printSalary();
        	manager.printSalary();
    	}
}