package robot;

public class calculation 
{

	public static void robot_movement (String[] question)
	{
		 	 
		 System.out.println("Processing command....");
		 
		 //Initialise co-ordinates of robot 
		 int x = 0;
		 int y = 0;

		 //Initialise direction of robot
		 //North: a=0, East: a=1, South: a=2, West: a=3
		 int curr_direction = 0;
		 int prev_direction = 0;
		 
		 for (int i = 0; i < question.length; i++)
	        {
			 //Seperate Integer and Character
			 
			 //int a = Integer.parseInt(String.valueOf(question[i].charAt(1))); 
			 int a = Integer.parseInt(question[i].replaceAll("[^0-9]", ""));
			 
			 String b = String.valueOf(question[i].charAt(0));
			 
			  
			 switch(b)
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
			 
			 }}	
	}

}
	