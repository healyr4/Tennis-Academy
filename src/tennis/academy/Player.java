/**
 * 
 */
package tennis.academy;

import java.util.ArrayList;

/**
 * @author healy
 * This class is for each player
 * 
 *
 */
public class Player {
	private int playerID;
	private String name;
	private int moneyEarned;
	private int ranking;
	private int coachContribution;
	private ArrayList <String> tournamentsPlayed;
	
	public Player(String name , int playerID, int ranking, int moneyEarned) {
		this.playerID = playerID;
		this.name = name;
		this.ranking = ranking;
		this.moneyEarned = moneyEarned;
		this.coachContribution = (int) (moneyEarned*0.1);
		this.tournamentsPlayed = new ArrayList<String>();
	}
	
	public int getplayerID() {
		return playerID;
	}
	

	public String getName() {
		return name;
	}

	public int getMoneyEarned() {
		return moneyEarned;
	}
	public void setMoneyEarned(int moneyEarned) {
		this.moneyEarned = moneyEarned;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getCoachContribution() {
		return coachContribution;
	}
	public void setCoachContribution(int coachContribution) {
		this.coachContribution = coachContribution;
	}
	public ArrayList<String> getTournamentsPlayed() {
		return tournamentsPlayed;
	}
	public void setTournamentsPlayed(ArrayList<String> tournamentsPlayed) {
		this.tournamentsPlayed = tournamentsPlayed;
	}
	
    public String toString() {
    	if (ranking==0){
    		return "Player: "+ name + " and has earned $" + moneyEarned;
    	}
        return "Player: "+ name + " is ranked " + ranking
        		+ " has earned $ " + moneyEarned;
                
    }
}
