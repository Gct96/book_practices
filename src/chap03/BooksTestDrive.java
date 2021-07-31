package chap03;

class Books{
	String author;
	String title;	
}

class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks=new Books[3];
		
		myBooks[0]=new Books();
		myBooks[1]=new Books();
		myBooks[2]=new Books();
		
		myBooks[0].title="Head First Java";
		myBooks[0].author="Kathy";
		myBooks[1].title="Python Programming";
		myBooks[1].author="Eric";
		myBooks[2].title="Java Cookbook";
		myBooks[2].author="ian";
		
		for(int i=0;i<3;i++) {
			System.out.println(myBooks[i].title+" is written by "+myBooks[i].
					author);
		}
	}

}
