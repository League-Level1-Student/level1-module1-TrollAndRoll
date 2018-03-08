
public class Tacos 
{
	private String meat;
	private String sauce;
	
	void getMeat(String meat)
	{
		this.meat  = meat;
	}
	
	void getSauce(String sauce)
	{
		this.sauce = sauce;
	}
}

class Person
{
	private String name;
	private String superpower;
	
	void setName(String name)
	{
		this.name  = name;
	}
	
	void setSuperpower(String superpower)
	{
		this.superpower = superpower;
	}
	
	Person(String name)
	{
		setName(name);
	}
	
	public String toString()
	{
		return (name + " has mad " + superpower + " skills!");
	}
	
}



/*
Done: Create a class called Taco, then add 2 private String member variables for the meat and sauce.
Done: Create methods getMeat() and getSauce() that return the member variables.
Done: Create methods setMeat(String meat) amd setSauce(String sauce) that set the values of the members variables to the values passed in the method parameters.
Part 2
Done. Create a Person class, with 2 member variables - name and superpower.
Done. Using the pattern in Part 1, add getter and setter methods for the member variables of the Person class.

6. Now, make a Runner class that creates 3 different people, sets their superpowers, and prints the value returned by the default toString() method.

7. Override the default toString() method by implementing a toString() method on the Person class that returns "<name> has mad <superpower> skills". 
*/