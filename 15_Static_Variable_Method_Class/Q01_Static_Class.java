/*

Static Variable   : Static method can access only static variable.
Instance Variable : Static and non-static(both) method can access Instance variable.


Static Method   : Static method can access only static Method.
Instance Method : Static and non-static(both) method can access Instance Method.


We can't Create Static Outer Class.

*/

class A
{
	int x = 100;
	void show()
	{
		System.out.println("X : " + x);
	}
}

class Q01_Static_Class
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		
	}
}

/* 

Output : X : 100 


*/