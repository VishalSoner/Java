import java.io.*;
import java.util.*;


// Without implement Serializable Interface (marker Interface)
class Game
{
	private int id;
	private String name;
	private int age;
	private long contact;
	
	public void play()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Swap Two Number Program");
		System.out.print("Enter 1st Element : ");
		int x = sc.nextInt();
		
		System.out.print("Enter 2st Element : ");
		int y = sc.nextInt();
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.print("1st Element : " + x);
		System.out.print("2st Element : " + y);
	}
}

class Q35_ObjectOutputStream
{
	public static void main( String args[]) throws IOException
	{
		FileOutputStream fs = new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		Game g1 = new Game();
		os.writeObject(g1);

		System.out.println("Stored");

		fs.close();
		os.close();
		
	}
}

/*
Exception in thread "main" java.io.NotSerializableException: Game

------------------------------------------------------
*/

