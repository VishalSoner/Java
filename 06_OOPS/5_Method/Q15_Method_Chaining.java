class A
{
	int x, y;
	A get(int x, int y)
	{
		this.x = x;
		this.y = y;
		return this;
	}
	
	A show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println();
		return this;
	}
	
}

class Q15_Method_Chaining
{
	public static void main(String args[])
	{
		new A().get(10, 20).show().show().show();;
	}
}
/* 
X : 10
Y : 20

X : 10
Y : 20

X : 10
Y : 20
--------------------------------------------------------------------------------------------- 
*/




