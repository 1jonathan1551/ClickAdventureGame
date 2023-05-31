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
            case "yesyesyes": gm.ui.messageText.setText("malachi a human xddd"); break;
            case "oldboys": gm.ui.messageText.setText("disrespectful"); break;
            case "rovers": gm.ui.messageText.setText("range"); break;

        }
    }
}
