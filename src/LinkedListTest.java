import java.util.*; 
 public class LinkedListTest{ 
public static void main(String args[]){ 
LinkedList list=new LinkedList();//Creating linkedlist 
 list.add("John");//Adding object in linkedlist 
 list.add("Marry"); 
 list.add("David"); 
 list.add("Smith Rowe");
 list.add(100);
 //Invoking linkedlist object
 for (int i=0;i<list.size();i++) {
 System.out.println(list.get(i)); 
 }
 } 
 } 
