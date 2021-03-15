package by.franc;
//содержит название команды, количество игроков и счет
public class Team {
    private int numberOfPlayers =0;
    private String teamName= null;
    private int points = 0;
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }



}
