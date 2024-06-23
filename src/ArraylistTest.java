import java.util.*;
import java.util.Scanner;
 public class ArraylistTest{ 
public static void main(String args[]){ 
ArrayList<String> list=new ArrayList();//Creating arraylist 
for (int i=0;i<2;i++) {
	Scanner scann=new Scanner(System.in);
	System.out.print("Enter Name :\t");
	String name=scann.next();
	list.add(name);
 //System.out.println(list); 
}
for (int j=0;j<list.size();j++) {
	System.out.println(list.get(j));
}

 } 
 } 
