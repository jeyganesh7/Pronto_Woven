package robot;

import java.util.Scanner;

public class User_Input 
{

	public static void main(String[] args)
	{
		String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter ROBOT Commands - seperated by comma: "); 
 		s = sc.nextLine();  
 		String ls = s.toLowerCase();
 		
 		String[] question;
        String delimiter = ",";
        question = ls.split(delimiter);
        check_errors(question);
	}
	
	public static void check_errors (String[] question)
	{
        int error = 0;        
        for (int i = 0; i < question.length; i++)
        {
        	String r = String.valueOf(question[i].charAt(0));
        	
        	if (!r.contains("f") && !r.contains("b") && !r.contains("l") && !r.contains("r") )
        	{
        		error++; 		
        	}
        }
        
        if(error > 0)
        {
        	System.out.println('\n'+"Invalid command found!"+'\n');
        	User_retry();
        }
        else
        {	
        calculation.robot_movement(question);
        }		
	} 	
	
	public static void User_retry ()
	{
		System.out.println("Do you want to try again? Enter Y or N");//Y to continue, N to exit
    	Scanner dc = new Scanner(System.in);
    	char e = dc.next().charAt(0);
    	
    	if(e =='Y' || e =='y')
    	{
    		main(null);
    	}
    	else 
    	{
    		System.out.println('\n'+"Bye bye...see you later");
    		System.exit(0);
    	}
	}
}
