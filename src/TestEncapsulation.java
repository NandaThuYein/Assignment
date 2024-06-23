import java.util.Scanner;
class student {
	private int id;
	private String name;
	public void print( ) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ID :\t");
		id=s.nextInt( );
		System.out.print("Enter Name :\t");
		name=s.next( );
	}
	public int getID( ) {return id; }
	public String getName( ) {return name; }
	public void Set(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class TestEncapsulation {
	public static void main (String[] args) {
		student s2=new student( );
		s2.print( );
		System.out.println("Student Name :"+s2.getName( ));
		System.out.println(s2.getName( )+"'s ID :"+s2.getID( ));
	}
}
