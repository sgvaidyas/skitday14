package day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pg3_write {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("D:\\test.txt");
			BufferedWriter bw = new BufferedWriter(w);
			bw.write("WELCOME");
			bw.write("ON SATURDAY LIVE SHOW");
			bw.close();
			System.out.println("SUCCESS");			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
