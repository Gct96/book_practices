package chap04;

class PoorDog{
	private int size;
	private String name;
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
}


class PoorDogTestDrive {
	public static void main(String[] args) {
		PoorDog one=new PoorDog();
		System.out.println("Dog one size is: "+one.getSize());
		System.out.println("Dog two size is: "+one.getName());
	}
}
