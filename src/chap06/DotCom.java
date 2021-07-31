package chap06;
import java.util.*;
public class DotCom {
	//保存dotcom位置的arraylist
	private ArrayList<String> locationCells;
	//dotcom的名称
	private String name;
	/**
	 * 更新dotcom位置的setter
	 * @author KeyboardHero
	 * @param loc
	 */
	public void setLocationCells(ArrayList<String> loc) {
		locationCells=loc;
	}
	
	public void setName(String n) {
		name=n;
	}
	/**
	 * 检查是否命中或击沉的方法
	 * @author KeyboardHero
	 * @param userInput
	 * @return
	 */
	public String checkYourself(String userInput) {
		String result="miss";
		//indexOf方法，猜中返回位置，没有返回-1
		int index=locationCells.indexOf(userInput);
		if(index>=0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				result="kill";
				System.out.println("OHHH! You sunk "+name+" (:");
			}
			else
				result="hit";						
		}
		return result;
	}
}
