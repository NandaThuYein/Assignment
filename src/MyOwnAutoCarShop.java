	class CarShop {
		int speed;
		double regularprice;
		String color; 
		public  CarShop (int speed,double regularprice,String color ) {
			this.speed=speed;
			this.regularprice=regularprice;
			this.color=color;
		}
		 public double getsaleprice( ) {return regularprice; }
	}
	class Truck extends CarShop {
		int weight;
		public Truck (int speed,double regularprice,String color,int weight) {
			super(speed,regularprice,color);
			this.weight=weight;
		}
		 public double getsaleprice( ) {
			if (weight>2000)return (regularprice-(regularprice*10)/100);
			else return (regularprice-(regularprice*20)/100);
		 }
		public void display ( ) {
			  System.out.println("____Truck____");
				System.out.println("Speed :\t"+speed);
				System.out.println("Weight :\t"+weight);
				System.out.println("Color :\t"+color);
				System.out.println("Regular Price :\t"+regularprice+" "+"Dollar");
		  }
	}
	class Ford extends CarShop {
		int year;
		int manufacturerDiscount;
		public Ford (int speed,double regularprice,String color,int year,int manufacturerDiscount) {
			super(speed,regularprice,color);
			this.year=year;
			this.manufacturerDiscount=manufacturerDiscount;
		}
		public void display ( ) {
			System.out.println("____Ford____");
			System.out.println("Speed :\t"+speed);
			System.out.println("Year :\t"+year);
			System.out.println("Color :\t"+color);
			System.out.println("Manufacturer Discount :\t"+manufacturerDiscount+"%");
			System.out.println("Regular Price :\t"+regularprice+" "+"Dollar");
		}
		public double getsaleprice( ) {return (regularprice-(regularprice*manufacturerDiscount)/100); }
	}
	class Sedan extends CarShop {
		int length;
		public Sedan (int speed,double regularprice,String color,int length) {
			super(speed,regularprice,color);
			this.length=length;
		}
		public void display ( ) {
			System.out.println("____Sedan____");
			System.out.println("Speed :\t"+speed);
			System.out.println("Length :\t"+length+" "+"feet");
			System.out.println("Color :\t"+color);
			System.out.println("Regular Price :\t"+regularprice+" "+"Dollar");
		}
		public double getsaleprice( ) {
			if (length>20)return (regularprice-(regularprice*5)/100);
			else return (regularprice-(regularprice*10)/100);
		}
	}
public class MyOwnAutoCarShop {
	public static void main(String[] args) {
		Truck sale1=new Truck(80,1000,"Red",2000);
		sale1.display( );
		System.out.println("Sale Price :\t"+sale1.getsaleprice()+" "+"Dollar");
		Ford sale2=new Ford(90,1500,"White",2021,5);
		sale2.display( );
		System.out.println("Sale Price :\t"+sale2.getsaleprice()+" "+"Dollar");
		Sedan sale3=new Sedan(100,3000,"Black",30);
		sale3.display ( );
		System.out.println("Sale Price :\t"+sale3.getsaleprice()+" "+"Dollar");
		
	}
}
