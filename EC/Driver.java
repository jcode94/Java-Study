package EC;

public class Driver {

	public static void main(String[] args) {

		// Instantiate menu
		Menu mainMenu = new Menu();

		String option;

		option = mainMenu.getMainOption();

		System.out.println("You selected " + option);

		switch (option) {
		case "1":
			System.out.println("Option 1");
			break;
		case "2":
			System.out.println("Option 2");
			break;
		case "3":
			System.out.println("Option 3");
			break;
		case "4":
			System.out.println("Option 4");
			break;
		default:
			System.out.println("Unknown response");
			break;
		}
		option = mainMenu.getSubOption();
		System.out.println("You selected " + option);

	}

}
