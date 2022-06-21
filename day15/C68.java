package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C68 {
	public static void main(String[] args) {
		
	

	String filename = "C:\\Iclass05\\자바태스트2.txt";
	
	 File file = new File(filename);
	 
	 try ( 
	Scanner	 sc = new Scanner(file);){
	
		 
		 while(sc.hasNext()) {
			 System.out.println(sc.nextLine());}
		 }
	 catch (FileNotFoundException e) {
		System.out.println("user err : " + e.getLocalizedMessage());
	}
}
}

