
/**
 * GraphMaker can be used to generate a random graph with 7 - 9 Nodes 
 * and 1-3 edges per node.
 * 
 * If I have time, I will also allow users to make their own graphs by dragging 
 * and dropping nodes onto a JPanel while holding left mouse, and 
 * connecting them together with edges while holding right mouse.
 *
 * @author Jack
 * @version 14/06/2024
 */
public class GraphMaker
{
    // instance variables - replace the example below with your own
    private Graph randomGraph;

    /**
     * Default Constructor for objects of class GraphMaker
     * TODO learn how to generate random numbers
     * TODO learn how to get a random element from a set
     */
    public GraphMaker()
    {
        Graph temp = new Graph("Random")
        //Add 7 - 9 Nodes to temp

        //for each Node in temp, get 3 random nodes from graph.

        //for each of these three nodes, if they are different from the first, 
        //add them to each other's neighbour's list, and add a resistance to 
        //their map.

        //Choose a random node as your source
        Node source = new Node("S");
        this.randomGraph = Dijkstra(temp, source).graph;
    }

    
}
