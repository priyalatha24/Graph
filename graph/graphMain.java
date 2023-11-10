package graph;

public class graphMain {

	public static void main(String[] args) {
		//create an obj of Graph class 
		int noVertices = 5 ;
		int noEdges=8;
		cycleGraph g = new cycleGraph(noVertices, noEdges);
		
		//create graph 
		g.edge[0].src = 1; //edge1--2
		g.edge[0].dest = 2;
		
		g.edge[1].src = 1; //edge1--3
		g.edge[1].dest = 3;
		
		g.edge[2].src = 1; //edge1--4
		g.edge[2].dest = 4;
		
		g.edge[3].src = 2; //edge2--4
		g.edge[3].dest = 4;
		
		g.edge[4].src = 2; //edge2--5
		g.edge[4].dest = 5;

		g.edge[5].src = 3; //edge3--4
		g.edge[5].dest = 4;

		g.edge[6].src = 3; //edge3--5
	    g.edge[6].dest = 5;

		g.edge[7].src = 4; //edge4--5
		g.edge[7].dest = 5;
 
		//print graph 
		for (int i=0;i<noEdges;i++) {
			System.out.println(g.edge[i].src+" - "+g.edge[i].dest);
		}
		
	}

}
