public class Event02 {

    public GameManager gm;

    public Event02(GameManager gm) {

        this.gm = gm;
    }

    public void lookCave() {
        gm.ui.messageText.setText("It's a cave!");
    }
    public void talkCave() {
        gm.ui.messageText.setText("You hear the echo of your voice.");
    }
    public void enterCave() {
        if(gm.player.hasLantern==0) {
            gm.ui.messageText.setText("It's too dark to enter.");
        }
        else {
            gm.sChanger.showScene3();

        }
    }
    public void lookBag() {
        gm.ui.messageText.setText("Seems to be a bag on the ground.");
    }
    public void talkBag() {
        gm.ui.messageText.setText("I don't think it's gonna respond to me.");
    }
    public void searchBag() {
        gm.ui.messageText.setText("You find a lantern!");
        gm.ui.lantern.setVisible(true);
        gm.player.hasLantern=1;

    }

}