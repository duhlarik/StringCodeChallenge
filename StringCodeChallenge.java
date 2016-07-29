import java.util.Scanner;

public class StringCodeChallenge {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";
		
		System.out.println("This app will determine if a word is a palindrome.");

		while (choice.equalsIgnoreCase("yes")) {
			String reverse = "";
			
			System.out.println("Type in a word and press enter.");

			String orginal = scan1.nextLine();
			
			reverse = reverseAString(reverse, orginal);
			
			if (orginal.equalsIgnoreCase(reverse)) {
				System.out.println("Your word is a palindrome");
				
			} else {
				System.out.println("This is not a palindrome");
			}
			
			System.out.println("Would you like to enter another word?");
			
			choice = scan1.nextLine();
		}
		
		System.out.println("Goodbye!");
		scan1.close();
	}

	public static String reverseAString(String reverse, String orginal) {
		for (int i = orginal.length() - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);
		}
		return reverse;
	}
}
