package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Gambler {
public static void main(String[] args) {
  Utility util = new Utility();
  int loss = 0;        
  int wins = 0;    
 System.out.println("gambler's stating bankroll");
 int stake  = util.inputInteger();  
 System.out.println("gambler's desired bankroll");  
 int goal   = util.inputInteger();
 System.out.println("number of trials to perform");      
 int trials = util.inputInteger();    

             // repeat trials times
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
               if (Math.random() < 0.5)
		{                 
                 cash++; 
                    // win $1
               } else                     
                 cash--; 
		    // lose $1
            }
            if (cash == goal) 
            wins++; 
	    else
            loss++;   
        }

       
        System.out.println(wins + " wins of " + trials);
	// System.out.println(loss + " loss of " + trials);
        System.out.println("Percent of games won = " + 100.0 *wins / trials);
        System.out.println("Percent of games loss = " + 100.0*loss / trials);
 }
}
