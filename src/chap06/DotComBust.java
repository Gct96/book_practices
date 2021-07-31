package chap06;
import java.util.*;

public class DotComBust {
	private GameHelper helper=new GameHelper();
	private ArrayList<DotCom> dotComsList=new ArrayList<DotCom>();
	private int numOfGuesses=0;
	
	private void setUpGame(){
		// make some dot coms and give them locations
		DotCom one=new DotCom();
		one.setName("Pets.com");
		DotCom two=new DotCom();
		two.setName("eToys.com");
		DotCom three=new DotCom();
		three.setName("Go2.com");
		// put them in arraylist
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		// some tips
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com,eToys.com,Go2.com");
		System.out.println("Try to sink them all in the fewest number of gues");
		
		for(DotCom dotComToSet:dotComsList) {
			// apply 3 locations
			ArrayList<String> newLocation=helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying() {
		//dotcomslist非空时循环
		while(!dotComsList.isEmpty()) {
			// get user input
			String userGuess=helper.getUserInput("Enter a guess:");
			checkUserGuess(userGuess);
		}	
		finishGame();
	}
	/**
	 * 本类辅助方法
	 * @author KeyboardHero
	 * @param userGuess
	 */
	private void checkUserGuess(String userGuess){
		numOfGuesses++;
		//先假设未命中
		String result="miss";
		for(int i=0;i<dotComsList.size();i++) {
			//要求每个dotcom调用检查是否命中或击沉的方法
			result=dotComsList.get(i).checkYourself(userGuess);
			if(result.equals("hit")) 
				break;
			if(result.equals("kill")) {
				dotComsList.remove(i);
			  	break;
			}
		}
		System.out.println(result);
    }

	private void finishGame() {
		System.out.println("All Dot Coms are dead!");
		if(numOfGuesses<=18) 
			System.out.println("It only took you"+numOfGuesses+" guesses.");
		else
			System.out.println("Took you long enough."+numOfGuesses+" guesses.")
			;	
	}
	
	public static void main(String[] args) {
		DotComBust game=new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
