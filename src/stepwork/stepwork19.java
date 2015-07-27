/*
 Факоториал 
5! = 1 * 2 * 3 * 4 * 5 
6! = 5! * 6
N!=(N-1)!*N*/

package newproj;

public class class11 {

	public static int factorial (int number){
	if (number == 1 || number == 0 ) return 1;
	else return factorial (number-1)*number;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(4));

	}
	


}
