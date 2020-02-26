package cost_estimate;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cost_calculation {
	private static final Logger LOGGER=LogManager.getLogger(Cost_calculation.class);
	public static void main(String[] z)
	{
		Scanner s=new Scanner(System.in);
		LOGGER.error("choose input from below:\nstandard\nabove standard\nhigh standard\nhigh standard and fully automated\n enter Input:");
		String Standard=s.nextLine();
		LOGGER.error("enter area of house in square feet:");
		double Area_of_house=s.nextDouble(),Estimated_Cost;
		if(Standard.equalsIgnoreCase("standard"))
			Estimated_Cost=Area_of_house*1200;
		else if(Standard.equalsIgnoreCase("above standard"))
			Estimated_Cost=Area_of_house*1500;
		else if(Standard.equalsIgnoreCase("high standard"))
			Estimated_Cost=Area_of_house*1800;
		else if(Standard.equalsIgnoreCase("high standard and fully automated")) 
			Estimated_Cost=Area_of_house*2500;
		else
			Estimated_Cost=0;
		LOGGER.error("Estimated cost is : %.2f",Estimated_Cost);
	}

}
