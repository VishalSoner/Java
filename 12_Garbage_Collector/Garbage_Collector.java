Garbage Collecter :
	Unreferenced and Unrechable Object is Called Garbage Object.

There are 5 Ways to pass Object to Garbage Collecter.
	1. By Nullifying the reference Variable.
	2. Re-assiging the reference Variable.
	3. Object Created inside teh Method. (Local Object)
	4. Anonymous Object.
	5. Island of isolation.
	
--------------------------------------------------------------------

Q1. Unreferenced Object ko GC ke pass Pahuchana hi kyu?
Ans Usha Object ki use ki hua memory ko free karne ke liye.



--------------------------------------------------------------------

class A
{
	void show()
	{
		System.out.println("Vishal Soner");
	}
}

class Q01_Nullifying_reference_Variable
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A();
		a1.show();
		a2.show();
		
		a1 = null;
		
		a1.show();
		a2.show();
	}
}
/*
Vishal Soner
Vishal Soner
Exception in thread "main" java.lang.NullPointerException

--------------------------------------------------------
*/



class A
{
	int id;
	A(int id)
	{
		this.id = id;
	}
	void show()
	{
		System.out.println("Id : " + id);
	}
}

class Q02_Reassigning_reference_Variable
{
	public static void main(String args[])
	{
		A a1 = new A(100);
		A a2 = new A(200);
		a1.show();
		a2.show();
		
		a1 = a2;
		
		a1.show();
		a2.show();
		
		System.out.println( a1.hashCode() );
		System.out.println( a2.hashCode() );

	}
}
/*
Id : 100
Id : 200

Id : 200
Id : 200

366712642
366712642
--------------------------------------------------------
*/


class A
{
	void show()
	{
		System.out.println( "Class A" );
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
	}
}

class Q03_Object_Inside_Mehtod
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.show();
	}
}
/*
Class A 

Local Method se bahr use nai ho sakte he or jese method complete execute ho jayegi 
tab Al Object GC ke pass chali jayegi.
--------------------------------------------------------
*/


class A
{
	A()
	{
		System.out.println("Anonymous Object");
	}
	void show()
	{
		System.out.println("Show Method");
	}
}

class Q04_Anonymous_Object
{
	public static void main(String args[])
	{
		new A();
	}
}
/*
Anonymous Object
Show Method

Jise hi Object Create wali line exectue hogi, Wese hi Object GC ke pass chala jayega.
Kyu ki Yaha Dereferenced Object he , Jo ek bar use hokar GC ke pass chala jayega.
--------------------------------------------------------
*/





class A
{
	A add;
}

class Q05_Island_Of_Isolation
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A();
		
		a1.add = a2;
		
		a1 = null;
		a2 = null;
	}
}
/*


Yaha Object ke pass reference he, But Active reference nai he.
--------------------------------------------------------
*/






==============================================================================


Singleton Class : It is a class That can have only one Object At a time.

Condition :
1. Create a Private Constructor.
2. Create a Static Method that return a Class Object.
   
	A Method that return a Object that is called Factory Function.

Advantages / Requiremen :
1. Create a Given permission to the user to create Object.
2. Only single Object will be created.
3. it is used to give permission of creating only single Object.

--------------------------------------------------------------------


class A
{
	private A()
	{
		System.out.println("Constructor");
	}
}

class Q06_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = new A();
	}
}
/*
error: A() has private access in A
                A a1 = new A();
                       ^

--------------------------------------------------------
*/


class A
{
	private A()
	{
		System.out.println("Constructor");
	}
	
	static A getObject()
	{
		return new A();
	}
	
	void show()
	{
		System.out.println("Show Method");
	}
}

class Q07_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = A.getObject();
		a1.show();
	}
}
/*
Constructor
Show Method

--------------------------------------------------------
*/


class A
{
	private A()
	{}
	
	static A getObject()
	{
		return new A();
	}
}

