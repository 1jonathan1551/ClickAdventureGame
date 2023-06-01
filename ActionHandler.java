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

        }
    }
}
