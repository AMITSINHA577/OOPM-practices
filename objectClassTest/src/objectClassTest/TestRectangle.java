package objectClassTest;


class Rectangle {
	
	int length;
	int width;
	
	
	void enterData(int l, int w) {
		
		length = l;
		width = w;
		
	}
	
	void displayData() {
		System.out.println(length*width);
	}
	
}


class TestRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.enterData(12, 12);
		r1.displayData();
	}

}