class Q08_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = A.getObject();
		A a2 = A.getObject();

		System.out.println( a1.hashCode() );
		System.out.println( a2.hashCode() );
	}
}
/*
366712642
1829164700


They Both are Different.
--------------------------------------------------------
*/



class A
{
	static A a;
	int id;
	String name;
	private A()
	{}
	
	static A getObject()
	{
		if(a == null)
			a = new A();
			
		return a;
	}
	
	void get(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void show()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

class Q09_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();

		System.out.println( a1.hashCode() );
		System.out.println( a2.hashCode() );
		System.out.println( a3.hashCode() );

		
		a1.get(10, "Vishal Soner");
		a2.show();
		a3.show();
		
	}
}
/*
They are Same.
366712642
366712642
366712642

Id : 10
Name : Vishal Soner
Id : 10
Name : Vishal Soner


--------------------------------------------------------
*/










==============================================================================










--------------------------------------------------------------------

1. Unreferenced Object ko 5 Type se GC ko Deta he m But Object ko तुरन्त Destroy nai karta he.
2. Jab JVM GC ko call karta he , tab GC ye Object ko Destroy karta he, But JVM GC ko kab call karega eshaki koi guarantee nai he.
3. Lekin JVM Ko request kar sakte he ki Ap GC ko Call kare.
4. But JVM hamari request ko Accept karega ya nai eshki koi guarantee nai he.
5. But 90% Cases me JVM Hamari request ko Accept kar leta he.

--------------------------------------------------------------------

Point : JVM ko request karen ke liye Kitne Type he Ki baha GC ko call kare.
		Only 2 Ways he.
			1. System.gc();
			2. Runtime.getRuntime().gc();

--------------------------------------------------------------------

Q1. Kya ham Forcefully JVM se request ko accept karwa sakte he.
Ans No.

--------------------------------------------------------------------




class A
{
	int x, y;
	void show()
	{
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q10_System_gc
{
	public static void main(String args[])
	{
		A a = new A();
		a.x = 101; 		a.y = 201;
		
		a = null;
		System.gc();
		
		System.out.println("Main Method");
	}
}
/*

1. At a Time Request Accept By JVM.
	Finalize Method
	Main Method
	  
2. After Printign Main Method Accept By JVM.
	Main Method
	Finalize Method
	  
3. Request Not Accept By JVM.
	Main Method
--------------------------------------------------------
*/


/*  Yaha Koi unreference Variable nai he. */

class A
{
	int x, y;
	void show()
	{
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q11_System_gc
{
	public static void main(String args[])
	{
		A a = new A();
		a.x = 101; 		a.y = 201;
		
		System.gc();
		System.out.println("Main Method");
	}
}
/*

Main Method
--------------------------------------------------------
*/


class A
{
	int x, y;
	void show()
	{
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q12_System_gc
{
	public static void main(String args[])
	{
		String s1 = new String("Ram");
		
		s1 = null;
		System.gc();
		System.out.println("Main Method");
	}
}
/*
Main Method



Yaha String Class ke corresponding finalize() method call hogi OR String ke pass koi v finalize method nai he 
eshki class ki finalize method call hogi or Object class ki finalize method Empty he.
--------------------------------------------------------
*/


class A
{
	int x, y;
	public void finalize()
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q13_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		A a2 = new A();
		a2.x = 101;		a2.y = 201;
	
		a1 = null;
		System.gc();
		
		a2 = null;
		System.gc();
		System.out.println("Main Method");
	}
}
/*
// 1   When Both are Accept.
Finalize Method : (10,20)
Finalize Method : (101,201)
Main Method

// 2	When Both are Accept.
Main Method
Finalize Method : (10,20)
Finalize Method : (101,201)

// 3	When Both are Accept.
Finalize Method : (10,20)
Main Method
Finalize Method : (101,201)


// 4	When a1 are Accept.
Finalize Method : (10,20)
Main Method

// 5	When a2 are Accept.
Finalize Method : (101,201)
Main Method

// 6	When Both are Rejected.
Main Method


Yaha String Class ke corresponding finalize() method call hogi OR String ke pass koi v finalize method nai he 
eshki class ki finalize method call hogi or Object class ki finalize method Empty he.
--------------------------------------------------------
*/




/* Ek Object ke Corresponding JVM/GC ek bar hi call hoti he */
class A
{
	int x, y;
	public void finalize()
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q14_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
	
		a1 = null;
		System.gc();
		System.gc();

		System.out.println("Main Method");
	}
}
/*
1. At a Time Request Accept By JVM.
	Finalize Method
	Main Method
	  
2. After Printign Main Method Accept By JVM.
	Main Method
	Finalize Method
	  
3. Request Not Accept By JVM.
	Main Method

--------------------------------------------------------
*/


class A
{
	int x, y;
	public void finalize()
	{
		System.out.println("Finalize Method");
		System.out.println(10 / 0);
	}
}

class Q15_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
	
		a1 = null;
		System.gc();

		System.out.println("Main Method");
	}
}
/*
1. At a Time Request Accept By JVM.
	Finalize Method
	Main Method
	  
2. After Printign Main Method Accept By JVM.
	Main Method
	Finalize Method
	  
3. Request Not Accept By JVM.
	Main Method


Jab finalize method me Exception generate hoti he, ot JVM ushe handle kar leta he or Yaha tab hota he 
Jab JVM finalize() method ko call karta he.

# Jab GC call hota he to baha head memory me store unreference Object ko destroy karta he.

--------------------------------------------------------
*/


/*

Q01. Kya ham finalize() method ko manually call kar sakte he?
Ans. Yes, we can call finalize memory manually, but it works as normal method.

*/
class A
{
	int x, y;
	public void finalize() //it work like Normal method
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q16_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		a1.finalize();
		
		System.out.println("Main Method");
	}
}
/*
Main Method


--------------------------------------------------------
*/


/*

Q01. Kya ham finalize() method ko manually call kar sakte he?
Ans. Yes, we can call finalize memory manually, but it works as normal method.

*/
class A
{
	int x, y;
	public void finalize() //it work like Normal method
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q17_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		a1 = null;
		a1.finalize();
		
