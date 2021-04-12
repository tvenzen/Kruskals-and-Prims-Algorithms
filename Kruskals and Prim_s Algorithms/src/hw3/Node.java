package hw3;

public class Node {
	int val = 0;
	boolean visited = false;
	
	public void setVal(int value){
		this.val = value;
	}
	
	public void isVisited(boolean status){
		this.visited = status;
	}
	
	public int getVal(){
		return val;
	}
	
	public boolean getStatus(){
		return visited; 
	}
	
}
