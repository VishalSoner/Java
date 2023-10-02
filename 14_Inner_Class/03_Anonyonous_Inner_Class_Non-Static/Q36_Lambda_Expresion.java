interface Inter1
{
	int cude(int x);
}

class Q36_Lambda_Expresion
{
	public static void main(String args[])
	{
		Inter1 in1 = (int x)->
		{
			return x*x*x;
		};
		
		System.out.println("Cude : " + in1.cude(10) );
	}
}

/*
Cude : 1000

-----------------------------------------------------------------------------------------------
*/







