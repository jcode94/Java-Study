import java.util.Scanner;

public class Menu {

	public String getMainOption() {

		String option;
		System.out.println("1- Add Employee");
		System.out.println("2- Fire Employee");
		System.out.println("3- Print Paycheck for an Employee");
		System.out.println("4- Exit ");

		System.out.print("Enter your selection: ");

		option = new Scanner(System.in).nextLine();
		return option;
	}

	public String getSubOption() {

		String option;
		System.out.println("h- Hourly Paid");
		System.out.println("s- Salaried ");
		System.out.println("x- Return to main menu");

		System.out.print("Enter your selection: ");

		option = new Scanner(System.in).nextLine();
		return option.toLowerCase();
	}

}
