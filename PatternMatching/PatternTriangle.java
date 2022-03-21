package tjk.tutort.pattern;


/*
 * 
 * 
 * 
 * 
 Take away:
   
   if (A + B = constant)
   
   Then if A increases then B will decrease
   
 * 
 * 
 * 
 * 
 */

public class patternTriangle {
	
	
/*
 
 Pattern 1

* * * * * 
* * * * 
* * * 
* * 
* 
 	
 */
	
	public void printPattern1(int n){
		
		for(int i=0;i<n;i++) {
			for( int j=0;j<n-i;j++) {  //j<n-i
				System.out.print("* ");
			}
		  System.out.println("");
		 
		}
	}

	
	
	
/*
 * 
 //Pattern 2

* 
* * 
* * * 
* * * * 
* * * * * 

 * 	
 */
	
	public void printPattern2(int n){
		
		for(int i=0;i<n;i++) {
			for( int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		  System.out.println("");
		 
		}
	}	
	
	
	
	
	/*

 Pattern 3
	
* * * * * * 
  * * * * 
   * * * 
    * * 
     * 

	 */
	public void printPattern3(int n){
		
		for(int i=0;i<n;i++) {
			  
			int space = i;
			  while(space > 0) {
				  System.out.print(" ");
				  space--;
			  }
			  
			for( int j=0;j+i<n;j++) {
				System.out.print("* ");
			}
		  System.out.println("");
		 
		}
	}
	
	

	
/*
 * 
 * 
 pattern 4
 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 


 * 
 * 	
 */

public void printPattern4(int n){
		
		for(int i=0;i<n;i++) {
			  
			int space = n-i-1;
			  while(space > 0) {
				  System.out.print(" ");
				  space--;
			  } 
			  
			for( int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		  System.out.println("");
		 
		}
	}


public void printPattern5(int n){
	
	for(int i=0;i<n;i++) {
		
		int space = i;
		
		while(space > 0) {
			System.out.print("  ");
			space--;
		}
		
		for( int j=0;j<n-i;j++) {  //j<n-i
			System.out.print("* ");
		}
	  System.out.println("");
	 
	 
	}
}
	

public void printPattern6(int n){
	
	for(int i=0;i<n;i++) {
		
		int space = n-i-1;
		
		while(space > 0) {
			System.out.print("  ");
			space--;
		}
		
		for( int j=0;j<=i;j++) {  //j<n-i
			System.out.print("* ");
		}
	  System.out.println("");
	 
	 
	}
}
	
	public static void main(String[] args) {
	
	patternTriangle p = new patternTriangle();

	int n = 5;

	p.printPattern1(n);
	System.out.println();
	p.printPattern2(n);
	System.out.println();
	p.printPattern3(n);
	System.out.println();
	p.printPattern4(n);
	System.out.println();
	p.printPattern5(n);
	System.out.println();
	p.printPattern6(n);
	
	}
}

	
