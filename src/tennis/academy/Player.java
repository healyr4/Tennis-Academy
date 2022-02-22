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
	private int studentID;
	private String name;
	private int moneyEarned;
	private int ranking;
	private int coachContribution;
	private ArrayList <String> tournamentsPlayed;
	
	public Player(int studentID , String name, int ranking) {
		this.studentID = studentID;
		this.name = name;
		this.ranking = ranking;
		this.moneyEarned = 0;
		this.coachContribution = 0;
		this.tournamentsPlayed = new ArrayList<String>();
	}
	
	public int getStudentID() {
		return studentID;
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
}
