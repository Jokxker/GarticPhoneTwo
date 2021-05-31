package controller;
import model.GameModel;
import view.GameView;
import view.PlayerView;

public class PlayerController implements GameController {
    private GameModel model;
    private GameView view;

    public PlayerController(GameModel model) {
        this.model = model;
        view = new PlayerView(this, model);
        view.createCountPlayers();
    }

    @Override
    public void createPlayer() {

    }
}
