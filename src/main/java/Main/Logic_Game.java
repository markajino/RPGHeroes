package Main;

import java.util.Scanner;

public class Logic_Game {
 //make object of scannner
static Scanner scanner_Obj = new Scanner(System.in);
    //in this function read int value from console
    public static int read_Int_Console(String prompt_Obj, int user_Choice_Obj){
        int input_Obj;

        do {
            System.out.println(prompt_Obj);
            try {
                input_Obj = Integer.parseInt(scanner_Obj.next());
            }catch (Exception e){
                input_Obj = -1;
                System.out.println("Error: Please enter a number");
            }
        }while (input_Obj < 1 || input_Obj > user_Choice_Obj);
        return input_Obj;
    }
  //in this function clear display
    public static void clearDisplay(){
        for(int i = 0; i < 50; i++)
            System.out.println();
    }
    //print spacces and hashes in console
    public static void print_Space_Console(int n) {
        for(int i = 0; i < n; i++)
            System.out.println("-");
        System.out.println();
    }
    //print heading in console
    public static void print_Heading_Console(String title){
        print_Space_Console(10);
        System.out.println(title);
        print_Space_Console(10);
    }
  //continue console in input scaner
    public static void Continue_Console(){
        System.out.println("\nEnter anything to continue...");
        scanner_Obj.next();
    }

}
