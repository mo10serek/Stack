/*
* Created by: Michael balcerzak
* Created on: 29-Sep-2016
* Created for: ICS3U
* Daily Assignment – Unit#2-01
* This program makes the user to put something in the stack
*/

import java.util.Scanner;

public class GiveIn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("enter anything to put in the stack!");
		String have = input.toString();
		
		//stack
		MrCoxallStack aSingleStack = new MrCoxallStack();
		aSingleStack.push(have);
		
	}

}
