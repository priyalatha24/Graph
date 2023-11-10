package graph;
class cycleGraph{
	//inner class to keep track of edges 
	public class Edge{
		public int src,dest;
	}
	//number of vertices and edges 
	int vertices , edges;
	
	//array to store all edges 
	Edge[] edge;
	
	cycleGraph(int vertices,int edges){
		this.vertices = vertices;
		this.edges = edges; 
		
		//initialize the edges array 
		edge = new Edge[edges]; // edge = new Edge[8];
		for(int i=0;i<edges;i++) {
			
			//each element of the edge array is an object of edge type 
			edge [i] = new Edge();
			
		}
	
}

}
