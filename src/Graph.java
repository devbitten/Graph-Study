import java.util.LinkedList;

public class Graph {
	int numVertices;	//number of vertices
	int numV;			// TODO : RENAME
	int arrayFilling;	// TODO : RENAME xx22
	LinkedList<Integer> adjListArray[];	//Linked List of vertices
	
	public Graph(){
		numV = 0;
		arrayFilling = 0;
	}
	//	Trying to base graphs off number of nodes idea_2 stat:fail?
	public Graph(int n){
		numVertices = n;
		adjListArray = new LinkedList[n];
		for(int i = 0; i < n; i++){
			adjListArray[i] = new LinkedList();
		}
		arrayFilling = 0;
	}
	//

	public void addVertex(int v, int d){
		System.out.println("Attempting to add: " + v + " to " + numV);
		//adjListArray[numV]
		/**/// Redoing idea_3
		//adjListArray[numV] = new int[d];
		adjListArray[arrayFilling].add(v);
		arrayFilling++;
		System.out.println("You may have added node : " + v + " by means of " + arrayFilling);
		//*/
		
		/* CODE # 1st try
		//First check to see if vertex exists
		//(If it does exist, does not create vertex
		if(!g.adjListArray[v].isEmpty()){
			g.adjListArray[g.numV].add(new Integer(v));
			g.numV++;
		}else{
			System.out.println("FAILURE");
		}
		*/
		
	}
	/**
	 * TODO : finish javadoc here, and fill in class
	 * Adds an edge, in Graph g, from v1 to v2
	 * 
	 * @param g
	 * @param v1
	 * @param v2
	 */
	public void addEdge(int v1, int v2){
		for(int i = 0; i < adjListArray.length; i++){
			System.out.println("adjListArray.length = " + adjListArray.length + " || i = " + i );
			if(adjListArray[i].get(0) == v1){
				System.out.println("HERE 3");
				adjListArray[i].add(v2);
				System.out.println("HERE 4");
				return;
			}
		}
		System.out.println("ERROR IN ADDING EDGE: " + v1 + " to " + v2);
	}
}
