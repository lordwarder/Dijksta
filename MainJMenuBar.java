import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.util.List;

/**
 * MainJMenu is the JMenu that MainApplication stores its MenuBar in.
 * It will allow the user to save instances of graphs into a list and 
 * load them from that list. They can also restart or quit the app.
 *
 * @author Jack
 * @version 13/06/2024
 */
public class MainJMenuBar
{
    private JMenu graphs;
    private List<JMenuItem> loadGraphList;
    //TODO write a graph class
    //private List<Graph> graphList;
    private JMenuItem Restart;
    private JMenuItem Quit;

    /**
     * Constructor for objects of class MainJMenu
     */
    public MainJMenuBar()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
