import java.util.LinkedList;

public class Graph {
	int numV;	//number of vertices
	
	LinkedList<Integer> adjListArray[];	//Linked List of vertices
	
	public Graph(){
		numV = 0;
	}

	public static void addVertex(Graph g, int v, int d){
		//First check to see if vertex exists
		//(If it does exist, does not create vertex
		if(!g.adjListArray[v].isEmpty()){
			g.adjListArray[g.numV].add(new Integer(v));
			g.numV++;
		}else{
			System.out.println("FAILURE");
		}
		
	}
	/**
	 * TODO : finish javadoc here, and fill in class
	 * Adds an edge, in Graph g, from v1 to v2
	 * 
	 * @param g
	 * @param v1
	 * @param v2
	 */
	public static void addEdge(Graph g, int v1, int v2){
		g.adjListArray[v1].add(new Integer(v2));
	}
}
