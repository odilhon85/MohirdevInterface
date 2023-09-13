package uz.devior.sport;

public class Setter extends VolleyballPlayer{

    private int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
    }

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }

    public int getCountOfSets() {
        return countOfSets;
    }

    public void setCountOfSets(int countOfSets) {
        this.countOfSets = countOfSets;
    }
}
