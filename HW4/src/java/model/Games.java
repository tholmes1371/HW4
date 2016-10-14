
package model;

public class Games {
    private int gameID;
    private String gameName;
    private int releaseYear;
    private String console;
    
    public Games() {
        this.gameID = 0;
        this.gameName = "";
        this.releaseYear = 0;
        this.console = "";
    }

    public Games(int gameID, String gameName, int releaseYear, String console) {
        this.gameID = gameID;
        this.gameName = gameName;
        this.releaseYear = releaseYear;
        this.console = console;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    @Override
    public String toString() {
        return "Games{" + "gameID=" + gameID + ", gameName=" + gameName + ", releaseYear=" + releaseYear + ", console=" + console + '}';
    }
    
       
    
}
