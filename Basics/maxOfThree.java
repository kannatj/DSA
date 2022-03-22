/**
 * 
 */
package tjk.tutort.basics;

/**
 * @author KANNA
 *
 */
public class maxOfThree {

	
	
	public void printMaxOfThree(int a, int b,int c) {
		if(a >=b && a >=c)
			System.out.println(a+" is the max number");
		else if(b >= a && b >=c)
			System.out.println(b+" is the max number");
		else
			System.out.println(c+" is the max number");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maxOfThree m = new maxOfThree();
		m.printMaxOfThree(1, 2, 3);

	}

}
