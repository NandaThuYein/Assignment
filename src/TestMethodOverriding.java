class Bank{
	int getRateOfInterest(){return 0;}
}
class KBZ extends Bank{
	int getRateOfInterest(){return 8;}
}
class AYA extends Bank{
	int getRateOfInterest(){return 7;}
}
public class TestMethodOverriding {
	public static void main(String[] args){
			KBZ s=new KBZ();
			AYA i=new AYA();
		System.out.println("KBZ Rate of Interest:"+s.getRateOfInterest());
		 System.out.println("AYA Rate of Interest:"+i.getRateOfInterest()); 
}
}
