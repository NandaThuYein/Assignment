import java.util.*; 
 public class MapTest{ 
public static void main(String args[]){ 
 Map<Integer,String> map=new HashMap(); 
 map.put(100,"Sue"); 
 map.put(101,"Mary"); 
 map.put(102,"Jones"); 
 for(Map.Entry m:map.entrySet()){ 
	 System.out.println(m.getKey()+" "+m.getValue()); 
	 } 
}
 }
