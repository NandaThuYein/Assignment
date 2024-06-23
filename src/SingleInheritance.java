	class Animals {
	 void sleep(){System.out.println("sleeping...");}
	}
	class Tiger extends Animals{
	 void geteat(){
		 super.sleep();
		 System.out.println("catching...");}

	}
	
	public class SingleInheritance{
public static void main(String args[]){
		Tiger d=new Tiger();
			d.geteat();
}
}
