package com.bridgelabz.util;
import java.io.*;


public class Utility<T>{
	BufferedReader br,rf = null;

	//Utility constructor for creating object for BufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

	//input integer
	public int inputInteger()
        {
       br = new BufferedReader(new InputStreamReader(System.in));
	try{
	int number = Integer.parseInt(br.readLine());
	return number;
	}catch(Exception e) {
       System.out.println(e);
        }
        return 0;
        }
 	
	//random function
       public void ranFun(int num)
	{
	double heads = 0,tails = 0,random;
	for(int i = 0; i<num; i++)
        {
         random = Math.random();
         if(random<.5)
        {
         tails++;
        }else
	heads++;
        }
	System.out.println("Percentage of heads ="+(heads/num)*100+"%");
        System.out.println("Percentage of tails ="+(tails/num)*100+"%");
	}
	
	//leap year
	public void leapYear(int year)
	{
	if(year%4 == 0 && year%100 != 0 || year%400 == 0)
	{
	System.out.println(year+" is a leap year");
  	 }else
	System.out.println(year+" is not a leap year");
   	}

        //input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

       //Array printing(two dimentional) Generic type
	public void printArray(T[][] inputArray,int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

       //Array Printing(one dimentional) Generic type
	public <T> void printArray(T[] inputArray){
		for(T i:inputArray)
			System.out.print(i+" ");

		System.out.println();
	}

	//bubble sort for Integer
	public Integer[] bubbleSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	//bubble sort for String
	public String[] bubbleSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j].compareTo(array[j+1])>0){
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
       
    //insertion sort for integer
	public Integer[] insertionSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1]>array[j]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	//insertion sort for String
	public String[] insertionSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1].compareTo(array[j])>0){
					String temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

//reading file
	public String readFile(File file){
		
		try{
			rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

	//Writing into file int Data
	public void writeFile(File file,int data){
		try{
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str+data+" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//writing into file String data
	public void writeFile(File file,String data){
		try{
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string+" "+data);
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	//Clear the Data inside the file
	public void clearFile(File f){
		try{
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}






