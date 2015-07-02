/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stepwork;

import java.util.Scanner;

/**
 *
 * @author Rand_oj17
 */
public class stepwork2 {
    public static void main(String[] args) throws Exception {
    
         Scanner sc = new Scanner (System.in);  
        System.out.println ("Welcome");
        System.out.print ("Enter, PIN: ");
        
    int pin = sc.nextInt();
            if (pin == 1234 ){
                System.out.println ("Access Ok!");
                      
            }
           else{
                throw new Exception
               ("Go to Hell!");
            }
           
//_________________________________________________
        /* Дз номер 1           
           if (number%2==0) {
           System.out.print ("четное");
           } else {
               System.out.print ("нечетное");
           }
          */
           
          
//_________________________________________________
                
          /* Дз номер 3     
                int n;
                n = sc.nextInt();
                 if (n > 0) {
           System.out.print ("positive");
           } else {
               if (n==0) {
               System.out.print ("netral");
               } else {
               System.out.print ("negative");
               }
                 }
            */
 //_________________________________________________           
            // Дз номер 6 
               int N = 1;
               int M = 10;
               Scanner sr = new Scanner (System.in);
               int number = sr.nextInt();
               if (number >=N) {
                   if (number <=M){
                   System.out.print ("Ok");
                   } else System.out.print ("Not Ok");
               
               }else System.out.print ("Not Ok");
               
                /*Правильно
               if (number > = N && number <= M)
               System.out.print (" Ok");
               else System.out.print ("Not Ok");
               */
             
             /*8 Ввести число и определить кратно ли оно 3, 5, и 7 одновременно if (x%3==0 && x%5==0 && x%7==0 )*/  
              
               /*9 Показать модуль введённого числа. Math.abs(n);*/   
                
            
    
    }
    
}
