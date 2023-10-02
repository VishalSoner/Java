interface Inter1
{
	int x = 10;
}

class A implements Inter1
{
	int x = 20;
	public void show()
	{
		int x = 30;
		System.out.println("X  :  " + x);
		System.out.println("X  :  " + this.x);
		System.out.println("X  :  " + super.x);
	}
}

class Q09_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: cannot find symbol
    System.out.println("X  :  " + super.x);
                                       ^

--------------------------------------------------------------------------------------------- 
*/




