import java.util.Scanner;

public class steelproducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter hardness value :");
		int hardness = s.nextInt();
		System.out.print("Enter carbon value :");
		double carbon = s.nextDouble();
		System.out.print("Enter tensile value :");
		int tensile = s.nextInt();
		
		if(hardness>50 && carbon<0.7 && tensile>5600) {
			System.out.println("Grade is 10");
		}else if(hardness>50 && carbon<0.7) {
			System.out.println("Grade is 9");
		}else if(carbon<0.7 && tensile>5600) {
			System.out.println("Grade is 8");
		}else if(hardness>50 && tensile>5600) {
			System.out.println("Grade is 7");
		}else if(hardness>50 || carbon<0.7 || tensile>5600){
			System.out.println("Grade is 6");
		}else {
			System.out.println("Grade is 5");
		}

	}

}
