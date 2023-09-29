class A
{
	int x, y;
	void set(int x, int y)
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

class Q02_Constructor
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.set(10, 20);
		a.show();
		
	}
}

/* 
Output :- 
10
20

--------------------------------------------------------------------------------------------- 
*/




