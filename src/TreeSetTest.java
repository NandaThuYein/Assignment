import java.util.*; 
public class TreeSetTest {
@SuppressWarnings("rawtypes")
public static void main(String args[]){ 
TreeSet<Integer> set=new TreeSet();
// set.add("John"); 
//set.add("Marry"); 
 //set.add("David"); 
////set.add("Smith");
set.add(7);
set.add(90);
set.add(5);
Iterator <Integer>itr=set.iterator();
while (itr.hasNext()) {
	if(itr.next()%2==0)
		itr.remove();
}
 System.out.println(set); 
 } 
 } 
