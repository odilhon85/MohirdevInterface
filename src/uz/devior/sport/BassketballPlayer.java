package uz.devior.sport;

public class BassketballPlayer extends Player{

    private int numberOfGoals;

    public BassketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }

    public BassketballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
}
