interface Inter1
{
	int cude(int x);
}

class Q37_Lambda_Expresion
{
	public static void main(String args[])
	{
		Inter1 in1 = (int x)->{			return x*x*x;		};
		System.out.println("Cude : " + in1.cude(2) );
		
		Inter1 in2 = (x)->{			return x*x*x;		};
		System.out.println("Cude : " + in2.cude(3) );
		
		Inter1 in3 = x->{			return x*x*x;		};
		System.out.println("Cude : " + in3.cude(4) );
		
		
	}
}

/*
Cude : 8
Cude : 27
Cude : 64

-----------------------------------------------------------------------------------------------
*/







