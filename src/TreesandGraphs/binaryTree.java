package TreesandGraphs;
import java.util.Queue;
import java.util.LinkedList;
public class binaryTree {
	
	public static Tree createBinaryTree(Tree root, int value){
		if(root == null){
			root = new Tree(value);
			return root;
		}
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.add(root);
		while(!queue.isEmpty()){
			Tree n = queue.remove();
			if(n.left == null){
				n.left = new Tree(value);
				return n;}
			else if(n.right==null){
				n.right = new Tree(value);
				return n;
			}
			else{
				queue.add(n.left);
				queue.add(n.right);
			}
		}
		return null;
	}
	public static void checkifBST(Tree root){
		
		if(checkBST(root, null, null)) System.out.println("Yes it is a BST");
		else System.out.println("No, it is not a BST");
	}
	
	public static boolean checkBST(Tree node, Integer min, Integer max){
		if(node == null) return true;
		if(min!=null && node.value<=min || (max!=null && node.value>max)){
			return false;
		}
		if((!checkBST(node.left,min,node.value)) || (!checkBST(node.right, node.value,max))){
			return false;
		}
		return true;
	}
}
