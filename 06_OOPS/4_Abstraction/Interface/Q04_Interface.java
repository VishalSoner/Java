interface Inter1
{
	void show();
}

class A implements Inter1
{
	void show()
	{
		System.out.println("Class A");
	}
}

class Q04_Interface
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: show() in A cannot implement show() in Inter1
    void show()
         ^
--------------------------------------------------------------------------------------------- 
*/




