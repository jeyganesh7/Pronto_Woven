package robot;

import java.util.Scanner;

public class User_Input 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter ROBOT Commands - seperated by comma: "); 
 		s = sc.nextLine();  
 		
 		String[] question;
         
        /* delimiter */
        String delimiter = ",";
        question = s.split(delimiter);
        calculation.robot_movement(question);     
	}

}
