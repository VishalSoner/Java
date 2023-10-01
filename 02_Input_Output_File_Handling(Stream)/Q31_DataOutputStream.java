/* 
DataOutputStream  :  To Write the primitive Data into file.
	1. void writeByte( byte );
	2. void writeShort( short );
	3. void writeInt( int );
	4. void writeLong( long );
	5. void writeFloat( float );
	6. void writeDouble( double );
	7. void writeBoolean(boolean);

=====================================================================
*/
import java.io.*;

class Q31_DataOutputStream
{
	public static void main( String args[]) throws IOException
	{
		int x = 100;
		float y = 10.50f;
		boolean tr = true;
		
		FileOutputStream fs = new FileOutputStream("D:/2_All_Code/02_Input_Output_File_Handling(Stream)/Demo2.txt");
		
		//Store Primitive Type Data Using FileOutputStream
		DataOutputStream ds = new DataOutputStream(fs);
		
		ds.writeInt(x);
		ds.writeFloat(y);
		ds.writeBoolean(tr);
		
		ds.close();
		fs.close();
		
		System.out.println("Done");
	}
}

/*

Done

------------------------------------------------------

// DataOutputStream Se data insert to ho jayega but ham eshe file se directly access nai kar sakte he 

To read the Data From File.
DataInputStream : 
	1. readByte( byte );
	2. readShort( short  );
	3. readInt ( int );
	4. readLong( long );
	5. readFloat( float );
	6. readDouble( double );
	7. readBoolean( boolean );


----------------------------------------
*/







