interface Printable{
	void print();
}
interface Showable{
	void show();
}
public class TestInterface implements Printable,Showable{
	public void print(){System.out.println("Hello");}
	public void show(){System.out.println("Welcome");}
			public static void main(String args[]){
				TestInterface obj = new TestInterface();
								obj.print();
								obj.show();
}
}