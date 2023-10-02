interface Inter1
{
	int multi(int x, int y);
}

class Q40_Lambda_Expresion
{
	public static void main(String args[])
	{
		Inter1 in1 = (int x, int y)->	x*y;	
		System.out.println("Cude : " + in1.multi(10, 5));
		
		Inter1 in2 = (x, y)->	x*y;			//Same Work
		System.out.println("Cude : " + in2.multi(10, 10));
	}
}


/*

Cude : 50
Cude : 100



--------------------------------------------------------
*/