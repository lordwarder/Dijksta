import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class to Display the main-menu, graph and animation.
 *
 * @author Jack
 * @version 10/06/2024
 */
public class MainApplication extends JFrame implements ActionListener, MouseListener {
    private JButton demoButton;
    private JButton NewGraphButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    private String button;
    
    //This was the teacher's recommended size.
    private static final int FRAME_WIDTH = 768;
    private static final int FRAME_HEIGHT = 768;
    
    /*
     * Calling the MainApplication without any parameters creates a default main menu
     * Which then waits for a button to be called.
     * TODO Implement Button Presses.
     */ 
    public MainApplication() {
        setTitle("Dijkstra Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom panel to handle background color and layout
        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        add(panel);
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menu = new JMenu("Start Screen");
        menuBar.add(menu);

        menuItem = new JMenuItem("Quit");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("SPACE"));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        demoButton = new JButton("Demo");
        demoButton.setActionCommand("Demo");
        demoButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(demoButton, gbc);
        
        NewGraphButton = new JButton("NewGraph");
        NewGraphButton.setActionCommand("NewGraph");
        NewGraphButton.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(NewGraphButton, gbc);

        pack();
        setVisible(true);
    }
    
    /**
     * When a button is clicked, it calls this function
     * TODO Finalise the list of buttons in the start menu
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "Quit":
                System.exit(0);
                break;
            case "Demo":
                System.out.println("TODO write a demo");
                // Trigger demo action
                break;
            case "NewGraph":
                System.out.println("TODO add a graph making class");
                // Trigger new graph action
                break;
            case "StartButton":
                System.out.println("Start button clicked");
                // Trigger start action
                break;
            default:
                System.out.println("Sorry, this hasn't been implemented yet.");
                break;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exit");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("enter");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("release");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("press");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApplication::new);
    }
}