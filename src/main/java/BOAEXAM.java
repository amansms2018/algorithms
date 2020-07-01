import com.example.algorithms.Exam.Employee;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BOAEXAM {

//    Problem 1 :
//    Search an element in a sorted and rotated array
//    An element in a sorted array can be found in O(log n) time via binary search.
//    But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
//    So for instance, 1 2 3 4 5 might become 3 4 5 1 2. write a funcation find an element in the rotated array in O(log n) time.
//    /**
//     Return the index of the element , if found . else return -1
//     */
//    int search(int arr[]){
//    }
//    from Manoj Shankar to Everyone:    6:17  PM
//    /**
//     Return the index of the element , if found . else return -1
//     */

    public int search(int arr[], int x) {
        int s = 0;
        int e = arr.length;
        int m = (s + e) / 2;

        while (s <= e) {
            if (arr[m] == x) {
                return m;
            } else if (x > arr[m]) {
                s = m;
                m = (s + e) / 2;
            } else if (x < arr[m]) {
                e = m;
                m = (s + m) / 2;
            }
        }


        return -1;
    }


//    ======================

//    Problem 2.
//    Given a binary tree, print level order traversal in a way that nodes of all levels are printed in separate lines.
//    Example
//        1
//                /    \
//                2      3
//                /   \  	 \
//                4    5       6
//                /   \    /
//                7     8  9
//

    //
    class Node {
        int data;
        Node left;
        Node right;

        // constructor
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    //    result:
//            1
//            2 3
//            4 5 6
//            7 8 9

    ///x=6
    void printByLevel(Node root, int x) {


//           Queue<Node> mydata=   new LinkedList<>();
//             mydata.add(root);
//
//        System.out.println(root.data);
//
//         while( mydata!=null){
//              System.out.println(root.data);
//         }
//
//
//        if(root==null) return;
//
//         else
//         {
//            System.out.println(root.data); //1
//             printByLevel( root.left); //2
//             printByLevel( root.right);
////            System.out.print(root.left.data);//23
////             System.out.println(root.right.data);
//             //
//
//             printByLevel( root.left); //2
//             printByLevel( root.right);
//         }


    }


    public static void main(String[] args) {
        Employee e1= new Employee(1, "A", 2);
        Employee e2= new Employee(1, "A", 2);
        Employee e3= new Employee(1, "A", 2);

        Set<Employee> set= new HashSet<>();
        set.add(e1);
        set.add(e1);
        set.add(e3);
        System.out.println(set.size());
    }

}
