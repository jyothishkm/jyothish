package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.UnorderedNode;
import java.io.File;

public class UnorderedList{
@SuppressWarnings("unchecked") 
	public static void main(String[] args){
		Utility u = new Utility();
		UnorderedNode node = new UnorderedNode();
		File file = new File("UnOrderedStrings.txt");
		String string = u.readFile(file);
		System.out.println("File Contents are: "+string);
		//string = string.trim();
		String[] str = string.split(" ");
		
		for(int i=0;i<str.length;i++){
			node.addNode(str[i]);
		}
		
		System.out.print("Please Enter String You want to search: ");
		String searchStr = u.inputString();
		node.search(searchStr);
	}
}
