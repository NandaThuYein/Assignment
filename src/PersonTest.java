import java.util.Scanner;
public class PersonTest {
public static void main(String[] args) {
	Person a=new Person( );
	Scanner q=new Scanner(System.in);
	int an;
	do {
		a.ShowMessage ( );
		an=q.nextInt();
		switch (an) {
		case 1:
			System.out.println( );
			a.acceptData ( );
			break;
		case 2:
			a.showData ( );
			break;
		case 3:
			a.ExitSystem ( );
		}
	}while (an!=3);
}
}
