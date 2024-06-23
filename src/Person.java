import java.util.Scanner;
	public class Person {
		Scanner s=new Scanner (System.in);
		int length=s.nextInt( );
 int[] idno=new int[length];
 String[] name=new String[length];
 String a=null;
 int b=0;
public void acceptData ( ) {
	System.out.println("accept Data :");
	Scanner s=new Scanner(System.in);
	for (int i=0;i<length;i++) {
		System.out.print("Person Name:\t");
		a=s.next( );
		name[i]=a;
		System.out.print(name[i]+"'s ID No:\t");
		b=s.nextInt( );
		 idno[i]=b;
	}
}
public void showData ( ) {
	System.out.println("Show Data :");
	for (int j=0;j<length;j++) {
		if (idno[j]==0 && name[j]==null) {
			System.out.println("No Data");break;}
		else {
	System.out.println("Person Name:"+name[j]);
	System.out.println(name[j]+"'s ID No:"+idno[j]);}
	}
}
public void ShowMessage ( ) {
	System.out.println("Welcome");
	System.out.println("1.Accept Data");
	System.out.println("2.Show Data");
	System.out.println("3.Exit System");
	System.out.print("Select option :\t");
}
public void ExitSystem ( ) {
	System.out.println("Thank You");
}
}
