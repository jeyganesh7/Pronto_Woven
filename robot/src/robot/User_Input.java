package robot;

import java.util.Scanner;

public class User_Input 
{

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);	
		String s; 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter ROBOT Commands - seperated by comma: "); 
 		s = sc.nextLine();  
 		
 		//if (!s.contains("f") && !s.contains("b") && !s.contains("l") && !s.contains("r") )
 		
        String[] question;
         
        /* delimiter */
        String delimiter = ",";
        
        question = s.split(delimiter);
        check_errors(question);
	}
	
	public static void check_errors (String[] question)
	{
        int error = 0;
        
        for (int i = 0; i < question.length; i++)
        {
        	String b = String.valueOf(question[i].charAt(0));
        	//if(b !="f" || b !="b" || b !="l" || b !="r")
        	if (!b.contains("f") && !b.contains("b") && !b.contains("l") && !b.contains("r") )
        	{
        		//System.out.println("checkpoint 1");
        		error++; 		
        	}
        	else
        	{
        		error = error;
        	}
        }
        if(error > 0)
        {
        	System.out.println('\n'+"Invalid command found!"+'\n');
        	System.out.println("Do you want to try again? Enter Y or N"+'\n');
        	//char e;
        	Scanner dc = new Scanner(System.in);
        	char e = dc.next().charAt(0);
        	
        	if(e =='Y' || e =='y')
        	{
        		//System.out.println("reached here");
        		main(null);
        	}
        	else 
        	{
        		System.out.println("Bye bye...see you later");
        		System.exit(0);
        	}
        }
        else
        {	
        calculation.robot_movement(question);
        }
 		
	} 	

}
