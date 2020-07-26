
package BST;

import org.springframework.aop.scope.ScopedObject;

// Java Program for finding K-th largest Node using O(1)
// extra memory and reverse Morris traversal. 
class KthLargestNumber {


    static class Node {
        int data;
        Node left, right;
    }

    // helper function to create a new Node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.right = null;
        temp.left = null;
        return temp;
    }

    static int count = 0;

    static Node KthLargestUsingMorrisTraversal(Node root, int k) {
        // count variable to keep count of visited Nodes
        if (root == null || count > k) {
            return null;
        }
        KthLargestUsingMorrisTraversal(root.right, k);
        count++;
        if (count == k) {
            return root;
        }
        KthLargestUsingMorrisTraversal(root.left, k);
//        while (curr != null) {
//            if (curr.right == null) {
//                // first increment count and check if count = k
//                if (++count == k)
//                    Klargest = curr;
//                // otherwise move to the left child
//                curr = curr.left;
//            } else {
//
//                // find inorder successor of current Node
//                Node succ = curr.right;
//
//                while (succ.left != null && succ.left != curr)
//                    succ = succ.left;
//
//                if (succ.left == null) {
//
//                    // set left child of successor to the
//                    // current Node
//                    succ.left = curr;
//
//                    // move current to its right
//                    curr = curr.right;
//                }
//
//                // restoring the tree back to original binary
//                // search tree removing threaded links
//                else {
//
//                    succ.left = null;
//
//                    if (++count == k)
//                        Klargest = curr;
//
//                    // move current to its left child
//                    curr = curr.left;
//                }
//            }
//        }
        return null;
    }

    // Driver code
    public static void main(String[] args) {
        // Your Java Code
	/* Constructed binary tree is 
		4 
		/ \ 
	2     7
	/ \ / \ 
	1 3 6 10 */

        Node root = newNode(4);
        root.left = newNode(2);
        root.right = newNode(7);
        root.left.left = newNode(1);
        root.left.right = newNode(3);
        root.right.left = newNode(6);
        root.right.right = newNode(10);

        System.out.println("Finding K-th largest Node in BST : " +
                KthLargestUsingMorrisTraversal(root, 2).data);
    }
} 
