public class SceneChanger{

    GameManager gm;

    public SceneChanger(GameManager gm) {

        this.gm = gm;
    }

    public void showScene1() {

        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.messageText.setText("Defeat the monster then rest at hut to win!\n (right click to select, left click to execute action)" );


    }
    public void showScene2() {

        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
        gm.ui.messageText.setText("There is a spooky cave ahead...");



        gm.bm.resetMonsterLife();
    }
    public void showScene3() {

        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true);



        if(gm.player.defeatWerewolf==false) {
            gm.ui.messageText.setText("There is the monster!");

        }
        else {
            gm.ui.messageText.setText("There is the dead monster");

        }

    }
    public void showGameOverScreen(int currentBgNum) {

        gm.ui.bgPanel[currentBgNum].setVisible(false);
        gm.ui.titleLabel.setVisible(true);
        gm.ui.titleLabel.setText("YOU DIED");
        gm.ui.restartButton.setVisible(true);



    }
    public void exitGameOverScreen() {

        gm.ui.titleLabel.setVisible(false);
        gm.ui.restartButton.setVisible(false);
        gm.bm.resetMonsterLife();
        gm.player.setPlayerDefaultStatus();
    }
    public void showEndScreen(int currentBgNum) {

        gm.ui.bgPanel[currentBgNum].setVisible(false);
        gm.ui.titleLabel.setVisible(true);
        gm.ui.titleLabel.setText("The End!");
        gm.ui.messageText.setText("You are a brave warrior!\nThanks for playing!");
//		gm.ui.restartButton.setVisible(true);


    }
}
