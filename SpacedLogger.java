package week5CodingAssignment;

public class SpacedLogger implements Logger {

	public void log(String message) {
		for(int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i) + " ");
		}
		System.out.println();
	}

	public void error(String message) {
		System.out.print("Error: ");
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i) + " ");
		}
		System.out.println();
	}

	
	
}
