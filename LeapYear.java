package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
class LeapYear
 {
   public static void main(String[] args) 
   {
	Utility util = new Utility();
	 System.out.println("Enter the year");
	int year = util.inputInteger();
	 String data =Integer.toString(year);
	int len = data.length();
	if (year <= 0) {
      System.out.println("input is not a positive Integer ");
      System.out.println("Please enter a positive integer value: ");
	}else if(len>=4){
           util.leapYear(year);
         }else 
      System.out.println("enter the 4 digit year");
	
 }
}
