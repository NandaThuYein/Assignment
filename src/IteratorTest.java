
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTest {
public static void main(String []args) {
ArrayList list=new ArrayList();
for(int i=0;i<10;i++) {
list.add(i);}
for (int j=0;j<list.size( );j++) {
Iterator <Integer> itr=list.iterator();
while(itr.hasNext()) {
if(itr.next()%2==0) 
itr.remove(); }
System.out.println(list.get(j));
}
}
}