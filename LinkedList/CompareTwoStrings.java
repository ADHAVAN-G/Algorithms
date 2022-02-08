class Node{
	char data;
	Node next;
	Node(char data){
		this.data=data;
	}
}
class LinkedList{
	Node head=null;
	Node tail=null;
	void add_data(char data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=head;
			tail.next=null;
		}
		else {
			tail.next=n;
			tail=tail.next;
			tail.next=null;
		}
	}
	void print() {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
public class CompareLinkedList {

	public static int compare(LinkedList obj1,LinkedList obj2) {
		if(obj1.head==null && obj2.head==null) {
			return 1;
		}
		else {
			Node temp1=obj1.head;
			Node temp2=obj2.head;
			while(temp1!=null || temp2!=null) {
				if(temp1!=null && temp2==null)return 1;
				if(temp1==null && temp2!=null)return -1;
				if(temp1.data!=temp2.data) {
					if(temp1.data>temp2.data)
						return 1;
					if(temp2.data>temp1.data)
						return -1;
				}
				
				temp1=temp1.next;
				temp2=temp2.next;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add_data('a');
		l.add_data('d');
		l.add_data('h');
		l.add_data('a');
		l.add_data('v');
		LinkedList m=new LinkedList();
		m.add_data('a');
		m.add_data('d');
		m.add_data('h');
		m.add_data('a');
		m.add_data('v');
		System.out.println(compare(l,m));
	}
}
