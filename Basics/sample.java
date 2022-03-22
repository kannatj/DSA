package tjk.tutort.basics;


class test{
	test(){
		System.out.println("This is constructor");
	}
	
	private void show() {
		System.out.println("Hey this is show method");
	}
	
	public void print() {
		this.show();
	}
}


public class sample {
	public static void main(String[] args) {
	
		test t = new test();
		t.print();
	}
}
