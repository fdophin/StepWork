//РЕКУРСИЯ
package newproj;


public class class10 {
	
	public static int x = 0;
	
	public static void main(String[] args) {
		
		//int x =0;
		x--;
		int number = x;
		if ( x < 10) main(null); // вызов main 
		System.out.println("Finish of main #" + number + " " + x);
		//main(null);
	}


}
