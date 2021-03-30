package java1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassR {

	public static void main(String[] args) throws IOException {
	File f=new File("../java/New Text Document.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	String a;
	while((a=b.readLine())!=null)
	{
		
		System.out.println(a);
	}
	
	}

}
