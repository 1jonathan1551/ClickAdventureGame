import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];

    public UI(GameManager gm){

        this.gm = gm;

        createMainField();
        generateScreen();

        window.setVisible(true);
    }

    public void createMainField(){

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        messageText = new JTextArea("Jonathan Awesome Game");
        messageText.setBounds(230,70,700,150);
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setOpaque(false);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);
    }
    public void createBackground(int bgNum, String bgFileName){

        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(40, 100, 700,350);
        bgPanel[bgNum].setBackground(Color.green);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,900,450);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("forest.jpg"));
        bgLabel[bgNum].setIcon(bgIcon);
        bgPanel[bgNum].add(bgLabel[1]);
    }
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String chest,
                             String choice1Name, String choice2Name, String choice3Name, String choice1Command, String choice2Command, String choice3Command){

        //Create pop menu
        JPopupMenu popMenu = new JPopupMenu();
        // create pop menu items
        JMenuItem menuItem[] = new JMenuItem[4];
        menuItem[1] = new JMenuItem(choice1Name);
        menuItem[1].addActionListener(gm.aHandler);
        menuItem[1].setActionCommand(choice1Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2Name);
        menuItem[2].addActionListener(gm.aHandler);
        menuItem[2].setActionCommand(choice2Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice3Name);
        menuItem[3].addActionListener(gm.aHandler);
        menuItem[3].setActionCommand(choice3Command);
        popMenu.add(menuItem[3]);

        // create objects
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx,objy,objWidth,objHeight);
        //objectLabel.setBounds(400,150,200,200);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(chest));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {

                                         public void mouseClicked(MouseEvent e) {
                                         }

                                         public void mousePressed(MouseEvent e) {

                                             if (SwingUtilities.isRightMouseButton(e)) {
                                                 popMenu.show(objectLabel, e.getX(), e.getY());
                                             }

                                         }

                                         public void mouseReleased(MouseEvent e) {
                                         }

                                         public void mouseEntered(MouseEvent e) {
                                         }

                                         public void mouseExited(MouseEvent e) {
                                         }

                                     });




        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);




    }
public void createArrowButton(int bgNum, int x, int y, int width, int height, String arrowFileName, String command){
        ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));

        JButton arrowButton = new JButton();
        arrowButton.setBounds(x,y,width,height);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setIcon(arrowIcon);
        arrowButton.addActionListener(gm.aHandler);
        arrowButton.setActionCommand(command);
        arrowButton.setBorderPainted(false);

        bgPanel[bgNum].add(arrowButton);


}

    public void generateScreen(){

        // Screen1
        createBackground(1, "forest.jpg");
        createObject(1,340,140,200,200,"chest.png", "eat", "meat", "open" , "yesyesyes" , "oldboys" , "rovers");
        createObject(1,140,140,200,200,"minion.png", "cool", "pressable", "buttons" , "minionminion" , "chiefsosa" , "cobra");
        createArrowButton(1,0,150,50,50,"sideswipe.png", "goscene2");
        bgPanel[1].add(bgLabel[1]);

        // Screen2
        createBackground(2, "93556");

        createArrowButton(2,650,150,50,50, "rightarrow.png", "goScene1");
        bgPanel[2].add(bgLabel[2]);
    }
}
