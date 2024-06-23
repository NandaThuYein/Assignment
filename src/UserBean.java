import java.util.Scanner;
public class UserBean{
		String name;
		String phoneno;
		String address;
		public void print () {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Name :\t");
			 name=s.next();
			System.out.print("Enter Phone No :\t");
			 phoneno=s.next();
			System.out.print("Enter Address :\t");
			 address=s.next();
		}		
		public void showmenu ( ) {
			System.out.println("Rrgular Ticket Price : 10000.0kys");
			System.out.println("Number of Ticket :T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10");
		}
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		public void showUser ( ) {
			System.out.println(" Name     :\t"+getName());
			System.out.println(" Phone No :\t"+getPhoneno());
			System.out.println(" Address  :\t"+getAddress());
		}
}
