package robot;

import java.util.Scanner;

public class calculation 
{

	public static void robot_movement (String[] question)
	{
 System.out.println('\n'+"Processing command...."+'\n');
		 
		 //Starting point co-ordinates 
		 int x = 0;
		 int y = 0;

		 //Set default direction as North which is 0
		 //North: a=0, East: a=1, South: a=2, West: a=3
		 int curr_direction = 0;
		 int prev_direction = 0;
		 
		 for (int i = 0; i < question.length; i++)
	        {
			 //Separate Integer and Character
			 int a = Integer.parseInt(question[i].replaceAll("[^0-9]", "")); //for bigger numbers like 17,101 
			 String r = String.valueOf(question[i].charAt(0));
			 			 
			 switch(r)
			 {
			 case "f": if(curr_direction == 0) //north
				 		{
				 			x=x+a;
				 		}
				 						 	 
				 		else if(curr_direction == 1) //east
				 		{	
				 			y=y+a;
				  		}
			 
				 		else if(curr_direction == 2) //south
				 		{	
				 			x=x-a;
				  		}
			 
				 		else //if(curr_direction == 4) //west
				 		{	
				 			y=y-a;
				  		}
			 			break;
			 			
			 case "b":	if(curr_direction == 0) //north
		 				{
		 					x=x-a;
		 				}
			 			
			 			else if(curr_direction == 1) //east
			 			{	
			 				y=y-a;
			 			}
		 		
			 			else if(curr_direction == 2) //south
		 				{	
		 					x=x+a;
		 				}
	 
			 			else //if(curr_direction == 3) //west
		 				{	
		 					y=y+a;
		 				}
	 					break;
			 
			 case "r": 
				 		curr_direction = ((prev_direction + a) % 4);
				 		prev_direction = curr_direction;
				 		break;
				 		
			 case "l":
				 		//curr_direction = (((prev_direction - a) + 4) % 4);
				  		curr_direction = (prev_direction - a);
				 		//direction can be negative with commands like L27, L99 as 1st command in the string.
				 		if (curr_direction < 0)
				 		{
				 			curr_direction = curr_direction % 4;
				 			curr_direction = curr_direction + 4;
				 			prev_direction = curr_direction;
				 		}
				 		else
				 		{
				 			curr_direction = curr_direction % 4;
				 			prev_direction = curr_direction;
				 		}
				 		break;
			 }			 
	        }
		 
		 System.out.println("Current co-ordinate position of Robot is (" +x+","+y+")"+'\n');
		 int distance = Math.abs(x)+Math.abs(y);
		 System.out.println("Minimum Distance to Starting Point is " +distance+ " Unit"+'\n');
		 User_Input.User_retry();
	}
}
	