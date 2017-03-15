//**************************************************************************************************//
// Josh Joseph
// CS3810 Data Structures and Algorithms
// Assignment 2 (Stacks and Queues)
// 10-09-2015
// Professor Hai

// Class: MyStack

// ** DESCRIPTION **
// This program encapsulates the concept of Stack. It has a constructor which takes in the size.
// This class contains methods to push, pop, peek, check if the deque is full or empty.
// It also provides a toString() method which overwrites and returns all the elements of stack.
//**************************************************************************************************//

public class MyStack
{
    // instance variables
    private int maxSize;
    private MyDeque myStackArray;

    // constructor:
	// allows client class to set the length of stack (array size)
    public MyStack(int size)
    {
        maxSize = size;
        myStackArray = new MyDeque(maxSize);
    }

	// inserts a DataRecord element to the top of stack
    public void push(DataRecord j)
    {
        myStackArray.insertRear(j);
    }

	// removes a DataRecord element from the top of stack
    public DataRecord pop()
    {
        return myStackArray.removeRear();
    }

    // peekFront: returns the top element of the stack
    public DataRecord peek()
    {
	    return myStackArray.peekRear();
    }

	// isEmpty: returns true if stack is empty (top equals -1)
	public boolean isEmpty()
	{
		return myStackArray.isEmpty();
	}

    // isFull: returns true if stack is full (top equals last index of the array)
    public boolean isFull()
    {
		return myStackArray.isFull();
	}

	// toString: returns a string represenation of myStackArray
	public String toString()
	{
		return myStackArray.toString();
	}
}