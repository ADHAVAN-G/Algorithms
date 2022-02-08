class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node head=null;
	void add_data(int data) {
		Node tail;
		Node n=new Node(data);
		if(head==null || head.data>=n.data) {
			n.next=head;
			head=n;
		}
		else {
			tail=head;
			while(tail.next!=null && tail.next.data<n.data)
				tail=tail.next;
			n.next=tail.next;
			tail.next=n;
		}
	}
	void print() {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
public class SortedLinkedList {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add_data(6);
		l.add_data(3);
		l.add_data(9);
		l.add_data(5);
		l.add_data(0);
		l.print();
	}
}
