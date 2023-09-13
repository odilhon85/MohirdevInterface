package uz.devior.sport;

public class Player implements Information{

    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nameOfPlayer='" + nameOfPlayer + '\'' +
                ", sportType='" + sportType + '\'' +
                ", numberPosition=" + numberPosition +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
