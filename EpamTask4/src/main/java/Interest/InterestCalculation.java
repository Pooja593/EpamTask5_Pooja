package Interest;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class InterestCalculation {
	private static final Logger LOGGER=LogManager.getLogger(InterestCalculation.class);
	public static void main(String[] z)
	{
		Scanner s=new Scanner(System.in); 
		LOGGER.info("enter Principal_Amount:");
		double Principal=s.nextDouble();
		LOGGER.info("enter Rate_Of_Intrest:");
		double InterestOfRate=s.nextDouble();
		LOGGER.info("enter Period_Of_Time:");
		int time=s.nextInt();
		double Simple_Interest,Compound_Interest;
		Simple_Interest=Principal*time*(InterestOfRate/100);
		Compound_Interest=Principal*(Math.pow(1+(InterestOfRate/100),time))-Principal;//compounded annually
		LOGGER.info("Simple Intrest is:%.3f\n",Simple_Interest);
		LOGGER.info("Compound Intrest is:%.3f\n",Compound_Interest);
	}
	
}
