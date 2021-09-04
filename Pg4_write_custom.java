package day14;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pg4_write_custom {

	public static void main(String[] args) {
		int ch;
		String fulltext=" ";		
		Scanner ob = new Scanner(System.in);
		try {
			FileWriter w = new FileWriter("D:\\test1.txt",true);
			do
			{
				System.out.println("Enter name");
				String name=ob.next();
				fulltext+=name+"\n";				
				System.out.println("If you want to stop press 1");
				ch=ob.nextInt();
			}while(ch!=1);
			w.write(fulltext);
			w.close();
			System.out.println("SUCCESS");			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
