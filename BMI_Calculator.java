import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		double w,h;
		System.out.println("Enter your weight in kilogram");
		w = sc.nextDouble();
		System.out.println("Enter your height in meters");
		h = sc.nextDouble();
		
		double BMI = w/(h*h);
		System.out.println("Your Body mass index (BMI) is : " + BMI + "kg/m2");
	}

}
