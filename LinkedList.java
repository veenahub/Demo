package PID1;

class Node{
	int elm;
	Node next;
	Node(int elm,Node next){
		this.elm= elm;
		this.next= next;
	}
	
	
}

public class LinkedList {
	private Node first= null;
	private Node last= null;
	public void add(int elm) {
		if(first==null) {
			first=new Node(elm, null);
			last= first;
		}
		else {
			
			Node node2= new Node(elm, null);
			last.next = node2;
			last = node2;
		}
		
	}
	public int get( int index) {
		if (index==0) {
			return first.elm;
		}
		else {
			Node tmp= first;
			int result;
			int counter=0;
			while(counter<index) {
				tmp= tmp.next;
				counter++;
			}
				result= tmp.elm;
				return result; 
			
		}
			
	}

	
}
