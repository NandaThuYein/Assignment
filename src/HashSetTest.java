import java.util.*; 
 public class HashSetTest{ 
public static void main(String args[]){ 
Set set=new HashSet();
 set.add("John"); 
 set.add("Marry"); 
 set.add("David"); 
 set.add("Smith"); 
 set.add(100);
 System.out.println(set);
Iterator it=set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
 } 
 } 
