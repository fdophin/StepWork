package newproj;

import java.util.Scanner;

public class class08 {

	
	
	public static void main(String[] args) {
		/*line(); 
		
		show("Hello");
		superline(15);
		superline(25);*/
		/*for(int i=0; i<20; i++){
			superline(i);
			}*/
		
			/*puperline(15, '@');
			puperline(20, '%');
			for(int i=65; i<65+26; i++){
				puperline(i-40, (char)i);	
			}*/
			/*superline2(12);*/
		line();
		line(20, '@');
		//line();
			
	}

	public static void line (int length, char s){ //puper перегрузка функции
	
		if(length <= 0) length = 0;
		for(int i=0; i<length; i++){ 
			System.out.print(s);
		
		}
		System.out.println();
	}
	
	
	/*public static void superline2 (int length){
		//Делегирование от superline2 к puperline
		puperline(length, '*');
	}*/
	
	public static void line (int length){ //super перегрузка функции
		if(length <= 0) length = 0;
		for(int i=0; i<length; i++){ 
			System.out.print("#");
		
		}
		System.out.println();
	}
	
	public static void line (){ 
		for(int i=0; i<10; i++){
			System.out.print("*");
		show("");
		}
		
	}
	
	
	public static void show (String text){
		System.out.println(text);
		
		
	}

}
