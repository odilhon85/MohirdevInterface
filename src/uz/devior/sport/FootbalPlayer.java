package uz.devior.sport;

public class FootbalPlayer extends Player{

    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGols;

    public FootbalPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }

    public FootbalPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGols) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGols = countOfGols;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGols() {
        return countOfGols;
    }

    public void setCountOfGols(int countOfGols) {
        this.countOfGols = countOfGols;
    }
}
