public class Event01{

    public GameManager gm;

    public Event01(GameManager gm) {

        this.gm = gm;
    }

    public void lookCabin() {
        gm.ui.messageText.setText("Looks like a resting place.");
    }
    public void talkCabin() {
        gm.ui.messageText.setText("Who are you talking to?");
    }
    public void restCabin() {

        if(gm.player.defeatWerewolf==true) {
            gm.sChanger.showEndScreen(1);
        }
        else {
            if(gm.player.playerLife != gm.player.playerMaxLife) {
                gm.ui.messageText.setText("You rest at the home.\n(Your LIFE has recovered)");
                gm.player.playerLife++;
                gm.player.updatePlayerStatus();


            }
            else {
                gm.ui.messageText.setText("Your LIFE is full.");
            }
        }
    }
    public void lookChest() {
        gm.ui.messageText.setText("A chest is on the ground.");
    }
    public void talkChest() {
        gm.ui.messageText.setText("You talk to the chest but it says nothing.");
    }
    public void openChest() {
        gm.ui.messageText.setText("You open the chest and find a sword!");
        gm.ui.sword.setVisible(true);
        gm.player.hasSword=1;
        gm.player.weaponPower=2;
        gm.player.updatePlayerStatus();

    }
    public void lookGuard() {
        gm.ui.messageText.setText("A guard is standing in front of you.");
    }
    public void talkGuard() {
        if(gm.player.hasSword==0) {
            gm.ui.messageText.setText("Guard: Don't go any further without a weapon! \nYou should check the chest over there.");

        }
        else {
            gm.ui.messageText.setText("Guard: Don't go any further without a weapon! \n...Oh never mind. It seems you already have it.");

        }
    }
    public void attackGuard() {
        if(gm.player.hasShield==0) {
            if(gm.player.hasSword==0) {
                if(gm.player.playerLife!=1) {
                    gm.ui.messageText.setText("Guard: Hey, don't be stupid!\n(The guard hits you back and your life decreases by 1)");
                    gm.player.playerLife--;



                }
                else if(gm.player.playerLife==1) {
                    gm.ui.messageText.setText("Guard: What a fool...");
                    gm.player.playerLife--;

                    gm.sChanger.showGameOverScreen(1);

                }
            }
            else {
                gm.ui.messageText.setText("Guard: Oh, no!\n(You defeated the guard and got his shield!)");
                gm.ui.shield.setVisible(true);
                gm.player.hasShield=1;
                gm.player.shieldPower=1;


            }
            gm.player.updatePlayerStatus();
        }
        else {
            gm.ui.messageText.setText("Guard: You have bested me.");

        }
    }
}
