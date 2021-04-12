package hw3;

import java.util.ArrayList;
import java.util.Comparator;

public class Edge {
	static int node1 = 0;
	static int node2 = 0;
	int cost = 0;
	
	Node A = new Node();
	Node B = new Node();
	
	public Edge(int Node1, int Node2, int Cost){
		this.node1 = Node1;
		this.node2 = Node2;
		this.cost = Cost;
		
	}
	
	public Edge(Node a, Node b, int Cost){
		this.A = a;
		this.B = b;
		this.cost = Cost;
	}
	
	public Node getNode1(){
		return  A;
	}
	
	public Node getNode2(){
		return B;
	}
	
	public int getCost(){
		return cost;
	}
}

//Information on Comparator interface was found here:
//https://www.geeksforgeeks.org/comparator-interface-java/
class  SortByEdge implements Comparator<Edge>{
	public int compare(Edge a, Edge b){
		return a.cost - b.cost;
	}
}
 