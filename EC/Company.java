import java.util.*;

public class Company {

	Person[] employee;

	public Company() {
		employee = new Person[100];
		for (int i = 0; i < 100; i++) {
			employee[i] = null;
		}

	}

	public Company(Person[] array) {

		employee = array;
	}

	public Person getEmployee(int index) {
		return employee[index];
	}

	public String toString() {
		String temp = " LIST OF EMPLOYEES\n________________________\n";

		for (Person p : employee) {
			if (p != null) {
				temp += p.toString();
				temp += "\n";
			}
		}
		return temp;
	}

	public void addHourlyPaid(HourlyPaid hp) {
		int index = 0;
		for (; index < 100; index++) {
			if (employee[index] == null) {
				employee[index] = hp;
				break;
			}
		}

	}

	public void addSalaried(Salaried s) {
		int index = 0;
		for (; index < 100; index++) {
			if (employee[index] == null) {
				employee[index] = s;
				break;
			}
		}

	}

	public void hireEmployee(Person p) {
		if (p instanceof HourlyPaid)
			addHourlyPaid((HourlyPaid) p);
		else if (p instanceof Salaried)
			addSalaried((Salaried) p);
	}

	private int search(String name) {

		int index;

		for (index = 0; index < 100; index++) {
			if (employee[index] != null) {
				if (employee[index].getName().equalsIgnoreCase(name))
					return index;
			}
		}

		return -1;

	}

	public void printCheck() {
		String name;

		System.out.print("Enter the name of the employee :");
		name = new Scanner(System.in).nextLine();

		int index = search(name);

		if (index == -1)
			System.out.println("Invalid Name...");
		else
			employee[index].printCheck();

	}
	
	
	public void fireEmployee() {
		
		String name;

		System.out.print("Enter the name of the employee to let go :( :");
		name = new Scanner(System.in).nextLine();

		int index = search(name);
		
		if ( index == -1 ) System.out.println("You can't fire someone who does not exist! Dah!");
		else employee[index] = null;
	}
	

}
