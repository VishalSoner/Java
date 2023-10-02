interface Inter1
{
	void show();
}

class Q34_Lambda_Expresion
{
	public static void main(String args[])
	{
		Inter1 in1 = ()->{		
							System.out.println("Lambda Expresion - 1");		
							System.out.println("Lambda Expresion - 2");
						};
		in1.show();
	}
}

/*

Lambda Expresion - 1
Lambda Expresion - 2

-----------------------------------------------------------------------------------------------
*/







