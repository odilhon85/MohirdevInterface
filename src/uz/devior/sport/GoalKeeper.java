package uz.devior.sport;

public class GoalKeeper extends FootbalPlayer{

    private int countOfSaves;


    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGols) {
        super(nameOfPlayer, sportType, numberPosition, teamName, countOfRedCard, countOfYellowCard, countOfGols);
    }


    public int getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(int countOfSaves) {
        this.countOfSaves = countOfSaves;
    }

}
