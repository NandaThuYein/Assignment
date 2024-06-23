import java.util.*;
import java.util.Scanner;
public class TicketMain {
	@SuppressWarnings("rawtypes")
	public static  void main(String[] args) {
		TicketBean T1=new TicketBean("T1",10000);
		TicketBean T2=new TicketBean("T2",10000);
		TicketBean T3=new TicketBean("T3",10000);
		TicketBean T4=new TicketBean("T4",10000);
		TicketBean T5=new TicketBean("T5",10000);
		TicketBean T6=new TicketBean("T6",10000);
		TicketBean T7=new TicketBean("T7",10000);
		TicketBean T8=new TicketBean("T8",10000);
		TicketBean T9=new TicketBean("T9",10000);
		TicketBean T10=new TicketBean("T10",10000);
		UserBean U=new UserBean();
		int t=0;
		 double total=0;
		 double totalPrice=0;
		 String ans=" ";
		 
		 @SuppressWarnings({ "unchecked" })
		ArrayList <String> list = new ArrayList( );
		 
		 Scanner s=new Scanner(System.in);
		 
			@SuppressWarnings({ "unchecked" })
			Map <Integer,TicketBean> map=new HashMap();
			map.put(1,T1);
			map.put(2,T2);
			map.put(3,T3);
			map.put(4,T4);
			map.put(5,T5);
			map.put(6,T6);
			map.put(7,T7);
			map.put(8,T8);
			map.put(9,T9);
			map.put(10,T10);
		
			U.showmenu();
			System.out.println( );
			
	do {
			
	  do {  
			System.out.print("Enter Number of Ticket :\t");
			t=s.nextInt( );
			
	if(map.containsKey(t)) {
		
		for(Map.Entry m:map.entrySet()){
			
			if(((TicketBean)m.getValue()).getTicket().equals("B"+t)) {
				
				System.out.println("Already Booked! Try Again.");
				break;
				
			}else {
			total =((TicketBean) m.getValue()).getPrice();
			totalPrice+=total;
			TicketBean tt = new TicketBean("B"+t,10000);
			map.put(t,tt);
			
			list.add(tt.getTicket());
			
			break;
			}
		}
	}else {
		System.out.println("Your number is empty.");
	}
		System.out.print("Continue (y,n) :\t");
		ans=s.next( );
	}while(ans.equals("y"));
	  
	  System.out.print("Comfirm (y,n) :\t");
	  ans = s.next();
	  
	  if(ans.equals("y") && totalPrice != 0) {
	  
	  U.print( );
	  System.out.println( );
	  U.showUser( );
	  
	  System.out.print("Booking Ticket :\t"); 
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" "); 
			}
		
		System.out.println( );
		
	  System.out.println("Total Price :\t"+totalPrice+"kys");
	  totalPrice = 0;
	  System.out.println();
	  
	  System.out.print("Tickets are :");
	  
	  for(Map.Entry k:map.entrySet()) {
		  System.out.print(((TicketBean)k.getValue()).getTicket()+" ");
	  }
	}else {
		  System.out.println("No Ticket! Please,first you choose ticket.");
	  }
	  System.out.println();
	  System.out.print("Next One (y,n) :\t");
	  ans = s.next();
	  if(ans.equals("y")) {
		  list.clear();
	  }
	}while(list.isEmpty());
  }
}
