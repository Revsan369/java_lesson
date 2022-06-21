package day15;

import java.util.Scanner;

public class C69_MyExceptionTest {
	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("age >>> ");
		
	try {
		int age = Integer.parseInt(sc.nextLine());
		
		if(age <0 || age >100) 
			throw new AgeException("age is 0~100");//when more actions from Class is needed
		//throw new Exception("age is 0~100");//only change message
		//throw custom Exception
		System.out.println("age + " + age );
	if(age==0) throw new NullPointerException();
		
	}catch (NumberFormatException e) {
		System.out.println("age is int ");
		}
	}catch(Exception e) {
		System.out.println("err : " + e.getMessage());
		
	}
	}}

		class AgeException extends Exception{

			//Serializable
			private static final long serialVersionUID = 1L;
			//make own err message
			public AgeException(String message) {
				super(message);    //Exe message fild 
				
			}
		}

