
package newproj;

public class class09 {
 
	static int x = 0; // поле класса, для видимости вне методов 
	
	public static void main(String[] args) {
	
		int []ar = {1, 2, 3, 4, 5, 6, 7};
	
		//show(ar);
		ar = change(ar);
		show(ar);
	}
	
	public static void show (int mass []){
	
		for (int i =0; i < mass.length; i++){
			 System.out.print(mass [i]+",");
						 
		}
	}
	
	public static int[] change (int mass []){
		
		mass = new int [10];
		return mass;
	}
	
	
	
	public static void main2(String[] args) {
		
		// варианты вывода
	//System.out.print(sum(12, 5));
	
		//if (sum(10, 3)== 13) System.out.print("Ok!");
	
	 int result = sum (14, 7);
	 
	 System.out.print(x); // из поля видимости
	 
	}


public static int sum (int a, int b){
	int x;
	x= a+b;
	return x; // или просто return a+b;

	
	/*if (a == 5) return  a+b;
	else if (a != 5) return a-b;*/
}
	


	
}
