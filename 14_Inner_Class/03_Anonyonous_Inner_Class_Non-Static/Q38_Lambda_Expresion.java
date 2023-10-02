interface Inter1
{
	int multi(int x, int y);
}

class Q38_Lambda_Expresion
{
	public static void main(String args[])
	{
		// 01
		Inter1 in1 = (int x, int y)->{			return x*y;			};
		System.out.println("Multi : " + in1.multi(10, 5) );
		
		// 02
		Inter1 in2 = (x, y)->{					    return x*y;			};
		System.out.println("Multi : " + in2.multi(10, 25) );
		
		//03
		// Inter1 in3 = x,y->{					    return x*y;			};
		// System.out.println("Multi : " + in3.multi(10, 50) );
		
		
	}
}

/*
// 01
Multi : 50

// 02
Multi : 250

// 03
error: ';' expected
	Inter1 in3 = x,y->{                                         return x*y;                 };
                   ^



-----------------------------------------------------------------------------------------------
*/







