
public class Address {
	String city,state,country;
	public static void main(String[] args) {
		Address add1=new Address("Yangon","Hlaing","Myanmar");
		System.out.println("City Name /"+" "+add1.city);
		System.out.println("State Name /"+" "+add1.state);
		System.out.println("Country Name /"+" "+add1.country);
	}
public Address(String city, String state, String country) {
	this.city = city;
	this.state = state;
	this.country = country;
	}
public String getCity() {
	return city;
}
}

