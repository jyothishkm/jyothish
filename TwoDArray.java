package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class TwoDArray
{
@SuppressWarnings("unchecked") 
 public static void main(String[] args)
 {
  int row,column,choice;
		
  Utility util = new Utility();
  System.out.println("Please choose which type of array you want to create :");
  System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
  choice = util.inputInteger();

//Using switch case for perticular choice
		switch(choice){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					row = util.inputInteger();
				System.out.println("Please Enter no. Columns :");
					column = util.inputInteger();
					Integer array[][] = new Integer[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = util.inputInteger();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				util.printArray(array,row,column);
				break;
			}

			case 2:{
				System.out.println("Please Enter the no. of Rows :");
                                 row = util.inputInteger();
				System.out.println("Please Enter the no. of Rows :");
				column = util.inputInteger();
				Double array[][] = new Double[row][column];
                                for(int i = 0; i<row; i++)
                                {
                                 for(int j = 0; j<column; j++) 
				  {
				   System.out.print("Please enter Element at position ("+i+","+j+"): ");
					array[i][j] =  util.inputDouble();
					}
                                }
                                ///Array Printing function from Utility class
				System.out.println("Array is");
				util.printArray(array,row,column);
				break;
			}

                                case 3:{
				System.out.println("Please Enter no. of Rows :");
					row = util.inputInteger();
				System.out.println("Please Enter no. Columns :");
					column = util.inputInteger();
					Boolean array[][] = new Boolean[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = util.inputBoolean();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				util.printArray(array,row,column);
				break;
			}
                     }
    }
 }
