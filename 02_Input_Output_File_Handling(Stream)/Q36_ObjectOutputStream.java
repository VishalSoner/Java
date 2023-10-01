import java.io.*;
import java.util.*;

class Q36_ObjectOutputStream
{
	public static void main( String args[]) throws IOException
	{
		pkg.Game g1 = new pkg.Game();
		g1.play();
		
		FileOutputStream fs = new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(g1);

		System.out.println("Stored");

		fs.close();
		os.close();
		
	}
}

/*



------------------------------------------------------
*/

