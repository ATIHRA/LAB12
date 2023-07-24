package question6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program enables Processing  Daily  Rainfall Data from Selected Station using Byte-Based Stream
 * The data is written in byte-based using DataOutputStream class. 
 * 
 * Data:  station id, station name, name of district and 6-days reading of daily rainfall.
 * 
 * @author Nur Atihra Binti Safuan - B032210100
 *
 */

public class RainFallByteBasedGenerator {
	public static void main (String [] args)
	{
		// Output file 
		String outFile = "RainFallByte.txt";
		
		// Data declaration
		// Station id
		int id[] = {2422005, 2325029, 2324008, 2324088, 2222001, 2223066};
		
		// Station name
		String station[] = {"Simpang Ampat", "Melaka Pindah", "Ldg.Sing Lian","Hospital Jasin","Klebang","Sungai Duyong"};
		
		// district name
		String district[] = {"Alor Gajah", "Alor Gajah", "Jasin     ", "Jasin     ","Melaka Tengah", "Melaka Tengah"};
		
		// readings on 18 June 2023
		double readings1[] = {0.0, 0.0, 0.0, 0.9, 0.0, 0.8};
		
		// readings on 19 June 2023
		double readings2[] = {6.0, 12.0, 0.5, 21.0, 75.5, 37.0};
		
		// readings on 20 June 2023
		double readings3[] = {44.0, 18.5, 4.5, 5.0, 8.5, 26.6};
		
		// readings on 21 June 2023
		double readings4[] = {1.0, 21.5, 0.0, 29.0, 25.5, 0.0,};
		
		// readings on 22 June 2023
		double readings5[] = {0.0, 0.0, 0.0, 4.0, 0.0, 8.0};
		
		// readings on 23 June 2023
		double readings6[] = {0.0, 5.0, 0.0, 0.0, 20.0, 31.7};
		
		try {
			
			//Create output stream to read data
			DataOutputStream dataOutputStreamOut = new DataOutputStream(new FileOutputStream(outFile));
			
			//Process data
			for (int index = 0; index < station.length; index++) {
				
				//Write data into data stream
				dataOutputStreamOut.writeInt(id[index]);
				dataOutputStreamOut.writeUTF(station[index]);
				dataOutputStreamOut.writeUTF(district[index]);
				dataOutputStreamOut.writeDouble(readings1[index]);
				dataOutputStreamOut.writeDouble(readings2[index]);
				dataOutputStreamOut.writeDouble(readings3[index]);
				dataOutputStreamOut.writeDouble(readings4[index]);
				dataOutputStreamOut.writeDouble(readings5[index]);
				dataOutputStreamOut.writeDouble(readings6[index]);
				
				//Flush for each writing
				dataOutputStreamOut.flush();
			}
			
			//Close stream
			dataOutputStreamOut.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
	
}
