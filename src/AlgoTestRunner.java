
public class AlgoTestRunner {

	public static void main(String[] args) {
		


       final WeightedGraph t = new WeightedGraph (9);
       t.setLabel (0, "penne");
       t.setLabel (1, "loreto");
       t.setLabel (2, "collecorvino");
       t.setLabel (3, "montesilvano");
       t.setLabel (4, "spoltore");
       t.setLabel (5, "pescara");
       t.setLabel (6, "francavilla");
       t.setLabel (7, "chieti");
       t.setLabel (8, "ortona");
       t.addEdge (0,1, (int)(7  * 100 *.8));
       t.addEdge (0,2, (int)(9  * 100 *.9));
       t.addEdge (1,2, (int)(6  * 100 *.9));
       t.addEdge (1,3, (int)(10 * 100 *.7));
       t.addEdge (2,1, (int)(6  * 100 *.9));
       t.addEdge (2,3, (int)(7  * 100 *.7));
       t.addEdge (2,4, (int)(4  * 100 *.7));
       t.addEdge (3,4, (int)(5  * 100 *.8));
       t.addEdge (3,5, (int)(15 * 100 *.9));
       t.addEdge (4,5, (int)(7  * 100 *.9));
       t.addEdge (5,4, (int)(3  * 100 *.9));
       t.addEdge (4,6, (int)(6  * 100 *.6));
       t.addEdge (5,6, (int)(7  * 100 *.7));
       t.addEdge (6,8, (int)(15 * 100 *.6));
       t.addEdge (2,7, (int)(23 * 100 *.8));
       t.addEdge (1,7, (int)(22 * 100 *.8));
       t.addEdge (0,7, (int)(28 * 100 *.7));
       t.addEdge (4,7, (int)(10 * 100 *.8));
       t.addEdge (7,8, (int)(20 * 100 *.6));
       
       t.print();
 
       final int [] pred = Dijkstra.dijkstra (t, 0);
       final int top = t.size();
       for (int n=0; n<top; n++) {
          Dijkstra.printPath (t, pred, 0, n);
       }
				

	}

}
