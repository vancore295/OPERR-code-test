package linkList;

public class IntNode {
	private Integer data;
	private IntNode nextNode;
	
	public IntNode(Integer data, IntNode next) {
		this.data = data;
		this.nextNode = next;
	}
	
	public IntNode(Integer data) {
		this.data = data;
	}
	
	public IntNode() {}
	
	public Integer GetData () {
		return this.data;
	}
	
	public void SetData(int data) {
		this.data = data;
	}
	
	public IntNode GetNext() {
		return this.nextNode;
	}
	
	public void SetNext(IntNode next) {
		this.nextNode = next;
	}
	
	public void RemoveNext() {
		this.nextNode = null;
	}
}
