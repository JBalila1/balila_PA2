import java.util.Scanner;

/*
 * Calculate BMI using a formula
 * 		Either with pounds/inches or kilograms/meters
 * 		Print out BMI score
 * 
 * Allow user to choose type of measurements
 * 		Define method for choosing preferred method of measurements
 * 		Take in user input (Scanner)
 * 
 * Calculate BMI Category
 * 		Define method that uses BMI score to determine BMI category
 * 		Print out BMI Category
 */
public class BMICalculator 
{
	// To read in User input
	Scanner stdin = new Scanner(System.in);
	
	// Instance variables
	private double height;
	private double weight;
	private int choice;
	private double BMI;
	private String BMICategory;
	
	// Represent possible unit types
	private final int METRIC = 1;
	private final int IMPERIAL = 2;
	
	// Default constructor to initialize instance variables
	public BMICalculator()
	{
		height = 0.0;
		weight = 0.0;
		choice = 0;
		BMI = 0.0;
		BMICategory = "";
	}
	
	// Prompts User to choose metric/imperial and takes input
	public void readUserData()
	{
		readUnitType();
		readMeasurementData(choice);
	}
	
	// Prompts User to choose metric or imperial calculation
	private void readUnitType()
	{
		do
		{
			System.out.print("Enter '1' if you would like to use a metric calculation and "
					+ "'2' if you would like to use an imperial calculation: ");
			choice = stdin.nextInt();
		} while (choice != METRIC && choice != IMPERIAL);
	}
	
	// Prompts User accordingly based on whether they chose metric or imperial calculations
	private void readMeasurementData(int c)
	{
		if (c == METRIC)
			readMetricData();
		else if (c == IMPERIAL)
			readImperialData();
	}
	
	// Takes User input for metric calculation
	private void readMetricData()
	{
		System.out.print("Enter your weight in kilograms: ");
		getWeight();
		
		System.out.print("Enter your height in meters: ");
		getHeight();
	}
	
	// Takes User input for imperial calculation
	private void readImperialData()
	{
		System.out.print("Enter your weight in pounds: ");
		getWeight();
		
		System.out.print("Enter your height in inches: ");
		getHeight();
	}
	
	// Calculates BMI and BMI Category based on metric/imperial calculations
	public void calculateBmi()
	{
		if (choice == METRIC)
		{
			BMI = weight / (height * height);
		}
		else if (choice == IMPERIAL)
		{
			BMI = (703 * weight) / (height * height);
		}
		
		calculateBmiCategory();
	}
	
	// Calculates BMI Category based on instance variable 'BMI'
	private void calculateBmiCategory()
	{
		if (BMI < 18.5)
		{
			BMICategory = "Underweight";
		}
		else
		{
			if (BMI < 24.9)
			{
				BMICategory = "Normal Weight";
			}
			else
			{
				if (BMI < 29.9)
				{
					BMICategory = "Overweight";
				}
				else
				{
					BMICategory = "Obese";
				}
			}
		}
	}
	
	// Prints out BMI and BMI Category to the screen
	public void displayBmi()
	{
		getBmi();
		getBmiCategory();
	}
	
	// Takes and sets User input for weight and exits the program if negative value is entered
	public void getWeight()
	{
		double w;
	
		w = stdin.nextDouble();
		
		if (w < 0)
		{
			System.out.println("Cannot enter a negative value for weight.");
			System.exit(0);
		}
		
		setWeight(w);
	}
	
	// Takes input and sets instance variable 'weight' to input
	private void setWeight(double w)
	{
		weight = w;
	}
	
	// Takes and sets User input for height and exits the program if negative value is entered
	public void getHeight()
	{
		double h;
		
		h = stdin.nextDouble();
		
		if (h < 0)
		{
			System.out.println("Cannot enter a negative value for height.");
			System.exit(0);
		}
		
		setHeight(h);
	}
	
	// Takes input and sets instance variable 'height' to input
	private void setHeight(double h)
	{
		height = h;
	}
	
	// Prints out BMI to the screen
	public void getBmi()
	{
		System.out.printf("Your BMI is %.1f\n", BMI);
	}
	
	// Prints out BMI Category to the screen
	public void getBmiCategory()
	{
		System.out.println("Your BMI category is " + BMICategory);
	}
}