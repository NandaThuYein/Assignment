import java.io.IOException;

public class characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letter = 'A';
		
		System.out.print("Enter a letter :");
		try {
			letter = (char) System.in.read();
			if(letter>=65 && letter<=90) {
				System.out.println("A capital letter.");
			}else if(letter>=97 && letter<=122) {
				System.out.println("A small letter.");
			}else if(letter>=48 && letter<=57) {
				System.out.println("A digit.");
			}else if(letter>=0 && letter<=47 || letter>=58 && letter<=64 ||
					 letter>=91 && letter<=96 || letter>=123 && letter<=127) {
				System.out.println("A special symbol.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
