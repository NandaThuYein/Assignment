	class Car {
		void move( ) {System.out.println("Driving...");}
	}
		class myCar extends Car {
			void drive( ) {System.out.println("Happy Driving...");}
		}
			class yourCar extends Car {
				void ride ( ) {System.out.println("Riding") ;}
			}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		System.out.println("My Car :");
			myCar a=new myCar ( );
					a.move( );
					a.drive( );
		System.out.println("Your Car :");
			yourCar b=new yourCar ( );
					b.move( );
					b.ride( );
	}
}
