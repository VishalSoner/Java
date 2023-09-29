class A
{
	int x = 10;
	void show()
	{
		System.out.println("Show Method");
	}
	
	void show1()
	{
		System.out.println("Show1 X : " + x);
	}	
}
class Q01_OOPS
{
	public static void main(String args[])
	{
		A a = new A();
		
		System.out.println("X : " + a.x);
		a.show();
		a.show1();
	}
}

/* 
Output :- 

X : 10
Show Method
Show1 X : 10

--------------------------------------------------------------------------------------------- 
*/




