/*
	To Access Interface we need to implement the interface, Using implements keywork.
*/

interface Inter1
{
	void show();
}

class A implements Inter1
{}

class Q03_Interface
{
	public static void main(String args[])
	{
		System.out.println("Work");
	}
}

/* 

error: A is not abstract and does not override abstract method show() in Inter1
class A implements Inter1
^
--------------------------------------------------------------------------------------------- 
*/




