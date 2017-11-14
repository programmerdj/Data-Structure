package com.linear.linkedList;

class SLLNode {
	
	private int data;
	private SLLNode next;
	
	public SLLNode(int data) {
		this.data = data;
		next =null;
	}
	
	public SLLNode getNext() {
		return next;
	}
	
	public void setNext(SLLNode next) {
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data+" ";
	}
}