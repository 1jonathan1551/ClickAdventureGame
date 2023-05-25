import javax.swing.*;
import java.awt.*;

public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];

    public UI(GameManager gm){
xd
        this.gm = gm;
xd
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
        window.add(messageText); xdxd
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
        bgPanel[bgNum].add(bgLabel[1]); xdxd
    }
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String chest){

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx,objy,objWidth,objHeight);
        //objectLabel.setBounds(400,150,200,200);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(chest));
        objectLabel.setIcon(objectIcon);
xdxd
        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);

       // JLabel objectLabel2 = new JLabel();
        //objectLabel2.setBounds(440,120,200,200);

        //ImageIcon objectIcon2 = new ImageIcon(getClass().getClassLoader().getResource("minion.jpg"));
        //objectLabel.setIcon(objectIcon2);

        //bgPanel[1].add(objectLabel2);
        //bgPanel[1].add(bgLabel[1]);


    }

    public void generateScreen(){

        // Screen1
        createBackground(1, "forest.jpg");
        createObject(1,440,140,200,200,"chest.png");
    }
}
