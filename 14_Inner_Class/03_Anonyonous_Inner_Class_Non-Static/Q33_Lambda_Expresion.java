/*
	1. Function Interface : is a Interface that contains only one abstract method.
	2. Lambda Expresion   : Function Interface me woek karta he,  ye version 1.8 me add hua he.
	
*/

interface Inter1
{
	void show();
}

class Q33_Lambda_Expresion
{
	public static void main(String args[])
	{
		Inter1 in1 = ()->{		System.out.println("Lambda Expresion - 1");		};
		in1.show();
		
		//Also do like this :
		Inter1 in2 = ()->	System.out.println("Lambda Expresion - 2");		;
		in2.show();
	}
}

/*

Lambda Expresion - 1
Lambda Expresion - 2

-----------------------------------------------------------------------------------------------
*/







