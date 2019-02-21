package my.solved.programs;

class Nodes{
	Nodes left;
	Nodes right;
	int data;
	public Nodes(int data) {
		this.data=data;
	}
	public void insert(int value) {
		if(value<=data) {
			if(left==null) {
				left=new Nodes(value);
			}
			else {
				left.insert(value);
			}
		}else {
			
		}
	}
}
public class BinaryTree1 {

}
