package Assignment3;

public class Employee extends Member {
	String specialization;

	public Employee(String name, int age, long phonenum, String address, int salary, String specialization) {
		super(name, age, phonenum, address, salary);
		this.specialization = specialization;
	}

}