		System.out.println("Main Method");
	}
}
/*
Exception in thread "main" java.lang.NullPointerException


--------------------------------------------------------
*/


/* Jab ham manually call karenge tab Exception aayega or ushe handle karna necessary he */
class A
{
	int x, y;
	public void finalize() //it work like Normal method
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
		System.out.println(10 / 0);
	}
}

class Q18_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		a1.finalize();
		
		System.out.println("Main Method");
	}
}
/*
Finalize Method : (10,20)
Exception in thread "main" java.lang.ArithmeticException: / by zero


--------------------------------------------------------
*/


/*
Runtime.getRuntime().gc() Method is better than System.gc() Method.
Because System.gc() Method  inherits  Runtime.getRuntime().gc().

Definition of System.gc()


public class System
{
	public static void gc()
	{
		Runtime.getRuntime().gc();
	}
}


# gc() Method of System class is static Method and ti has return type void (means no return value/type)

*/
class A
{
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q19_getRuntime_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		
		a1 = null;
		
		// Runtime.getRuntime().gc();
		
		Runtime r = Runtime.getRuntime();
		r.gc();
		
		System.out.println("Main Method");
	}
}
/*
Main Method
Finalize Method

--------------------------------------------------------
*/


/*
Point :
	1. Runtime, class is a Singleton class.
	2. We can't create Object of Runtime class Beause it is Singleton Class. 
	3. In Runtime class getRuntime() method is factory function.
	4. gc() Method of Runtime.getRuntime().gc() method is to request JVM to call gc().
*/
class A
{
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q20_getRuntime_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		
		a1 = null;
		
		// Runtime.getRuntime().gc();
		
		Runtime r = new Runtime();
		r.gc();
		
		System.out.println("Main Method");
	}
}
/*
error: Runtime() has private access in Runtime
                Runtime r = new Runtime();
                            ^
--------------------------------------------------------
*/

