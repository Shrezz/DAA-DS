package TreesandGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	public static void inorder(Tree root){
		if(root!=null){
			inorder(root.left);
			System.out.println(root.value);
			inorder(root.right);
		}
	}
	public static void postorder(Tree root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.value);	
		}
	}
	public static void preorder(Tree root){
		if(root!=null){
			System.out.println(root.value);	
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void levelorder(Tree root){
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.add(root);
		while(!queue.isEmpty()){
			Tree node = queue.remove();
			if(node!=null){
				System.out.println(node.value);
				if(node.left!=null){
					queue.add(node.left);
				}
				if(node.right!=null){
					queue.add(node.right);
				}}}
	}
	
}
