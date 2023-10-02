/*
we can't modify the data of interface, 
Because interface variable have with 3 keywords 
1. static,  2. final,   3. public.

*/

interface Inter1
{
	int x = 10;
}

class A implements Inter1
{
	public void show()
	{
		x = 20;
		System.out.println("X  :  " + x);
	}
}

class Q07_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: cannot assign a value to final variable x
                x = 20;
                ^

--------------------------------------------------------------------------------------------- 
*/




