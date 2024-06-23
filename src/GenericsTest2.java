class MyGen<T>{ 
		T obj; 
	void add(T obj){
		this.obj=obj;
} 
	T get(){
		return obj;
} 
} 
 public class GenericsTest2{ 
	 public static void main(String args[]){ 
		 MyGen<Integer> m1=new MyGen<Integer>(); 
		 		m1.add(2);
		 		m1.add(3);
		 	System.out.println(m1.get()); 
		 MyGen<String> m2=new MyGen<String>(); 
		 		m2.add("Hello"); 
		 	System.out.println(m2.get()); 
}
}