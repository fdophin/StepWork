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
public class stepwork11 {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++){
         
            if (i == 5 || i == 7) continue; //останавливает 2 операции (пропускаем): непоказываем 5 и 7
            System.out.println(i);
        }
        
    }
    
}
