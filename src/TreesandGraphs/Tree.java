package TreesandGraphs;

public class Tree {
	Tree left;
	Tree right;
	int value;
	
	Tree(int value){
		this.value=value;
		this.left=null;
		this.right=null;
	}
	
	public static Tree add(Tree root, int value){
		if(root == null){
			root = new Tree(value);
			return root;
		}
		if(value<root.value){
			root.left = add(root.left,value);
		}
		else if(value>root.value){
			root.right = add(root.right,value);
		}
		return root;
	}
	
	public static void main(String args[]){
		Tree root = null;
/*		root = add(root, 10);
		add(root, 5);
		add(root, 20);
		//TreeTraversal tt = new TreeTraversal();
		TreeTraversal.inorder(root);*/
		root = binaryTree.createBinaryTree(root,5);
		binaryTree.createBinaryTree(root,10);
		binaryTree.createBinaryTree(root,20);
		binaryTree.checkifBST(root);
	}
}
