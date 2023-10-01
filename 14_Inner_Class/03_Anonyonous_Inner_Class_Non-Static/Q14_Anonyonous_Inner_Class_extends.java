abstract class A 
{
	abstract void show();
}

class Q14_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A()
		{
			void show()
			{
				System.out.println("Show Method");
			}
		}.show();
	}
}

/* 

error: incompatible types: void cannot be converted to A
    }.show();
		  ^

.show() method void return kar rahi he or void ko object me types cast nai kar sakte
OR
void ka A a(Object) me store nai kar sakte.

-----------------------------------------------------------------------------------------------
*/




