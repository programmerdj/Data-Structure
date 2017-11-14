package com.linear.linkedList;

public class SingleLinkedList {

	private SLLNode head;
	
	public SLLNode getHead() {
		return head;
	}
	
	public void createLinkedList(int data) {
		
		if(head == null)
			head = new SLLNode(data);
	
	}
	
	public void addAtEnd(int data) {
		SLLNode temp;
		for(temp = head;temp.getNext()!=null;temp=temp.getNext());
		
		SLLNode newNode = new SLLNode(data);
		temp.setNext(newNode);
	}
	
	public void addAtStart(int data) {
		if(head!=null){
			SLLNode newNode = new SLLNode(data);
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void deleteFromEnd() {
		SLLNode temp;
		for(temp = head;temp.getNext().getNext()!=null;temp=temp.getNext());
		
		if(temp!=null){
			SLLNode delNode = temp.getNext();
			temp.setNext(null);
		}
	}
	
	public void deleteFromStart() {
		
		if(head!=null){
			SLLNode delNode = head;
			head = head.getNext();
		}
	}
	public void addAfterNode(int nodeData,int data) {
		SLLNode temp;
		for(temp = head;temp.getNext()!=null && temp.getData()!=nodeData;temp=temp.getNext());
		
		if(temp!=null){
			SLLNode newNode = new SLLNode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
	}
	
	private void displayList() {
		SLLNode temp;
		System.out.println();
		for(temp = head;temp!=null;temp=temp.getNext())
			System.out.print(temp+" ");
		
	}

	public static void main(String[] args) {

		SingleLinkedList obj = new SingleLinkedList();
		obj.createLinkedList(23);

		obj.addAtEnd(45);
		obj.addAtEnd(50);
		obj.addAtEnd(78);
		obj.addAtEnd(89);
		obj.addAtEnd(96);
		obj.addAtEnd(98);
	
		obj.displayList();
		
		obj.addAfterNode(50, 52);
		obj.displayList();	
		
		obj.addAtStart(15);
		obj.displayList();
		
		obj.deleteFromEnd();
		obj.deleteFromEnd();
	
		obj.displayList();
		
		obj.deleteFromStart();
		
		obj.displayList();
		
		System.out.println("\nHead of Node : "+obj.getHead());
	}


}
