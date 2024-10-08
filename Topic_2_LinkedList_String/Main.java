package Topic_2_LinkedList_String;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
    LinkedList list = new LinkedList();
    Scanner sc = new Scanner(System.in);
    
    list.add("Seven (feat. Latto) -Jungkook.");
    list.add("Cruel Summer - Taylor Swift.");
    list.add("Nothing - Bruno Major");
    list.add("Espresso - sabrina carpenter");
    list.add("Birds of a feather - Billie Eilish");
    list.add("We Can't Be Friends - Ariana Grande");

     boolean running = true;
        while (running) {
            System.out.println("\nCurrent Music List:");
            System.out.println("----------------------------");
            list.ShowList();
            System.out.println("----------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Add a song");
            System.out.println("2. Delete a song");
            System.out.println("3. Move a song");
            System.out.println("4. Swap two songs");
            System.out.println("5. Exit");
            System.out.println(" Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the song title to add: ");
                    String songToAdd = sc.nextLine();
                    list.add(songToAdd);
                    System.out.println("Song added.");
                    break;
                case 2:
                    System.out.print("Enter the song title to delete: ");
                    String songToDelete = sc.nextLine();
                    System.out.print("Are you sure you want to delete \"" + songToDelete + "\"? (yes/no): ");
                    String confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("yes")) {
                        list.deleteByValue(songToDelete);
                        System.out.println("Song deleted.");
                    } else {
                        System.out.println("Deletion canceled.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the current index of the song to move: ");
                    int currentIndex = sc.nextInt();
                    System.out.print("Enter the new index for the song: ");
                    int newIndex = sc.nextInt();
                    list.moveNodePointer(currentIndex, newIndex);
                    System.out.println("Song moved.");
                    break;
                case 4:
                    System.out.print("Enter the index of the first song to swap: ");
                    int index1 = sc.nextInt();
                    System.out.print("Enter the index of the second song to swap: ");
                    int index2 = sc.nextInt();
                    list.swapNodes(index1, index2);
                    System.out.println("Songs swapped.");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        sc.close();
        System.out.println("Byeeee");
    }
}


