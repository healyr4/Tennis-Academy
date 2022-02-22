/**
 * 
 */
package tennis.academy;
import java.util.ArrayList;
/**
 * @author healy
 *
 */
public class Academy {
	private ArrayList <Coach> coachList = new ArrayList<Coach>();
	private ArrayList <Player> playerList = new ArrayList<Player>() ;
	// Refers to money 
	private int incoming;
	private int outgoing;
	
	public Academy () {
		this.incoming = 0;
		this.outgoing = 0;
		this.coachList = coachList;
		this.playerList = playerList;
	}

	public void setIncoming(int incoming) {
		this.incoming = incoming;
	}

	public void setOutgoing(int outgoing) {
		this.outgoing = outgoing;
	}

	public int getIncoming() {
		return incoming;
	}


	public int getOutgoing() {
		return outgoing;
	}


	public ArrayList<Coach> getCoachList() {
		return coachList;
	}
	
	public void AddCoach(Coach coach) {
		this.coachList.add(coach);
		this.outgoing += coach.getMoneyEarned();
	}
	
	public void AddPlayer(Player player) {
		this.playerList.add(player);
		this.incoming += player.getCoachContribution();
	}
	
	public ArrayList<Player> getPlayerList() {
		return playerList;
	}
	

}
