import javax.swing.*;
public class UI {
    GameManager gm;
    JFrame window;

    public UI(GameManager gm){

        this.gm = gm;
    }

    public void createMainField(){

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
