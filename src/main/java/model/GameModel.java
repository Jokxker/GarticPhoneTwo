package model;

import view.GameView;

public interface GameModel {
    void createPlayer(int count);
    void registerPlayer();
    void savePlayer();
    void registerObserver(GameView o);
    void removeObserver();
    String getName();
}
