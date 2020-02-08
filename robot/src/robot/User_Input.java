package robot;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter ROBOT COMMAND"); 
 		s = sc.nextLine();  
 		
 		String[] question;
         
        /* delimiter */
        String delimiter = ",";
        question = s.split(delimiter);
	}

}
