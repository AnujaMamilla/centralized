package java1;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class {

	public static void main(String[] args) throws IOException {
File f=new File("../java/New Text Document.txt");
FileWriter fw=new FileWriter(f);
//BufferedReader b=new BufferedReader(fr);
//String s;
//while((s=b.readLine())!=null) {
	//System.out.println(s);
fw.write("This is my new data");
fw.close();
	
}
{
	
}
	}


