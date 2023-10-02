interface Inter1
{
	void show();
}

class Q21_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1(){};
	}
}

/* 
error: <anonymous Q21_Anonyonous_Inner_Class_implements$1> is not abstract and does not override abstract method show() in Inter1
                Inter1 in1 = new Inter1(){};
                                         ^
-----------------------------------------------------------------------------------------------
*/




