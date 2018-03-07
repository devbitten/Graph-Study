import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		//Variables for user selection
		int userChoice = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("*******************************************");
		System.out.println("* Please select your input!               *");
		System.out.println("* [1] to perform a Breadth-first Search   *");
		System.out.println("* [2] to perform a Depth-first Search     *");
		System.out.println("* [3] to change the file input            *");
		System.out.println("* [4] to exit program                     *");
		System.out.println("*******************************************");
		
		//Code for getting the user's choice, with minor input validation
		System.out.print("User's choice: ");
		while(userChoice < 1 || userChoice > 4){
			userChoice = in.nextInt();
			if(userChoice < 1 || userChoice > 4)
				System.out.print("\nPlease make another selection: ");
		}
		
		//Execute the user's choice
		switch(userChoice){
		case 1:
			System.out.println("You have chosen to perform BFS.");
			break;
		case 2:
			System.out.println("You have chosen to perform DFS.");
			break;
		case 3:
			System.out.println("Please type the address of the file you would like to use.");
			System.out.println(/*TODO CLEANUP*/ "e.g. C://BLAH/DIRECTORY");
			break;
		case 4:
			System.out.println("Thank you for using the program.");
			System.exit(0);
			break;
		}
		
		
	}

}
