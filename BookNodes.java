//Part A
//rxm180068

package Project2;

import java.io.*;
import java.util.*;

class AVLNode {
	//what?
	int key;
	int height;
	
	AVLNode leftPtr;
	AVLNode rightPtr;
}

public class BookNodes {

	public static void main(String[] args) throws IOException {
		
		//creates a file with 25 ISBN titles
		File ISBN = new File("filename.txt");
		FileWriter myWriter = new FileWriter("filename.txt");
		Scanner myReader = new Scanner(ISBN);
		Random rand = new Random();
	
		int count = 0;
		
		for (int i = 0; i < 25; i++) {
			myWriter.write(rand.nextInt((999999999 - 0) + 1) + "\n"); //rand.nextInt((999999999 - 0) + 1) + "\n"
			count++;
		}
		myWriter.close();
		
		System.out.println(count + " Titles Inserted");
		System.out.println("----------");
		
		//test isbn keys
		while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	      
	    System.out.println("----------");
		
		Scanner isbn = new Scanner(ISBN); //replacing: new File("filename.txt")
		int key = 0;
		
		//Book Object
		AVLTree tree = new AVLTree();
		int root = 0;
		
		//Max Height
		int height = 0;
		
		//Checks & Balances
		//System.out.println("\nTest");
		//System.out.print("Did something print?: ");
		//System.out.println(isbn.hasNextLine());
		
		
		while (isbn.hasNextLine() == true) {	
			
			key = Integer.valueOf( isbn.nextLine() );
			tree.root = tree.insert(tree.root, key);
			
			System.out.println();
			tree.preOrder(tree.root);
			System.out.println();
			//tree.height(tree.root);
			
			int falseHeight = tree.height(tree.root);
			height = Integer.parseInt(Integer.toString(falseHeight).substring(0, 1));
			
			System.out.println("\nHeight at Root: " + (height - 1));
			
			//test key value
			//System.out.print(key + " ");	It works
			//test height value
			
			tree.imbalance(tree.root, key);
			
		}
		
		//System.out.println("\nPreorder Traversal: ");
		//tree.key(tree.root);
		//tree.preOrder(tree.root);
		
		
	}
	
/*
	public static void imbalance (int k) {
		
		if (true) {
			
		}
		
		else {
			System.out.println("System Imbalance occured at inserting " + k + "; fixed in ");
		}
	}
*/	

	
/*  								-------------Given pseudocode------------
	public class AVLNode {

		String key; (ISBN number)
		Book bookObject; // Title <space> Author’s last name, any other attribute
		int height;
		AVLNode leftPtr;
		AVLNode rightPtr;

		}
*/
	
}
