package homework.staticfinalmodificators;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    public GameSettings(String newGameName, int newCurrentPlayers) {
        this.gameName = newGameName;
        this.currentPlayers = newCurrentPlayers;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    public void printGameStatus() {
        System.out.println("Game Name: " + gameName + ", Current Players: " + currentPlayers + ", MaxPlayers: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Korns", 4);
        GameSettings game2 = new GameSettings("Worns", 7);
        setMaxPlayers(20);
        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

    }
}
