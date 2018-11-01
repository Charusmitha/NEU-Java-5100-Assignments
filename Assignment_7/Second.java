package assignment7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
	public static void parse(File file) throws IOException {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		   } catch (Exception e) {
			e.printStackTrace();
		} finally {
		       if (input != null) {
		           input.close();
		       }
		   }
		}

}
