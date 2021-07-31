package chap03;

class Dog {
	String name;
	public static void main(String[] args) {
		//创建Dog对象
		Dog dog1=new Dog();
		dog1.bark();
		dog1.name="Bart";
		
		//创建Dog数组
		Dog[] myDogs=new Dog[3];
		myDogs[0]=new Dog();
		myDogs[1]=new Dog();
		myDogs[2]=dog1;
		
		myDogs[0].name="Fred";
		myDogs[1].name="Marge";
		
		System.out.println("MyDogs[2]'s name is "+myDogs[2].name);
		
		for(int i=0;i<myDogs.length;i++) 
			myDogs[i].bark();
	}
	
	public void bark() {
		System.out.println(name+" says Wang!");
	}

}
