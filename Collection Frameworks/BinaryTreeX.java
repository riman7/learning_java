import java.util.*;

public class BinaryTreeX {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){

        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){

        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
    }


    public static int countNodes(Node root){

        if(root == null){
            return 0;
        }

        int count = 1 + countNodes(root.left) + countNodes(root.right); 

        return count;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        int sum = leftSum + rightSum + root.data;

        return sum;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int height = Math.max(leftheight, rightheight) + 1;

        return height;
    }
    // Time Complexicity: O(n^2)
    public static int diameter(Node root){

        if(root == null){
            return 0;
        }

        int dia1 = diameter(root.left);   // not through root
        int dia2 = diameter(root.right);  // not through root
        int dia3 = height(root.left)+height(root.right) + 1; //Through root
        return Math.max(dia3, Math.max(dia2, dia1));
    }

    // Time Complexicity: O(n)
    static class TreeInfo{
        int height;
        int diameter;

        TreeInfo(int h, int d){
            this.height =h;
            this.diameter = d;
        }
    } 

    public static TreeInfo diameter2(Node root){

        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo leftInfo = diameter2(root.left);   // not through root
        TreeInfo rightInfo = diameter2(root.right);  // not through root

        int dia3 = leftInfo.height + rightInfo.height + 1; //Through root

        int d = Math.max(dia3, Math.max(leftInfo.diameter, rightInfo.diameter));
        int h = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new TreeInfo(h, d);
    }



    public static void main(String args[]){
        //Pre-order data
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preOrder(root);
        System.out.println();
        levelOrder(root);

        System.out.println("Number of Nodes: " +countNodes(root));

        System.out.println("Sum of nodes: " + sumOfNodes(root));

        System.out.println("Height of tree: " + height(root));

        System.out.println("Diameter of tree: " + diameter2(root).diameter);

    }
    
}
