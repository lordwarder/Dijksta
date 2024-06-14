import java.awt.Graphics;
import java.util.Set;
import java.util.HashSet;
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
    
    public String name = "Graph";
    public Set<Node> nodes = new HashSet<>();
    
    Graph(String name)
    {
        this.name = name;
    }

    public void addNode(Node nodeA) 
    {
        nodes.add(nodeA);
    }
    
    public void pprint()
    {
        System.out.println(this.name);
        for (Node node : nodes) {
            System.out.println(node.printString());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //For each edge, draw a line from node1 to node2
        
        //For each node, draw a circle at that point
    }
}
