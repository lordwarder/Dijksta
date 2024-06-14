import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Graph_Loader will load graphs from a text folder.
 * Graphs will be stored as
 * <GraphName>
 * <NodeName> : <x, y> | <Neighbour> : <Distance>
 * ...
 * 
 * ie:
 * Triangle
 * A : 0, 0 | B : 3, C : 4
 * B : 3, 0 | A : 3, C : 5
 * C : 0, 4 | A : 4, B : 5
 * would be a graph called Triangle, shaped like:
 * A___B
 * |  /
 * | /
 * |/
 * C
 * 
 * @author Jack
 * @version 14/06/2024
 */
public class Graph_Loader
{
    // the graph we loaded
    private Graph loaded;

    /**
     * Constructor for objects of class Gaph_Loader
     * TODO try to load the file. Print out the filepath if I can't.
     */
    public Graph_Loader()
    {
        this("Demo.txt");
    }

    public Graph_Loader(String filename)
    {   
        try {
          File graphFile = new File(filename);
          Scanner myReader = new Scanner(graphFile);
          this.loaded = new Graph(myReader.nextLine());
          while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            System.out.println(line);
            //TODO add the strings to node and edgeStrings
          }
          myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error loading file: " + filename);
            e.printStackTrace();
        }
    }

    /**
     * takes each line and makes a node at the position
     * 
     * @param lines
     * @return a list of nodes
     * 
     * ie:
     * makeNodes(["0,0", "4,0", "0,5"]) should 
     * return [Node(0, 0), Node(4, 0), Node(0, 5)]
     */
    public List<Nodes> makeNodes(List<String> nodeStrings)
    {
        List<Node> nodes;
        //TODO use a for loop to process each string
    }
    
    /**
     * takes each line and makes a node at the position
     * 
     * @param lines
     * @return a list of nodes
     * 
     * ie:
     * makeNodes(["0,0", "4,0", "0,5"]) should 
     * return [Node(0, 0), Node(4, 0), Node(0, 5)]
     */
    public List<Nodes> makeEdges(List<Node> nodes, List<String> edgeStrings)
    {
        List<Edge> nodes;
        //TODO use a for loop to add each edge to the list, and both nodes 
        //to their neighbours
    }
}
