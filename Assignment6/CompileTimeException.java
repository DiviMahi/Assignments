package Assignment6;

import java.io.File;
import java.io.FileReader;

public class CompileTimeException {
	public static void main(String[] args) {
		String s = "";
		File f = new File("hello");
		try {
			throw new FileNotFoundException("File Not Found");
			//FileReader fr = new FileReader(f);
//
	//		int read = fr.read();
	//		while (read != -1) {
		//		s = s + (char) read;
			//	read = fr.read();

			
		} catch (Exception e) {
			// System.out.println("file found");
			e.printStackTrace();

		}
	}}

