//*************************************************************************************************************************************//
// Josh Joseph
// CS3810 Data Structures and Algorithms
// Assignment 2 (Stacks and Queues)
// 10-09-2015
// Professor Hai

// Class: MyDequeApp

// This program prompts user to input length of deque (any positive interger). It then prompts user to enter between 0 and 7 inclusive
// with each ket performing different function. The choices for user are:
//			                                1: Insert to front
//											2: Insert to rear
//											3: Remove from front
//											4: Remove from rear
//											5: Display front
//											6: Diplay rear
//											7: Display Deque
//											0: Quit
// Based on the user input, the program calls methods of MyDeque class to perform corresponding operations.
// A do while loop is used to allow user stop when the user enters 0 (zero)
// Methods getALength (any positive integer) and getAChoice (any intergers between 0 and 7 inclusive) validates the user input.
//*************************************************************************************************************************************//


import java.util.Scanner;

public class MyDequeApp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("!!!Welcome to Deque Application!!!"); // Header

		int length = getALength("\nEnter the Deque length: "); // variable to hold length of deque and calls getALength method to validate input

		MyDeque theDeque = new MyDeque(length);               // creates an instance of MyDeque class

		// Header
		System.out.println("\nYour Selections are:");
		System.out.println("Enter 1 to Insert to front");
		System.out.println("Enter 2 to Insert to rear");
		System.out.println("Enter 3 to Remove from front");
		System.out.println("Enter 4 to Remove from rear");
		System.out.println("Enter 5 to Display front");
		System.out.println("Enter 6 to Diplay rear");
		System.out.println("Enter 7 to Display Deque");
		System.out.println("Enter 0 to Quit");

		int choice;  // variable to hold user's selection

		do {
			choice = getAChoice("\nEnter Choice: ");    // calls getAChoice method to validate input

			if (choice == 1)
			{
				if (!theDeque.isFull())
				{
					System.out.print("\nEnter The ID: ");
					String input3 = scan.nextLine();
					System.out.print("Enter The Data: ");
					String input4 = scan.nextLine();

					DataRecord elm = new DataRecord();
					elm.setId(input3);
					elm.setData(input4);

					theDeque.insertFront(elm);               // calls insertFront method of MyDeque class
				}
				else System.out.println("Queue is Full");	 // prints a message if deque is full
			}

			else
				if (choice == 2)
				{
					if (!theDeque.isFull())
					{
						System.out.print("\nEnter The ID: ");
						String input3 = scan.nextLine();
						System.out.print("Enter The Data: ");
						String input4 = scan.nextLine();

						DataRecord elm = new DataRecord();
						elm.setId(input3);
						elm.setData(input4);

						theDeque.insertRear(elm);             // calls insertRear method of MyDeque class
					}
					else System.out.println("Queue is Full"); // prints a message if deque is full
				}

			else
				if (choice == 3)
				{
					if (!theDeque.isEmpty())
					{
						System.out.println(theDeque.removeFront() + " is removed"); // calls removeFront method of MyDeque class
					}
					else System.out.println("Queue is Empty");                      // prints a message if deque is empty
				}

			else
				if (choice == 4)
				{
					if (!theDeque.isEmpty())
					{
						System.out.println(theDeque.removeRear()+ " is removed"); // calls removeRear method of MyDeque class
					}
					else System.out.println("Queue is Empty");					  // prints a message if deque is empty
				}

			else
				if (choice == 5)
				{
					if (!theDeque.isEmpty())
					{
						System.out.println(theDeque.peekFront());  // calls peekFront method of MyDeque class
					}
					else System.out.println("Queue is Empty");     // prints a message if deque is empty
				}

			else
				if (choice == 6)
				{
					if (!theDeque.isEmpty())
					{
						System.out.println(theDeque.peekRear());  // calls peekRear method of MyDeque class
					}
					else System.out.println("Queue is Empty");   // prints a message if deque is empty
				}

			else
				if (choice == 7)
				{
				    if (!theDeque.isEmpty())
					{
						System.out.println("Elements: \n" + theDeque.toString());   // calls toString method to print elements of deque from front to rear
					}
					else System.out.println("Queue is Empty");     // prints a message if deque is empty
				}

		} while (choice != 0);    // end loop when user enter 0

		System.out.println("Good Bye!!!");
	}

	/*
		This method returns the input data (length of deque) of user.
		If the user enters an invalid input, it prints an error message
		and re-promts the user for a valid input.
	*/
	public static int getALength(String prompt)
	{
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.print(prompt);

		do
		{
			try
			{
			input = Integer.parseInt(scan.nextLine());

				// prints an error message if user enters negative numbers and re-prompts
				while (input < 0)
				{
					System.out.print("Length must be positive\n" + prompt);

					input = Integer.parseInt(scan.nextLine());
				}
				return input;
			}
			catch (NumberFormatException e)
			{
				System.out.print("Invalid Input\n" + prompt); // prints an error message if input is a string by catching NumberFormatException and re-prompts
			}
		} while (true);
	}

	/*
		This method returns the input data (selection of operations) of user.
		If the user enters an invalid input, it prints an error message
		and re-promts the user for a valid input.
	*/
	public static int getAChoice(String prompt)
	{
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.print(prompt);

		do
		{
			try
			{
			input = Integer.parseInt(scan.nextLine());

			// prints an error message if input is less than 0 or greater than 7 and re-prompts
				while (input < 0 || input > 7)
				{
					System.out.print("Selection must be between 0 and 7\n" + prompt);
					input = Integer.parseInt(scan.nextLine());
				}
				return input;
			}
			catch (NumberFormatException e)
			{
				System.out.print("Invalid Input\n" + prompt); // prints an error message if input is a string by catching NumberFormatException and re-prompts
			}
		} while (true);
	}
}