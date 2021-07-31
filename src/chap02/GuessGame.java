package chap02;

public class GuessGame {
	Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	public void startGame() {
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
		int targetNumber=(int)(Math.random()*10);
		System.out.println("I'm thinking a number between 0 and 9...");
		
		while(true) {
			System.out.println("Number to guess is"+targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();
	
			if(p1.number==targetNumber) {
				p1isRight=true;
			}
			if(p2.number==targetNumber) {
				p2isRight=true;
			}
			if(p3.number==targetNumber) {
				p3isRight=true;
			}
			if(p1isRight||p2isRight||p3isRight) {
			    System.out.println("We have a winner!");
			    System.out.println("Player1 one got it right?"+p1isRight);
			    System.out.println("Player2 one got it right?"+p2isRight);
			    System.out.println("Player3 one got it right?"+p3isRight);
			    System.out.println("Game is over!");
			    break;
			}
			else {
				System.out.println("Players have to try again!");
			}
		}
	}
}
