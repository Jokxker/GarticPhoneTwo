package model;

import view.GameView;

import java.util.ArrayList;

public class Game implements GameModel {
    private ArrayList<Player> players = new ArrayList<>();
    private final ArrayList<GameView> observers = new ArrayList<>();

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public void createPlayer(int count) {
        for (int i = 0; i < count; i++) {
            players.add(new Player());
        }
    }

    @Override
    public void registerPlayer() {

    }

    @Override
    public void savePlayer() {

    }

    @Override
    public void registerObserver(GameView o) {
        observers.add(o);
    }

    @Override
    public void removeObserver() {

    }

    public String getName() {
        return "545";
    }
}
