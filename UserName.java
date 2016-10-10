package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
class UserName
 {
   public static void main(String[] args) 
   {
	Utility util = new Utility();
	String data = "Hello userName,How are you?";
     System.out.println("Enter the user name");
	String name = util.inputString();
	if(name.length()>2)
{
       String printOut = data.replace("userName",name);
	 System.out.println(printOut);
	}else
	System.out.println("Enter at least 3 char user name");
   }
 }
