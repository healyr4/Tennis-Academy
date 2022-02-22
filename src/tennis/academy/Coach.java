/**
 * 
 */
package tennis.academy;

/**
 * @author healy
 *
 */
public class Coach {
	private String name;

	private int id;
	private int moneyEarned;
	
	private Coach(String name, int id, int moneyEarned) {
		this.name = name;
		this.id = id;
		this.moneyEarned = moneyEarned;

	}
	
	public int getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneyEarned(int moneyEarned) {
		this.moneyEarned = moneyEarned;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	

}


