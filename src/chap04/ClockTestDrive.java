package chap04;

class Clock{
	String time;
	
	public void setTime(String t) {
		time=t;
	}
	
	public String getTime(){
		return time;
	}
}


class ClockTestDrive {
	public static void main(String[] args) {
		Clock c=new Clock();
		c.setTime("18:22");
		
		String tod=c.getTime();
		System.out.println("time: "+tod);
	}
}
