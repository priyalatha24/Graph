package graph;

public class connectedgraphMain {

	public static void main(String[] args) {
			//create an obj of Graph class 
			int noVertices = 5 ;
			int noEdges=10;
			cycleGraph g1 = new cycleGraph(noVertices, noEdges);
			
			//create graph 
			g1.edge[0].src = 1; //edge1--2
			g1.edge[0].dest = 2;
			
			g1.edge[1].src = 1; //edge1--3
			g1.edge[1].dest = 3;
			
			g1.edge[2].src = 1; //edge1--4
			g1.edge[2].dest = 4;
			
			g1.edge[3].src = 1; //edge1--5
			g1.edge[3].dest = 5;
			
			g1.edge[4].src = 2; //edge2--3
			g1.edge[4].dest = 3;
			
			g1.edge[5].src = 2; //edge2--4
			g1.edge[5].dest = 4;
			
			g1.edge[6].src = 2; //edge2--5
			g1.edge[6].dest = 5;

			g1.edge[7].src = 3; //edge3--4
			g1.edge[7].dest = 4;

			g1.edge[8].src = 3; //edge3--5
		    g1.edge[8].dest = 5;

			g1.edge[9].src = 4; //edge4--5
			g1.edge[9].dest = 5;
	 
			//print graph 
			for (int i=0;i<noEdges;i++) {
				System.out.println(g1.edge[i].src+" - "+g1.edge[i].dest);
			}
			


	}

}
