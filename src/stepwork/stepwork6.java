/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stepwork;

/**
 *
 * @author Rand_oj17
 */
public class stepwork6 {
    public static void main(String args[]) {
       
    //Проверяем загорел не загорел...
    int h=0;
    boolean sunburn = false; //первичное состояние
    System.out.println("Я иду на море");
    while (sunburn != true){
    System.out.println("Загорелш!");
    h++; // +1 ko vremeny
    System.out.println(h);
    if (h>=3) sunburn = true; // когда h станет равно 3 то sunburn присвоит true
    }
    }
    
}
