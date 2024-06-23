import java.util.Scanner;
   class AllMyStarTriangles {
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
	System.out.print("Please input your numbers :");
	int number=s.nextInt( );
	System.out.println( );
		for (int i=1;i<=number;i++) {
	if (i<10) { System.out.print("0"+i+" "); }
	else      { System.out.print(i+" "); }  
		for (int k=1;k<=i;k++) {
	System.out.print("*"+" "); }
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		 if (i<=9) { System.out.print("0"+i+" "); }
		else {System.out.print(i+" ");	}
		for (int k=1;k<=(number-i)+1;k++) {
	System.out.print("*"+" "); }
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		 if (i<=9) { System.out.print("0"+i+" "); }
		else	   { System.out.print(i+" "); }
		for (int b=1;b<=i;b++)  {
	System.out.print(" "+" "); }
		for (int k=1;k<=(number-i)+1;k++) {
	System.out.print("*"+" "); }
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
	if (i<=9) {System.out.print("0"+i+" "); }
	else { System.out.print(i+" "); }  
		for (int b=1;b<=(number-i)+1;b++)  {
	System.out.print(" "+" "); }
		for (int k=1;k<=i;k++) {
	System.out.print("*"+" "); }
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		if (i<=9) { System.out.print("0"+i+" "); }
		else { System.out.print(i+" ");  }
		for (int k=1;k<=number;k++) {
	if (k==i){
	System.out.print("*"); }
	else { System.out.print(" "+" "); }
	}
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		 if (i<10) { System.out.print("0"+i+" "); }
		else { System.out.print(i+" "); }
		for (int k=1;k<=number;k++) {
	if (k==(number-i)+1){
	System.out.print("*"); }
	else { System.out.print(" "+" "); }
	}
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		if (i<10) { System.out.print("0"+i+" "); }
		else { System.out.print(i+" "); } 
		for (int k=1;k<=number;k++) {
	if (k==i||k==(number-i)+1){
	System.out.print("*"+" "); }
	else { System.out.print(" "+" "); }
	}
	System.out.println( );}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		 if (i<10) { System.out.print("0"+i+" "); }
		else { System.out.print(i+" "); }
	if (i<=(number/2)+1) {
		for (int k=1;k<=number;k++) {
	if (k==(number/2)+2-i||k==(number/2)+i)
	{  System.out.print("*"+" "); }
	else { System.out.print(" "+" "); }
					     }
			    }
	if (i>(number/2)+1) {
		for (int j=1;j<=number;j++) {
	if (j==i-(number/2)||j==number-(i-(number/2+1)) ) 
	     { System.out.print("*"+" ");}
	else { System.out.print(" "+" "); }
			     }
			     }
		System.out.println( );	 
	}
	System.out.println( );
		for (int i=1;i<=number;i++) {
		 if (i<10) { System.out.print("0"+i+" "); }
		else { System.out.print(i+" "); }
	if (i<=(number/2)+1) {
		for (int k=1;k<=number;k++) {
	if (k<(number/2)+2-i||k>(number/2)+i)
	{  System.out.print(" "+" "); }
	else { System.out.print("*"+" "); }
					     }
			    }
	if (i>(number/2)+1) {
		for (int j=1;j<=number;j++) {
	if (j<i-(number/2)||j>number-(i-(number/2+1)) ) 
	     { System.out.print(" "+" ");}
	else { System.out.print("*"+" "); }
			     }
			     }
		System.out.println( );	 
	}
		System.out.println( );
		for (int i=1;i<=number;i++) {
		 if (i<10) { System.out.print("0"+i+" "); }
		else { System.out.print(i+" "); }
	if (i<=(number/2)+1) {
		for (int k=1;k<=number;k++) {
	if (k<=(number/2)+2-i||k>=(number/2)+i)
	{  System.out.print("*"+" "); }
	else { System.out.print(" "+" "); }
					     }
			    }
	if (i>(number/2)+1) {
		for (int j=1;j<=number;j++) {
	if (j<=i-(number/2)||j>=number-(i-(number/2+1)) ) 
	     { System.out.print("*"+" ");}
	else { System.out.print(" "+" "); }
			     }
			     }
		System.out.println( );	 
	}
    }
}

