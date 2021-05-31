import controller.GameController;
import controller.PlayerController;
import model.Game;
import model.GameModel;

public class GarticPhoneTest {
    public static void main(String[] args) {
        GameModel model = new Game();
        GameController controller = new PlayerController(model);
    }
}
