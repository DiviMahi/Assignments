package Assignment3;

public class Manager extends Member {
	String dept;

	public Manager(String name, int age, long phonenum, String address, int salary, String dept) {
		super(name, age, phonenum, address, salary);
		this.dept = dept;
	}

}
