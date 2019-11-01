package com.checkers.player;

public final class Player {
    private final String playerName;
    private final int playerWin;
    private final int playerLose;

    public Player(String playerName, int playerWin, int playerLose) {
        this.playerName = playerName;
        this.playerWin = playerWin;
        this.playerLose = playerLose;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerWin() {
        return playerWin;
    }

    public int getPlayerLose() {
        return playerLose;
    }
}
