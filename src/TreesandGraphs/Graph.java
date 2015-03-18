package TreesandGraphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
	//Adjacency Matrix
	//Adjacency List
		public static int matrix[][] = {{0,1,1,1,0},
		 {1,0,0,0,1},
		 {1,0,0,1,0},
		 {1,0,1,0,1},
		 {0,1,0,1,0}
		 };
	
		public static Map<String, List<String>> adjlist = new HashMap<String,List<String>>();
		
		
		public static void main(String args[]){
			
			/* Graph Traversal using Adjacency Matrix*/
			GraphTraversal.find_BFS(matrix);
			GraphTraversal.find_DFS(1);
			
			/*Graph Traversal using Adjacency Lists*/
			String[] s = new String[]{"B","C"};
			String[] s1 = new String[]{"A","C"};
			String[] s2 = new String[]{"A","B","D"};
			String[] s3 = new String[]{"C"};
			
			adjlist.put("A", Arrays.asList(s));
			adjlist.put("B", Arrays.asList(s1));
			adjlist.put("C", Arrays.asList(s2));
			adjlist.put("D", Arrays.asList(s3));
			
		}
		
		
}
