package HomeWorkOop1;

public class Employee {
	public static void main(String[] args) {
		Employee em1 = new Employee(1, "meen", "rat", 10000);
//		Employee em2 = new Employee("1", "meen", "rat", 10000);

		System.out.println(em1);
		System.out.println(em1.raiseSalary(5));
	}
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id =id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
		
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	public int raiseSalary(int percent) {
		return this.salary *percent/100+salary;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
}
