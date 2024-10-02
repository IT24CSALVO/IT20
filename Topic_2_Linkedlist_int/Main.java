package Topic_2_Linkedlist_int;
import java.util.Scanner;

public class Main{

    
    

        public static void main(String[] args) {

        LinkedList list = new LinkedList();

     Scanner sc = new Scanner (System.in);
     
            // Adding elements to the list
            System.out.println("Enter 5 elements that you want to add: ");
            
            int color1 = sc.nextInt();
            int color2 = sc.nextInt();
             int color3 = sc.nextInt();
             int color4 = sc.nextInt();
              int color5 = sc.nextInt();
              
              
            list.add(color1);
            list.add(color2);
            list.add(color3);
            list.add(color4);
            list.add(color5);
            System.out.println("Current Linked List:");
            list.printList();
            
            //Delete
            System.out.println();
            System.out.println("Deleting 1 from the list...");
            System.out.println("Enter a node that you want to delete: ");
            int color6 = sc.nextInt();
            System.out.println("Current Linked List:");
            list.deleteByValue(color6);
            list.printList();
            
            //Move/Swap Pointer
            System.out.println();
            System.out.println("Movingn/Swapping node from index 1 to index 0");
            System.out.println("Enter a node that you want to swap: ");
            int color7 = sc.nextInt();
            int color8 = sc.nextInt();
            list.moveNodePointer(color7, color8);
            list.printList();

            sc.close();
        }
    }
        
        
    
    