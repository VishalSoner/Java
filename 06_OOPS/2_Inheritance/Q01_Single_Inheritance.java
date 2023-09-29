class A
{
	int x, y;
	void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void sum()
	{
		System.out.println("Sum : " + (x+y) );
	}
}
class B extends A 
{
	void sub()
	{
		System.out.println("Sub : " + (x-y) );
	}
}

class Q01_Single_Inheritance
{
	public static void main(String args[])
	{
		B b = new B();
		
		b.set(10, 20);
		b.sum();
		b.sub();
	}	
}