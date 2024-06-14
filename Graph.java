import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
import javax.swing.JPanel;

/**
 * The Graph class stores and draws a list of Nodes, edges & their weights.
 * The player will be able to add ... to graphs to defend them from AI foes, 
 * who will use Dijkstra's algorithm to navigate the graph.
 *
 * @author Jack
 * @version 13/06/2024
 */
public class Graph extends JPanel
{
    //How big the levels are. Needs to be no Bigger than 768x768. (The size of the main application)
    private static final int FRAME_WIDTH = 768;
    private static final int FRAME_HEIGHT = 768;
    //How thick to draw the edges. This may be also be related to their weights
    private static final int EDGE_WIDTH = 2;
    private static final int NODE_SIZE = 5;
    //TODO add methods to modify edges and nodes
    private List<Point> nodes;
    private List<Edge> edges;
    //TODO add enemies to the starting node, then have them move towards the end node using Dijkstra's algorithm.
    public final Point startingNode;
    public final Point endingNode;
    
    // TODO give Nodes better names
    public static record Edge(Node node1, Node node2, int resistance, Colour c) {}
    /*
     * States:
     * 0 - not visited
     * 1 - visited but not explored
     * 2 - 
     * /
    
    public static record Node(List<Node> neighbours, int state) {}

    /**
     * Constructor for objects of class Graph
     */
    public Graph(List<Node> nodes, List<Edge> edges)
    {
        this.nodes = nodes;
        this.edges = edges;
        this.startingNode = nodes.get(0);
        // Add the last node in the list
        this.endingNode = nodes.get(nodes.size() - 1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //For each edge, draw a line from node1 to node2
        
        //For each node, draw a circle at that point
    }
}
