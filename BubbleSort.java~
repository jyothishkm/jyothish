package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class BubbleSort {
@SuppressWarnings("unchecked") 
public static void main(String[] args) {
Utility util = new Utility();
System.out.println("Enter the how many no are enterd");
int size = util.inputInteger();
Integer[] arry = new Integer[size];
for(int i = 0; i<size; i++) {
System.out.println("Enter the no");
arry[i] = util.inputInteger();  
  } 
for (int k = 1; k < size; k++) {
 
     for (int j = 0; j<size-k; j++) {
    
	 if(arry[j]>arry[j+1])
     	 {
     	int temp = arry[j];
    	 arry[j] = arry[j+1];
     	arry[j+1] = temp;
       }

     } 

   }

 util.printArray(arry);
  }
}
