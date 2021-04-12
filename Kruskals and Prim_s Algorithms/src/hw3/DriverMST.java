package hw3;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DriverMST{
public static void main(String args[]) throws FileNotFoundException {
    File inputData = new File(args[0]);
	Scanner input = new Scanner(inputData);
	
	//The link to my recorded video:
	//https://www.screencast.com/t/0Rh7Hcnmpko
	
	//Graph reads the entirety of the file 
	//EdgeCost, Nodes1, and Nodes2 hold those value respectively.
	ArrayList<Integer> Graph = new ArrayList<Integer>();
	ArrayList<Integer> EdgeCost = new ArrayList<Integer>();
	ArrayList<Integer> Nodes1 = new ArrayList<Integer>();
	ArrayList<Integer> Nodes2 = new ArrayList<Integer>();
	String pEdges = null; //This string will hold -e
	
	//Searches through the args[] to see if there is an arguement with -e, if true, sets pEdges = to "-e"
		for (int i = 0; i < args.length; i++){
			if (args[i] == "-e");
				pEdges = "-e";
	} 
	
	//Incrementors to find and add value to the arraylists from the graph
    int i = 1;
	int j = 2;
	int k = 3;
	int n = 0;
	
	//While loop continues as there is another int in the file
	while (input.hasNextInt()) {
		Graph.add(input.nextInt());
			n++;
	}
	
	while (k < Graph.size()){
	Nodes1.add(Graph.get(i));
	Nodes2.add(Graph.get(j));
	EdgeCost.add(Graph.get(k)); 
	
	//The way these incrementors are set up, it will i will stay with the nodes in the first column, j with the second
	// and k with the third column.
	i = i+3;
	j = j+3;
	k = k+3;
	}
	
	int nodes = Graph.get(0); //Gets the amount of nodes in the graph
	ArrayList<Edge> Edges = new ArrayList<Edge>();// Holds all Edge objects
	
	//All edge objects hold the two nodes and cost associated with it according to the inputFile
	Edge A = new Edge(Nodes1.get(0),Nodes2.get(0),EdgeCost.get(0));
	Edge B = new Edge(Nodes1.get(1),Nodes2.get(1),EdgeCost.get(1));
	Edge C = new Edge(Nodes1.get(2),Nodes2.get(2),EdgeCost.get(2));
	Edge D = new Edge(Nodes1.get(3),Nodes2.get(3),EdgeCost.get(3));
	Edge E = new Edge(Nodes1.get(4),Nodes2.get(4),EdgeCost.get(4));
	Edge F = new Edge(Nodes1.get(5),Nodes2.get(5),EdgeCost.get(5));
	Edge G = new Edge(Nodes1.get(6),Nodes2.get(6),EdgeCost.get(6));
	Edge H = new Edge(Nodes1.get(7),Nodes2.get(7),EdgeCost.get(7));
	Edge I = new Edge(Nodes1.get(8),Nodes2.get(8),EdgeCost.get(8));
	Edge J = new Edge(Nodes1.get(9),Nodes2.get(9),EdgeCost.get(9));
	
	//Adding to the edge arraylist
	Edges.add(A);
	Edges.add(B);
	Edges.add(C);
	Edges.add(D);
	Edges.add(E);
	Edges.add(F);
	Edges.add(G);
	Edges.add(H);
	Edges.add(I);
	Edges.add(J);
	
	ArrayList<Integer> T = new ArrayList<Integer>(); // To retrieve the arraylist of integers returned by Kruskals and Prims algorithms
	long tick = System.currentTimeMillis(); //Calculates time
	T = KruskalsAlgorithm(nodes, Edges); //Retrieves the arraylist of node value added to the MST
	long tock = System.currentTimeMillis();
	
	//By subtracting the time before the algorithm from the time after, we get the total time it took.
	System.out.println("The total time cost of Kruskals Algorithm is: " + (tock-tick) + "ms"); 
	
	//If pEdges was initialized by the commandline, prints out the values collected.
	if (pEdges == "-e"){
		System.out.println("The nodes collected in Kruskal's are:");
		for (int inc = 0; inc < T.size(); inc++){
			System.out.println(T.get(inc));
		}
		}
	
	//Nodes being initialized for use in Prims algorithm. The Node class has a member that will allow us to specify if a node
	// has been visited or not
	Node NodeA = new Node();
	Node NodeB = new Node();
	Node NodeC = new Node();
	Node NodeD = new Node();
	Node NodeE = new Node();
	Node NodeF = new Node();
	Node NodeG = new Node();
	Node NodeH = new Node();
	Node NodeI = new Node();
	Node NodeJ = new Node();
	Node NodeK = new Node();
	Node NodeL = new Node();
	Node NodeM = new Node();
	Node NodeN = new Node();
	Node NodeO = new Node();
	Node NodeP = new Node();
	Node NodeQ = new Node();
	Node NodeR = new Node();
	Node NodeS = new Node();
	Node NodeT = new Node();
	
	//This arraylist will hold all of the nodes
	ArrayList<Node> Nodes = new ArrayList<Node>();
	NodeA.setVal(Nodes1.get(0));
	NodeB.setVal(Nodes1.get(1));
	NodeC.setVal(Nodes1.get(2));
	NodeD.setVal(Nodes1.get(3));
	NodeE.setVal(Nodes1.get(4));
	NodeF.setVal(Nodes1.get(5));
	NodeG.setVal(Nodes1.get(6));
	NodeH.setVal(Nodes1.get(7));
	NodeI.setVal(Nodes1.get(8));
	NodeJ.setVal(Nodes1.get(9));
	NodeK.setVal(Nodes1.get(0));
	NodeL.setVal(Nodes2.get(1));
	NodeM.setVal(Nodes2.get(2));
	NodeN.setVal(Nodes2.get(3));
	NodeO.setVal(Nodes2.get(4));
	NodeP.setVal(Nodes2.get(5));
	NodeQ.setVal(Nodes2.get(6));
	NodeR.setVal(Nodes2.get(7));
	NodeS.setVal(Nodes2.get(8));
	NodeT.setVal(Nodes2.get(9));
	
	//In my Edge class, I made a separate constructor to be able to take Node objects as well as ints.
	Edge NodesA = new Edge(NodeA, NodeK, EdgeCost.get(0));
	Edge NodesB = new Edge(NodeB, NodeL, EdgeCost.get(1));
	Edge NodesC = new Edge(NodeC, NodeM, EdgeCost.get(2));
	Edge NodesD = new Edge(NodeD, NodeN, EdgeCost.get(3));
	Edge NodesE = new Edge(NodeE, NodeO, EdgeCost.get(4));
	Edge NodesF = new Edge(NodeF, NodeP, EdgeCost.get(5));
	Edge NodesG = new Edge(NodeG, NodeQ, EdgeCost.get(6));
	Edge NodesH = new Edge(NodeH, NodeR, EdgeCost.get(7));
	Edge NodesI = new Edge(NodeI, NodeS, EdgeCost.get(8));
	Edge NodesJ = new Edge(NodeJ, NodeT, EdgeCost.get(9));
	
	ArrayList<Edge> Edges2 = new ArrayList<Edge>(); //This arraylist will be used by Prims
	Edges2.add(NodesA);
	Edges2.add(NodesB);
	Edges2.add(NodesC);
	Edges2.add(NodesD);
	Edges2.add(NodesE);
	Edges2.add(NodesF);
	Edges2.add(NodesG);
	Edges2.add(NodesH);
	Edges2.add(NodesI);
	Edges2.add(NodesJ);
	
	
	//Calculates the allotted time and may print nodes collected if specified.
	long bing = System.currentTimeMillis();
	T = PrimsAlgorithm(Nodes1.size() + Nodes2.size(), Edges2);
	long bong = System.currentTimeMillis();	
	System.out.println("The total time cost of Prim's Algorithm is: " + (bong-bing) + "ms");
	
	if (pEdges == "-e"){
		System.out.println("The nodes collected in Prim's are:");
	for (int inc = 0; inc < T.size(); inc++){
		System.out.println(T.get(inc));
	}
	}
	
}

	
		



public static ArrayList<Integer> KruskalsAlgorithm(int components, ArrayList<Edge> edges){
	Collections.sort(edges, new SortByEdge()); //Sorts edge according to cost.
	
	
	ArrayList<Edge> T = new ArrayList<Edge>(); //The empty set MST
	int i = 0;
	//This part directly follows the algorithm from the PDF.
	while (components >= 2){
			if (edges.get(i).node1 != edges.get(i).node2){
				T.add(edges.get(i));
				components--;
				i++;
			}
			else
				i++;
		}
	
	int totalCost = 0;
	for (int j = 0; j < T.size(); j++){
		totalCost += T.get(j).cost;
	}
	System.out.println("Kruskal's Algorithm Information");
	System.out.println("These are the costs collected: ");
	for (int u = 0; u < T.size(); u++)
		System.out.print(T.get(u).cost + ", ");
	
	System.out.print("\n");
	System.out.println("The total cost of the tree is:" + totalCost);
	Integer Adder = new Integer(0);

	//TValues is the arraylist that is being returned that holds all of the values of the nodes that were collected.
	//Values meaning nodes 0-6;
	ArrayList<Integer> TValues = new ArrayList<Integer>();
	for (int u = 0; u < T.size(); u++){
		if (TValues.contains(T.get(u).node1) == false)
	     TValues.add(Adder = new Integer(T.get(u).node1)); //ArrayList<Integer> cant hold ints, had to convert them to Integer objects.
		
		
		if (TValues.contains(T.get(u).node2) == false)
			TValues.add(Adder = new Integer(T.get(u).node2));
	}
	
	return TValues;
	
}

public static ArrayList<Integer> PrimsAlgorithm(int nodesNum, ArrayList<Edge> edges){
	Collections.sort(edges, new SortByEdge());// Sorts by edge cost in non-decreasing order.
	ArrayList<Edge> T = new ArrayList<Edge>(); //The empty set MST
	
	//All other nodes are initialized as unvisited.
	edges.get(0).A.isVisited(true); //Sets node 0 as visited, as instructed in the PDF algorithm.
	ArrayList<Integer> TValues = new ArrayList<Integer>();
	
	//This part directly follows the algorithm from the PDF
	int i = 0;
	int components = 6;
	while (i < edges.size() && components >= 2 ){
		if ((edges.get(i).A.visited == true || edges.get(i).A.visited == false) && edges.get(i).B.visited == false){
			if (TValues.contains(edges.get(i).A.getVal()) == false && TValues.contains(edges.get(i).B.getVal()) == false){
				T.add(edges.get(i));
				TValues.add(edges.get(i).A.val);
				TValues.add(edges.get(i).B.val);
				edges.get(i).A.isVisited(true);
				edges.get(i).B.isVisited(true);
				components--;
				i++;
			}
			else if(TValues.contains(edges.get(i).A.getVal()) == true && TValues.contains(edges.get(i).B.getVal()) == false){
				T.add(edges.get(i));
				TValues.add(edges.get(i).B.val);
				edges.get(i).A.isVisited(true);
				edges.get(i).B.isVisited(true);
				components--;
				i++;
			}
			else if(TValues.contains(edges.get(i).A.getVal()) == false && TValues.contains(edges.get(i).B.getVal()) == true){
				T.add(edges.get(i));
				TValues.add(edges.get(i).A.val);
				edges.get(i).A.isVisited(true);
				edges.get(i).B.isVisited(true);
				components--;
				i++;
			}
			else{
			T.add(edges.get(i));
			edges.get(i).A.isVisited(true);
			edges.get(i).B.isVisited(true);
			components--;
				i++;
			}
			
		}
		else{
			edges.get(i).A.isVisited(true);
			edges.get(i).B.isVisited(true);
			i++;
		}
	}
	
	int totalCost = 0;
	for (int j = 0; j < T.size(); j++){
		totalCost += T.get(j).cost;
	}
	System.out.println("Prim's Algorithm Information: ");
	System.out.println("The total cost of the MST is:" + totalCost);
	
	System.out.println("The costs collected are:");
	for (int j = 0; j < T.size(); j++){
		System.out.print(T.get(j).cost + ",");
	}
	System.out.print("\n");
	
	
	return TValues;
}
}
