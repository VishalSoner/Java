class A
{
	int x, y;
	void set(int a, int b)
	{
		x = a;
		y = b;
	}
	
	void show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}	
}

class Q02_OOPS
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		a.set(10, 20);
		a.show();
		
	}
}

/* 
Output :- 

X : 0
Y : 0
X : 10
Y : 20

--------------------------------------------------------------------------------------------- 
*/




