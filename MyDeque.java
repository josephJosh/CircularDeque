//*************************************************************************************************************************************//
// Josh Joseph
// CS3810 Data Structures and Algorithms
// Assignment 2 (Stacks and Queues)
// 10-09-2015
// Professor Hai

// Class: MyDeque

// ** DESCRIPTION **
// This program encapsulates the concept of Deque. It has a constructor which takes in the size.
// This class contains methods to insert to front, insert to rear, remove from front, remove from rear, retrieves front element,
// and rear element, check if the deque is full or empty. It also provides a toString() method which overwrites and
// returns all the elements of deque from front to rear.
//*************************************************************************************************************************************//

public class MyDeque
{
	// instance variables
	private int maxSize;
	private DataRecord[] dequeArray;
	private int front;
	private int rear;
	private int nItems;

	// constructor:
	// allows client class to set the length of deque (array size)
	// Other variables are set to default values
	public MyDeque(int s)
	{
		maxSize = s;
		dequeArray = new DataRecord[maxSize];
		nItems = 0;
		front = 0;
		rear = -1;
	}

	// inserts a DataRecord element to the front of deque
	public void insertFront(DataRecord j)
	{
		if (front == 0)                    // deal with wraparound
			front = maxSize;
		dequeArray[--front] = j;           // decrement front and insert
		nItems++;                          // increment number of itmes
	}

	// inserts a DataRecord element to the rear of deque
	public void insertRear(DataRecord i)
	{
		if (rear == maxSize-1)             // deal with wraparound
			rear = -1;
		dequeArray[++rear] = i;            // increment rear and insert
		nItems++;                          // increment number of itmes
	}

	// removes a DataRecord element from the front of deque
	public DataRecord removeFront()
	{
		DataRecord temp = dequeArray[front++];  // increment front and remove

		if (front == maxSize)                   // deal with wraparound
			front = 0;
		nItems--;								// decrement number of itmes
		return temp;
	}

	// removes a DataRecord element from the rear of deque
	public DataRecord removeRear()
	{
		if (rear == -1)							// deal with wraparound
			rear = maxSize - 1;

		DataRecord temp = dequeArray[rear--];   // decrement rear and remove
		nItems--;								// decrement number of itmes
		return temp;
	}

	// peekFront: returns the front element of the deque
	public DataRecord peekFront()
	{
		return dequeArray[front];   // returns the front element of the deque
	}

	// peekRear: returns the rear element of the deque
	public DataRecord peekRear()
	{
		if (rear == -1)             // deal with wraparound
			rear = maxSize-1;
		return dequeArray[rear];    // returns the front element of the deque
	}

	// isEmpty: returns true if deque is empty (number of items equals 0)
	public boolean isEmpty()
	{
		return (nItems == 0);
	}

	// isFull: returns true if deque is full (number of items equals max size of array)
	public boolean isFull()
	{
		return (nItems == maxSize);
	}

	// toString: returns a string represenation of deque from front to rear element
	public String toString( )
	{
		String elements = "";
		for ( int i = front; i < front + nItems; i++ )
			elements += dequeArray[i % maxSize].toString( ) + "\n";
		return elements;
	}
}