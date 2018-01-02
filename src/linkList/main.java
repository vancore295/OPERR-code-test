package linkList;

public class main {
	public static void main (String[] args) {
		IntNodeList test = new IntNodeList();
		
		int[] ints = {1,2,3,4,5,6};
		
		for(int i = 0; i < ints.length; i++) {
			test.Add(ints[i]);
		}
		test.Pop();
		test.RemoveGreater(3);
	}
}