package day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pg1_Files1 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("D:\\abc.txt");
			int ind;
			while((ind = fr.read())!=-1)
			{
				System.out.print((char)ind);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
