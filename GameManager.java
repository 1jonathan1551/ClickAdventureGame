
import javax.swing.*;
class  GameManager{


    ActionHandler aHandler = new ActionHandler(this);
   public UI ui = new UI(this);

    public event01 ev1 = new event01(this);

    public static void main(String[] args) {

    new GameManager();

    }
    public GameManager(){
}

}