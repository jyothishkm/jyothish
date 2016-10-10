package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
public class PowerOfTwo{
	public static void main(String[] args){
		Utility util = new Utility();
		int power = util.inputInteger();
		int result = 1;

		//calculating the power and printing
		if(power>=0 & power<31){
			for(int i=0;i<=power;i++){
				System.out.println("2^"+i+"="+result);
				result = result*2;
			}
		util.leapYear(result/2);
		}

		//precondition for int type data
		else{
			System.out.println("Number Should be less than 31");
		}
	}
}
