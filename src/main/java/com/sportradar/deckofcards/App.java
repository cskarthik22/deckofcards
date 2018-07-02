package com.sportradar.deckofcards;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       Deck _deck = new Deck();
       Scanner in = new Scanner(System.in);

       try {
      
       while(true) {
    	   System.out.print("Enter the choices (1-3): \n 1: SHUFFLE \n 2: SORT \n 3: Quit \n");
           int choice;
           choice = in.nextInt();
    	   switch (choice) {
           case 1:  
        	   int seed = Calendar.getInstance().get(Calendar.SECOND);
               System.out.println("SEED : " + seed);
        	   _deck.shuffle(seed);
        	   _deck.DisplayCards();
                    break;
           case 2:  
        	   CommonUtils.heapSort(_deck.cards);
        	   _deck.DisplayCards();
                    break;
           default: System.out.print("Exit from the program \n");
        	        return;      
           } 
       }
       }
       catch (InputMismatchException e) {
    		System.out.println("ERROR! Entered choice is not between 1 - 3 ... exit!\"");
    		System.exit(0);
    	} 
       catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
     
    }
}
