package com.GAC2.Problem2;

public class Main {
	 public  Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	   
	   
	   public static void BttoSkewed(Node root)
	                                
	    {
	       
	        if(root == null)
	        {
	            return;
	        }
	      
	            BttoSkewed(root.left);
	        
	        Node rightNode = root.right;
	       
	       
	       
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	       
	       
	            BttoSkewed(rightNode);
	        }
	    
	   
	    
	    public static void traverse(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.val + " ");
	        traverse(root.right);    
}
}
