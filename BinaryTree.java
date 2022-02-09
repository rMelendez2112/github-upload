package Project2;

/* Class containing left and right child of current
node and key value*/
class Node2
{
	int key;
	Node left, right;

	public Node2(int item)
	{
		key = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BinaryTree
{
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(int key)
	{
		root = new Node(key);
	}

	BinaryTree()
	{
		root = null;
	}
	
	boolean empty() {
		return false;
	}
	
	Node insert (Node node, int k) {
		
		if (root == null) {
			root = new Node(k);
            return root;
		}
		
		else if (node.left == null) {
			root.left = new Node(k);
		}
		else if (node.right == null) {
			root.right = new Node(k);
		}
		
		root = new Node(k);
		
		return node;

	}
	
	boolean BST(Node node, int min, int max)
    {
		
        if (node == null)
            return true;
        
        if (node.key < min || node.key > max)
            return false;
 
        return (BST(node.left, min, node.key - 1) && BST(node.right, node.key + 1, max));
    }
	
	boolean checkBST()  {
        return BST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	int rootHeight(Node r) {
		if (r == null) {
            return 0;
        }
        return 1 + Math.max(rootHeight(r.left), rootHeight(r.right));
	}
	
	int rootMin(Node r) {
		if (r == null) {
            return 0;
        }
        return 1 + Math.min(rootMin(r.left), rootMin(r.right));
	}
	
	boolean checkAVL(Node r) {
		
		if((rootHeight(r) - rootMin(r)) >= 1) {
			
			System.out.println("Also an AVL Tree");
			return true;
		}
		
		else
			return false;
	}

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();

		/*create root*/
		tree.root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
			1
			/ \
			2	 3
		/ \ / \
		null null null null */


		tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/
	}
}
