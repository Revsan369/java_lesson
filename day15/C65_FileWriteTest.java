package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {
 public static void main(String[] args) {
	 
	 String filename = "C:\\Iclass05\\�ڹ��½�Ʈ.txt";
	
			 File file = new File(filename);
			 PrintWriter pw = null;
			 try {
				 pw = new PrintWriter(file);
				 pw.println("��� 90 89 82"); 
				 pw.println("��� 90 89 82"); 
				 pw.println("��� 90 89 82"); 
			 System.out.println("prit done");
			 
			} catch (FileNotFoundException e) {
				System.out.println("user err : " + e.getLocalizedMessage());
			}finally {
				
				pw.close();
			}
	 
}
}