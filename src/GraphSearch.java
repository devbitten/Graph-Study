import java.util.ArrayList;

public class GraphSearch {
	
	/**
	 * Performs a breadth-first search, and displays step-by-step
	 * as output to console. This method one does NOT have a goal 
	 * node. It just explores the whole graph. 
	 * 
	 * @param g		the graph to search
	 * @param sn	the staring node
	 */
	public static void performBFS(Graph g, int sn){
		int visited[] = new int[g.adjListArray.length];
		int visitedPosition = 0;
		boolean stillSearching = true;
		
		System.out.println("Current node visiting: " + sn);
		visited[0] = sn;

		ArrayList<Integer> fringeNodes = new ArrayList<Integer>();
		int currentNodeRefNumber = -1;
		
		
		//Gets the node number from the graphs adjacency list array
		//NOTE: first element of said array is the node number
		for(int i = 0; i < g.numVertices; i++){
			if(g.adjListArray[i].get(0) == sn)
				currentNodeRefNumber = g.adjListArray[i].get(0);
		}
		fringeNodes.add(currentNodeRefNumber);
		
		while(!fringeNodes.isEmpty()){
			visited[visitedPosition] = fringeNodes.get(0);
			visitedPosition++;
			fringeNodes.remove(0);
			
			for(int i = 1; i < g.adjListArray[currentNodeRefNumber].size(); i++){
				boolean explored = false;
				for(int j = 0; j < visited.length; j++){
					if( visited[j] == g.adjListArray[currentNodeRefNumber].get(i) )
						explored = true;
				}
				if(!explored){
					fringeNodes.add(g.adjListArray[currentNodeRefNumber].get(i));

					System.out.println("Node now visiting: " + currentNodeRefNumber);
				}
			}
			
		}
		/*
		//Gets fringe nodes for node
		for(int i = 0; i < g.adjListArray[sn].size(); i++){
			fringeNodes.add(g.adjListArray[currentNodeRefNumber].get(i));
			System.out.println("FN : " + g.adjListArray[currentNodeRefNumber].get(i));
		}
		while(stillSearching){
			
			//explores fringe nodes, one at a time
			while(!fringeNodes.isEmpty()){
				for(int i = 0; i < g.numVertices; i++){
					if(g.adjListArray[i].get(0) == fringeNodes.get(0))
						currentNodeRefNumber = g.adjListArray[i].get(0);
				}
				fringeNodes.remove(0);
				for(int i = 0; i < g.adjListArray[currentNodeRefNumber].size(); i++){
						fringeNodes.add(g.adjListArray[currentNodeRefNumber].get(i));
						System.out.println("FN : " + g.adjListArray[currentNodeRefNumber].get(i));
				}
				stillSearching = false;
			}
		}
		*/
		
	}
}
