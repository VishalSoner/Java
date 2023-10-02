interface Inter1
{
	void show();
}

class A implements Inter1
{
	void show()
	{
		System.out.println("Vishal Soner");
	}
}

class Q22_Anonyonous_Inner_Class_implements
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
  attempting to assign weaker access privileges; was public
-----------------------------------------------------------------------------------------------
*/




