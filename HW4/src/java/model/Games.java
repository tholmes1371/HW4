
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
    
    
}
