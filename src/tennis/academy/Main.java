/**
 * 
 */
package tennis.academy;

/**
 * @author healy
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Academy nadal = new Academy();
		Coach alex = new Coach("Alex Roche", 2, 0);
		Coach martina = new Coach("Martina Navratilova", 2, 17000);
		
		Player simona = new Player("Simona Halep" , 132, 2, 130000);
		Player carlos = new Player("Carlos Alcaraz", 124, 14, 120000);
		
		nadal.AddCoach(alex);
		nadal.AddCoach(martina);
		nadal.AddPlayer(carlos);
		nadal.AddPlayer(simona);
		
		System.out.println(carlos);
		
		System.out.println(martina);
		System.out.println("Money earned by academy: " +nadal.getIncoming());
		System.out.println("Money spent by academy: " +nadal.getOutgoing());
		

	}
	
}
