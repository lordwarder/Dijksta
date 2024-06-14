import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Graph_Loader will load graphs from a text folder.
 * Graphs will be represented as lines, with their neighbours and resistances
 * as comma seperated numbers:
 * ie:
 * 0,0|1,3 2,4
 * 3,0|2,5
 * 0,4
 * would be a triangle, shaped like:
 * 1 1 1
 * 1 1
 * 1 1
 * 1
 * 
 * @author Jack
 * @version 14/06/2024
 */
public class Graph_Loader
{
    // the graph we loaded
    private Graph loaded;
    // The nodes for our graph
    private List<Node> nodes;
    // The edges for our graph
    private List<String> Edges;

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
        List<String> nodeStrings = new ArrayList<>();
        List<String> edgeStrings = new ArrayList<>();
        try {
          File myObj = new File(filename);
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            System.out.println(line);
            //TODO add the strings to node and edgeStrings
          }
          myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error loading file: " + filename);
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
