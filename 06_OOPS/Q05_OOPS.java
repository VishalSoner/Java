class A
{
	int x, y;
	
	void show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		x = 1;
		y = 2;
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}	
}

class Q05_OOPS
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		a.show();
		
	}
}

/* 
Output :- 

X : 0
Y : 0
X : 1
Y : 2

X : 1
Y : 2
X : 1
Y : 2

--------------------------------------------------------------------------------------------- 
*/




