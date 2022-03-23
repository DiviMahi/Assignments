package Assignment3;

public class Company {
	public static void main(String[] args) {
		Employee employee = new Employee("Divya", 21, 79779219, "Coimbatore", 100000, "TeamLead");
		Manager manager = new Manager("Keerthi", 21, 9887654, "Chennai", 200000, "Technical");
		employee.PrintSalary();
		manager.PrintSalary();

	}
}
