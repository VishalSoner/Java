class A
{
	int x, y;
	A(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}	
}

class Q04_Constructor
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		
	}
}

/* 
Output :- 

error: constructor A in class A cannot be applied to given types;
A a = new A();
--------------------------------------------------------------------------------------------- 
*/




