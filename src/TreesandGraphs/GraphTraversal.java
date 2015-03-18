package TreesandGraphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphTraversal {
	public static int matrix[][] = {{0,1,1,1,0},
			 {1,0,0,0,1},
			 {1,0,0,1,0},
			 {1,0,1,0,1},
			 {0,1,0,1,0}
			 };
	//public static int[] visited = new int[matrix.length];
	public static Set<Integer> visited= new HashSet<Integer>();
	
	public static void find_BFS(int[][] matrix){
		int[] visited = new int[matrix.length+1];
		Queue<Integer> queue =new LinkedList<Integer>();
		int i=0;
		visited[i] = 1;
		queue.add(i);
		while(!queue.isEmpty()){
			i = queue.remove();
			System.out.println(i);
			for(int j=0;j<matrix.length;j++){
				if(matrix[i][j] == 1 &&  visited[j]==0){
					visited[j]=1;
					queue.add(j);
				}}
		}}
	
	public static void find_DFS(int root){
		System.out.println(root);
		visited.add(root);
		for(int i=0;i<matrix.length;i++){
			if(matrix[root][i] ==1 && !visited.contains(i)){
				find_DFS(i);
			}}
	}
	
	
	
}
