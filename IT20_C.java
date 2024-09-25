package it20_c;

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
