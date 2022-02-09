//Part B
//rxm180068

/*
*/

package Project2;

import java.util.*;
import java.io.*;

public class BTTest {
	
	public static void main(String[] args) throws IOException {
		
		//file writer from BookNodes
		File ISBN = new File("test.txt");
		FileWriter myWriter = new FileWriter("test.txt");
		Scanner myReader = new Scanner(ISBN);
		Random rand = new Random();
	
		int count = 0;
		
		for (int i = 0; i < 25; i++) {
			myWriter.write(rand.nextInt((999999999 - 0) + 1) + "\n"); //rand.nextInt((999999999 - 0) + 1) + "\n"
			count++;
		}
		myWriter.close();
		
		Scanner isbn = new Scanner(ISBN);
		
		BinaryTree bt = new BinaryTree();
		BinaryTree bst = new BinaryTree();
		AVLTree avl = new AVLTree();
		
		int key = 0;
		int tempKey;
		
		//key = Integer.valueOf( isbn.nextLine() );
		//bt.root = new Node(key);
		//tempKey = key;
		
		while (isbn.hasNextLine() == true) {	
			
			key = Integer.valueOf( isbn.nextLine() );
			
			bt.root = bt.insert(bt.root, key);
			avl.root = avl.insert(avl.root, key);
		}
		
		//compare arrays
		
		/*
		avl.preOrder(avl.root);
		int[] btArr;
		int[] avlArr;
		
		for(int i = 0; i < 25; i++) {
			//btArr[i] = 
		}
		*/
		
		
		System.out.println();
		
		if (bt.checkBST()) {
			System.out.println("It's a BST!");
			bt.checkAVL(bt.root);
		}
		
		else {
			System.out.println("Not a BST or AVL Tree");
		}
		
	}
	
	/*
	public static void checkAVL(int[] b, int[] a) {
		
		for (int i = 0; i < 25; i++) {
			
			if () {
				
			}
		}
		
	}
	*/
	
}
