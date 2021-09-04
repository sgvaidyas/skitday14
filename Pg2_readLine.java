package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pg2_readLine {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\abc.txt");
		int cnt=1;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			while((line=br.readLine())!=null)
			{
				sb.append("Line num="+ cnt++ +" : ");
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println("CONTENT OF FILE");
			System.out.println(sb.toString());
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("__________________________________");
		}		
	}

}
