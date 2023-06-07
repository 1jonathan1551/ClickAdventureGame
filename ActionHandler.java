import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionHandler implements ActionListener {

    GameManager gm;

    public ActionHandler(GameManager gm) {
        this.gm = gm;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String yourChoice = e.getActionCommand();

        switch(yourChoice) {
            case "yesyesyes": gm.ev1.yesyesyes(); break;
            case "oldboys": gm.ev1.oldboys(); break;
            case "rovers": gm.ev1.rovers(); break;
            case "minionminion": gm.ev1.minionminion(); break;
            case "chiefsosa": gm.ev1.chiefsosa(); break;
            case "cobra": gm.ev1.cobra(); break;
            // Change Scenes
            case "goScene1": gm.sChanger.showScene1(); break;
            case "goScene2": gm.sChanger.showScene2(); break;
        }
    }
}
