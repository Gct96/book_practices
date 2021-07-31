package chap09;
import java.util.*;

class SimUnit{
	String botType;
	public static int count=0;
	SimUnit(String type){
		botType=type;
		count++;
	}
	int powerUse() {
		if("Retention".equals(botType))
			return 2;
		else
			return 4;
				
	}
}


class V2Raditor{
	V2Raditor(ArrayList list){
		for(int x=0;x<5;x++) {
			list.add(new SimUnit("V2Radiator"));
		}
	}
}

class V3Raditor extends V2Raditor{
	V3Raditor(ArrayList lglist){
		super(lglist);
		for(int g=0;g<10;g++) {
			lglist.add(new SimUnit("V3Raditor"));
		}
	}
}


class RetentionBot{
	RetentionBot(ArrayList rlist){
		rlist.add(new SimUnit("Retention"));
	}
}


public class TestLifeSupportSim {
	public static void main(String[] args) {
		ArrayList alist=new ArrayList();
		V2Raditor v2=new V2Raditor(alist);
		System.out.println("When V2,count:"+SimUnit.count);
		V3Raditor v3=new V3Raditor(alist);
		System.out.println("When V3,count:"+SimUnit.count);
		for(int z=0;z<20;z++) {
			RetentionBot ret=new RetentionBot(alist);
		}
	}
}
