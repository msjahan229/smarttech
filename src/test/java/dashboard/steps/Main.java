package dashboard.steps;

import java.util.*;

public class Main {
	static void reverse(String myArray[])
	{
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reversed Array:" + Arrays.asList(myArray));
	}
	public static void main(String[] args) {
		String [] myArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
		System.out.println("Reversed Array:" + Arrays.asList(myArray));
		
		reverse(myArray);
		System.out.println();
		
		@SuppressWarnings("unused")
		String abc = new String();
		
		
		
	}
}
	/*	    public static void main(String[] args) {
		    Integer[] intArray = {10,20,30,40,50,60,70,80,90};
		    Integer[] intArray = {One, Two, Three, Four, Five};
		    
		    System.out.println("Original Array");
		    for(int a=0; a<intArray.length;a++)
		     
		  //print array starting from first element
		    System.out.println("Original Array:");
		    for(int i=0;i<intArray.length;i++)
		         System.out.print(intArray[i] + "  ");
		     
		    System.out.println();
		     
		    //print array starting from last element
		    System.out.println("Original Array printed in reverse order:");
		         for(int i=intArray.length-1;i>=0;i--)
		         System.out.print(intArray[i] + "  "); */