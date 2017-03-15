//*************************************************************************************************************************************//
// Josh Joseph
// CS3810 Data Structures and Algorithms
// Assignment 2 (Stacks and Queues)
// 10-09-2015
// Professor Hai

// Class: DataRecord

// ** DESCRIPTION **
// This program encapsulates the concept of Data Record. It has two attributes: id (String), and data (String).
// This class stores id and data of Data Record. It provides accessor and mutator methods of both instance variables.
// It also provides a toString() method which overwrites and returns DataRecord object representation
//*************************************************************************************************************************************//

public class DataRecord
{
	//instance variable
	private String id;
	private String data;

	// Accessor method:
	// returns current value of id
	public String getId()
	{
		return id;
	}

	// Accessor method:
	// returns current value of data
	public String getData()
	{
		return data;
	}

	// Mutator method:
	// allows client to set id
	public void setId(String newId)
	{
		id = newId;
	}

	// Mutator method:
	// allows client to set data
	public void setData(String newData)
	{
		data = newData;
	}

	// toString: return a string of instance variable values
	public String toString()
	{
		return "ID: " + id +
			   ", Data: " + data;
	}
}
