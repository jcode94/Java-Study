
public class Salaried extends Person {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Salaried(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "[salary=" + salary + "]";
	}

	public void printCheck() {
	

		System.out.println("================= SALARIED =================");
		System.out.println(toString());
		System.out.println("_____________");
		System.out.println("Gross Pay: " + salary + "\tNet Pay: " + Math.round (salary * .93));

		System.out.println("==============================================");
	}

}
