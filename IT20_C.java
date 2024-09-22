/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it20_c;

/**
 *
 * @author User
 */
public class IT20_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     char [][] prettysample ={
         {'*'},
         {'*','*'},
         {'*','*','*'},
         {'*','*','*','*'},
         {'*','*','*','*','*'},   
         };
     for (int i = 0; i<prettysample.length; i++){
         for (int j =0; j<prettysample[i].length; j++){
             System.out.print(prettysample[i][j]+" ");
         }
         System.out.println();
     }
    }
    
}
