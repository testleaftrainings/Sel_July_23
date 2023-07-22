package week1.day1;

public class LearnSwitch {
	public static void main(String[] args) {

		String day = "Friday";

		switch (day) {

		case "Monday": {
			System.out.println("Its Monday");
			break; // jump statement to stop the execution
		}
		case "Tuesday": {
			System.out.println("Its Tuesday");
			break;
		}
		case "Thursday": {
			System.out.println("Its Thursday");
			break;
		}
		case "Friday": {
			System.out.println("Its my weekoff");
			break;
		}
		case "Saturday": {
			System.out.println("Its working day");
			break;
			}
		
		default:
		{
			System.out.println("Its Holiday");
		}

		}

	}

}
