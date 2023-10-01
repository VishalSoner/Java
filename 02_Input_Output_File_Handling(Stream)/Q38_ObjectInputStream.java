import java.io.*;

class Q38_ObjectInputStream
{
	public static void main( String args[]) throws Exception
	{
		FileInputStream fs1 = new FileInputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		ObjectInputStream os1 = new ObjectInputStream(fs1);
		
		
		
		pkg.Game g2 = (pkg.Game)os1.readObject(); 
		g2.display_Data();
		
		fs1.close();
		os1.close();
		
		pkg.Game g1 = new pkg.Game();
		g1.play();
		/* ------------------------------------------------------ */
		
		FileOutputStream fs2 = new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		ObjectOutputStream os2 = new ObjectOutputStream(fs2);
		
		os2.writeObject(g1);

		System.out.println("Stored");

		fs2.close();
		os2.close();
	}
}

/*
// 1st Time Compile :
-------------------
| Id      : 10    |
| Name    : 20    |
| Age     : 30    |
| Contact : 40    |
-------------------

Enter Id : 50
Enter Name : 60
Enter Age : 70
Enter Contact No. : 80
-------------------
| Id      : 50    |
| Name    : 60    |
| Age     : 70    |
| Contact : 80    |
-------------------
Stored



// 2st Time Compile :
D:\2_All_Code\02_Input_Output_File_Handling(Stream)>java Q37_ObjectInputStream
-------------------
| Id      : 50    |
| Name    : 60    |
| Age     : 70    |
| Contact : 80    |
-------------------

Enter Id : 101
Enter Name : 102
Enter Age : 103
Enter Contact No. : 104
-------------------
| Id      : 101    |
| Name    : 102    |
| Age     : 103    |
| Contact : 104    |
-------------------

------------------------------------------------------
*/

