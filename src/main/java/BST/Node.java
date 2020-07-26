package BST;// Java code to find k'th largest element in BST

// A binary tree node 
class Node { 

	int data; 
	Node left, right; 

	Node(int d) 
	{ 
		data = d; 
		left = right = null; 
	} 
} 

class BinarySearchTree { 

	  int c=0;
	// Root of BST 
	 static Node root;

	// Constructor 
	BinarySearchTree() 
	{ 
		root = null; 
	} 
	
	// function to insert nodes 
	public void insert(int data) 
	{ 
		this.root = this.insertRec(this.root, data); 
	} 
	
	/* A utility function to insert a new node 
	with given key in BST */
	Node insertRec(Node node, int data) 
	{ 
		/* If the tree is empty, return a new node */
		if (node == null) { 
			this.root = new Node(data); 
			return this.root; 
		} 

		if (data == node.data) { 
			return node; 
		} 
		
		/* Otherwise, recur down the tree */
		if (data < node.data) { 
			node.left = this.insertRec(node.left, data); 
		} else { 
			node.right = this.insertRec(node.right, data); 
		} 
		return node; 
	} 

	// class that stores the value of count 
	public class count { 
		int c = 0; 
	} 

	// utility function to find kth largest no in 
	// a given tree 
	Node kthLargestUtil(Node node, int k) 	{
		// Base cases, the second condition is important to
		// avoid unnecessary recursive calls
		if (node== null ||c >= k)
			return null;
		
		// Follow reverse inorder traversal so that the 
		// largest element is visited first 
		this.kthLargestUtil(node.right, k);
		
		// Increment count of visited nodes 
		c++;
		
		// If c becomes k now, then this is the k'th largest 
		if (c == k) {
			System.out.println(k + "th largest element is " + node.data);
			return node;
		}
		// Recur for left subtree
		this.kthLargestUtil(node.left, k);
		return null;
	} 

	// Driver function
	public static void main(String[] args) 
	{ 
		BinarySearchTree tree = new BinarySearchTree(); 
		
		/* Let us create following BST 
			50 
		/	 \ 
		30	 70 
		/ \ / \ 
	20 40 60 80 */
		tree.insert(50); 
		tree.insert(30); 
		tree.insert(20); 
		tree.insert(40); 
		tree.insert(70); 
		tree.insert(60); 
		tree.insert(80);

		if(tree.kthLargestUtil(root,1)!=null){
			System.out.println(tree.kthLargestUtil(root,1).data);
		}
//		for (int i = 1; i <= 7; i++) {
//			tree.kthLargestUtil(root,i);
//		}
	} 
} 

// This code is contributed by Kamal Rawal 
