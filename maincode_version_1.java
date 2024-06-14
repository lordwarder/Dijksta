import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class maincode_version_1 extends JFrame implements ActionListener,MouseListener
{
   
    JButton myButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    String button;
    public maincode_version_1(){
        setTitle("title yet to be create");
        this.getContentPane().setPreferredSize(new Dimension(768,768));//X,Y
        this.pack();
        this.toFront();
        this.setVisible(true);
       
        addMouseListener(this); // listen for the mouse
       
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        menu = new JMenu("Start screen");
        menuBar.add(menu);
       
        menuItem=new JMenuItem("Quit");
        menuItem.setAccelerator(KeyStroke.getKeyStroke("SPACE"));
        menuItem.addActionListener(this);
        menu.add(menuItem);
       
    }
    public  void actionPerformed(ActionEvent e){
       
        String cmd = e.getActionCommand();
        switch(cmd){
            case "Quit": System.exit(0) ;
                break;
            default : System.out.println("Sorry, this hasn't impliment yet");
                break;
        }
    }
    
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
       
        g2.setColor(Color.ORANGE);
        g2.fillRect(0,0,768,768);
        g2.setColor(Color.BLACK);
        g2.fillRect(324,354,120,60);
        g2.setColor(Color.WHITE);
        g2.fillRect(329,359,110,50);
        g2.setColor(Color.BLUE);
        g2.drawString("Start",364,384);
    }
    //this code handles the mouse controls
    public void mouseExited(MouseEvent e) {System.out.println("exit");}
    public void mouseEntered(MouseEvent e) {System.out.println("enter");}
    public void mouseReleased(MouseEvent e) {System.out.println("release");}
    public void mousePressed(MouseEvent e) {System.out.println("press");}
    public void mouseClicked(MouseEvent e) {
        int mousex=e.getX();
        int mousey=e.getY();
        if (mousex<444) if (mousey<414)if(mousex>324)if (mousey>354){
         button="start";
        }
    }
}
