import java.util.Scanner;
import java.io.*;

public class Main {
	
	Graph g;	//Graph the user will be working with
	
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
		/* TODO : UNBLOCK, UNIT TESTING
		while(userChoice < 1 || userChoice > 4){
			userChoice = in.nextInt();
			if(userChoice < 1 || userChoice > 4)
				System.out.print("\nPlease make another selection: ");
		}
		*/
		userChoice = 1;
		//Execute the user's choice
		switch(userChoice){
		case 1:
			System.out.println("You have chosen to perform BFS.");
			adjacencyListToGraph();
			break;
		case 2:
			System.out.println("You have chosen to perform DFS.");
			adjacencyListToGraph();
			break;
		case 3:
			System.out.println("Please type the address of the file you would like to use.");
			System.out.println(/*TODO CLEANUP*/ "e.g. C://BLAH/DIRECTORY");
			//TODO : adjacencyListToGraph(<<file location >>)
			break;
		case 4:
			System.out.println("Thank you for using the program.");
			System.exit(0);
			break;
		}
		
		
	}
	
	
	/**
	 * Takes the default file res/DFSBFSinput.dat
	 * as the input adjacency list matrix, ands
	 * turns it into a graph
	 * 
	 * @return void
	 */
	
	public static void adjacencyListToGraph(){
		String line = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("res/DFSBFSinput.dat"));
			
			while((line = br.readLine()) != null){
				addVertexToGraph(line);
			}
			
			br.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	// TODO override adjacencyListToGraph() with arguments that accepts arguments of file location
	
	public static void addVertexToGraph(String v){
		System.out.println(v);
	}
}
