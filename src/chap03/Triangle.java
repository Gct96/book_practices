package chap03;

class Triangle {
	double area;
	int height;
	int length;
	
	void setArea() {
		area=(height*length)/2;
	}
	
	public static void main(String[] args) {
		Triangle[] tri=new Triangle[4];
		for(int i=0;i<4;i++) {
			tri[i]=new Triangle();
			tri[i].height=(i+1)*2;
			tri[i].length=i+4;
			tri[i].setArea();
			System.out.println("triangle "+i+", area="+tri[i].area);
		}
	}

}
