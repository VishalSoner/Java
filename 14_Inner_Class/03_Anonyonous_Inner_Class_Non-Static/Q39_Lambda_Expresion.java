interface Inter1
{
	int multi(int x, int y);
}

class Q39_Lambda_Expresion
{
	public static void main(String args[])
	{
		Inter1 in = (int x, int y)->	return x*y;	
		Inter1 in = (x, y)->	return x*y;			//Same Error
		
		System.out.println("Cude : " + in.multi(10, 20));
	}
}


/*

 error: illegal start of expression
    Inter1 in = (int x, int y)->    return x*y;
                            ^


--------------------------------------------------------
*/