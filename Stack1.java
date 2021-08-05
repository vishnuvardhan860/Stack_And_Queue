package com.stackandqueue;

	public class Stack1 {
	    //Represent a node of the singly linked list
	    public static class Node {
	        private int data;
	        private Node next;

	        //Parameter and Default Constructors
	        public Node(int x) {
	            this.data = x;
	            this.next = null;
	        }
	        public Node(){
	        }
	    }
	    //Represent the 'Stack Pointer' like top as of the singly linked list
	    private Node top = null;

	    /// Method to push int element in the stack
	    public void push(int x){
	        Node node = new Node(x);
	        node.next = top;
	        top = node;
	        System.out.println("Successfully pushed " + x);
	    }

	    /// Method to display stack in First In Last Out Order
	    public void display(){
	        if (top == null)
	            System.out.println("Stack is Under flow");
	        Node temp = new Node();
	        temp = top;
	        System.out.println("Stack Contains data in 'First In Last Out' Order : ");
	        while (temp != null){
	            System.out.println(+temp.data);
	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args) {
	        Stack1 stack = new Stack1();

	        //Pushing int elements
	        stack.push(70);
	        stack.push(30);
	        stack.push(56);

	        //Method to display stack in First In Last Out Order
	        stack.display();

	    }
	}