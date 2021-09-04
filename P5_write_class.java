package day14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Person
{
	String name,email,phone;
	public Person()
	{
		System.out.println("Enter name,email,phone");
		Scanner ob = new Scanner(System.in);
		name=ob.nextLine();
		email=ob.nextLine();
		phone=ob.nextLine();		
	}
	@Override
	public String toString() {
		String temp = "\nName = "+name+"\nEmail = "+email+"\nPhone = "+phone;
		return temp;
	}
}

public class P5_write_class {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.toString());
		try {
			FileWriter fw = new FileWriter("D:\\Persons.txt",true);
			fw.write(p.toString());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
