package demo.ptpl;
import java.util.Scanner;


public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter your weight in kilograms: ");
			        double weight = scanner.nextDouble();
			        System.out.print("Enter your height in centimeters: ");
			        double heightCM = scanner.nextDouble();

			        double heightM = heightCM / 100.0; 
			        double bmi = weight / (heightM * heightM);
			        
			        System.out.printf("Your Body Mass Index (BMI) is: %.2f\n", bmi);
			        scanner.close();

			        String bmiCategory;
			        
			        if (bmi < 18.5)
			        {
			            bmiCategory = "Underweight";
			        } 
			        else if (bmi < 25) 
			        {
			            bmiCategory = "Healthy";
			        }
			        else if (bmi < 30)
			        {
			            bmiCategory = "Overweight";
			        } 
			        else 
			        {
			            bmiCategory = "Obese";
			        }
			        System.out.println("BMI Category: " + bmiCategory);
	}

}
