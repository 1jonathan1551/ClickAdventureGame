import javax.swing.*;
class Frrame{
    public static void main(String args[]){
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Jonathan Awesome Adventure Game");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
