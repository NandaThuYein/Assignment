import java.util.Scanner;
public class DiamondStar {
	public static void main (String args []) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please input your number :"+" ");
		int number = s.nextInt();
		System.out.println();
			for (int i = 1; i <= number; i++) {
				if (i<10) {
					System.out.print("0"+i+" ");
				}else {
					System.out.print(i+" ");
				}
				if (i<=(number/2)+1) {
					for (int k = 1; k <= number; k++) {
						if (k == (number/2)+2-i || k == (number/2)+i) {
							System.out.print("*"+" ");
						}else {
							System.out.print(" "+" ");
						}
					}
				}
				if (i>(number/2)+1) {
					for (int j = 1; j <= number; j++) {
						if (j == i-(number/2) || j == number-(i-(number/2+1))) {
							System.out.print("*"+" ");
						}else {
							System.out.print(" "+" ");
						}
					}
				}
				System.out.println();
			}
	}
}
