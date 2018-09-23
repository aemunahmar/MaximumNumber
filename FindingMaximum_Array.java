//Developed by Aemun Ahmar 1047508
//CSCI 125 M04 Fall 2016
//Professor Wenjia Li
//Classwork: Finding Maximum of the Array
//Date Created: November 15, 2016

import javax.swing.JOptionPane;

public class FindingMaximum_Array 
{
	public static void main(String[] args)
	{
		int[]  numbers = new int[6];
		
		String userInput;
		
		for(int i = 0; i < 6; i++)
		{
			userInput = JOptionPane.showInputDialog("Enter the " + (i + 1) + "th number please.");
			numbers[i] = Integer.parseInt(userInput);
		}
		
		//Finding the maximum within the array
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++)
		{
			if(max < numbers[i])
			{
				max = numbers[i];
			}
		}
		System.out.print(max);
	}
}
