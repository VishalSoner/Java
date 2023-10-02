/*
	Interface ka referance variable sub-class ke Object ko Hold kar sakta he.
*/

interface Inter1
{
	void show();
}

class A implements Inter1
{
	public void show()
	{
		System.out.println("Show Method");
	}
}

class Q21_Interface_Class_Referance_Variable
{
	public static void main(String args[])
	{
		Inter1 in = new A();
		in.show();
	}
}

/* 

Show Method

--------------------------------------------------------------------------------------------- 
*/




