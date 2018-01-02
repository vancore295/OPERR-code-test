package linkList;

public class IntNodeList {
	private IntNode head;
	private int listCount;
	
	public IntNodeList() {
		this.head = new IntNode(null);
		this.listCount = 0;
	}
	
	public IntNodeList(int data) {
		head = new IntNode(data);
		listCount = 1;
	}
	
	public void Add(int data) {
		IntNode temp = new IntNode(data);
		IntNode current = head;
		
		while(current.GetNext() != null) {
			current = current.GetNext();
		}
		current.SetNext(temp);
		this.incrementCounter();
	}
	
	public void Pop() {
		IntNode current = head;
		int count = 0;

		while(count <= (listCount - 2)) {
			current = current.GetNext();
			count++;
		}
		current.RemoveNext();
		this.decremateCounter();
	}
	
	public void RemoveGreater(Integer limit) {
		IntNode temp;
		IntNode next;
		IntNode current = head;
		
		if(current == null) {
			return;
		}
		
		while(current != null) {
			next = current.GetNext();
			
			if(next == null) {
				return;
			} else if(next.GetData() > limit) {
				temp = next.GetNext();
				current.SetNext(temp);
				this.decremateCounter();
			}
			
			current = current.GetNext();
		}
		
		this.RemoveGreater(limit);
	}
	
	public int Size() {
		return listCount;
	}
	
	private void incrementCounter() {
		listCount++;
	}
	
	private void decremateCounter() {
		listCount--;
	}
}
