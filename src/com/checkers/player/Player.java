package com.checkers.player;

public final class Player {

    private final String playerName;
    private final int playerWins;
    private final int playerLoses;

    public Player(String playerName, int playerWins, int playerLoses) {
        this.playerName = playerName;
        this.playerWins = playerWins;
        this.playerLoses = playerLoses;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public int getPlayerLoses() {
        return playerLoses;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerWins=" + playerWins +
                ", playerLoses=" + playerLoses +
                '}';
    }
}
