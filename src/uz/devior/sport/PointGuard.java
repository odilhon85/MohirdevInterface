package uz.devior.sport;

public class PointGuard extends BassketballPlayer{

    private int countOfGuard;

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }

    public void setCountOfGuard(int countOfGuard) {
        this.countOfGuard = countOfGuard;
    }
}
