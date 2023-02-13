package mavenWithException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception {

	
	FileReader f;
	BufferedReader bf;
	public void redTxt(String path) throws IOException  {
		try {
			f= new FileReader(new File(path));//create the instanstiate of FileReader for access the required file
	//in try block we put risky code ,if try failed catch block get execute.
			bf=new BufferedReader(f);//by using BufferedReader we connect the path of file .taht helps to readline
			String s=bf.readLine();
			while(s!=null) {
				System.out.println(s);
				s=bf.readLine();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} 
		catch (IOException e) {
			System.out.println("issue is reading file");
			e.printStackTrace();
		}
		finally {//finally doesn't matter try or catch block pass or failed its always get execute.
			if(f!=null) {//if any exeception happen finally block close the the programm.
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bf!=null) {
				bf.close();
			}
		}
		
	}
	
	
	
	
	
	
	
	

}


