package zilkiproj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class IOFileInternationilized {
	public static void main(String[] args){
		
		BufferedReader in=null;
		BufferedWriter out=null;
		try{
		in=new BufferedReader
				(new InputStreamReader
						(new FileInputStream
								("dictionary_hi.properties"),
										Charset.forName("UTF-8")));
		
		out=new BufferedWriter
				(new OutputStreamWriter
						(new FileOutputStream
								("copy_hi.properties"),
									Charset.forName("UTF-8")));
		char c[]=new char[8];
		int i=0;
		while((i=in.read(c))!=-1){
			out.write(c,0,i);
		}
		}
		catch(Exception e){e.printStackTrace();}
		finally{
			try{out.close();}catch(Exception e){}
		}
	}
}	
