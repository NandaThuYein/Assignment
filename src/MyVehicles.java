abstract class Vehicles {
	abstract void getType ( );
	abstract void getColor ( );
	abstract void getBrandName ( );
}
class Cars extends Vehicles {
	void getType ( ) {System.out.println("Type : Truck");}
	void getColor ( ) {System.out.println("Color : Red");}
	void getBrandName ( ) {System.out.println("Brand Name : TOYOTA");}
}
	class Bicycles extends Vehicles {
		void getType ( ) {System.out.println("Type : Hero");}
		void getColor ( ) {System.out.println("Color : Green");}
		void getBrandName ( ) {System.out.println("Brand Name : COROCODINE");}
	}
		class Motorbikes extends Vehicles {
			void getType ( ) {System.out.println("Type : 125");}
			void getColor ( ) {System.out.println("Color : Black");}
			void getBrandName ( ) {System.out.println("Brand Name : HONDA");}
		}
public class MyVehicles {
	public static void main (String[] args) {
		Vehicles v=new Cars( );
			v.getType( );
			v.getColor( );
			v.getBrandName( );
		Vehicles v1=new Bicycles( );
			v1.getType( );
			v1.getColor( );
			v1.getBrandName( );
		Vehicles v2=new Motorbikes( );
			v2.getType( );
			v2.getColor( );
			v2.getBrandName( );
	}
}
