package Assignment3;

public class Member {
	String name;
	int age;
	long phonenum;
	String address;
	long salary;

	public Member(String name, int age, long phonenum, String address, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.phonenum = phonenum;
		this.address = address;
		this.salary = salary;
	}

	public void PrintSalary() {
		System.out.println("salary:" + salary);

	}

}
