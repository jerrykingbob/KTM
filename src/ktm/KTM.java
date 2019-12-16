
package ktm;

import java.io.IOException;
import java.util.Scanner;

public class KTM{
    static String ui_state;

    public static void main(String[] args) {
        System.out.println("---------- Welcome to KTM (Kereta api Tunggu Menunggu)  -----------");
        startMenu();
        
    }
    
    public static void startMenu(){
        Scanner s=new Scanner(System.in);
        System.out.println("1- Login \n2- Book Ticket \n0- exit");
        
        ui_state=s.next();
        if(ui_state.equals("0")){
            System.out.println("Thank-you and Goodbye!");
        }
        else if(ui_state.equals("1")){
            System.out.println("login");
        }
        else if(ui_state.equals("2")){
            System.out.println("book");
            Booking.bookMain();
        }
        else{
            System.out.println("\nPlease select options 0 or 1 only!");
            startMenu();
        }
    }
    
    public static void clearConsole(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.flush();
    }
    
    
    
    
    
    
    
}
