
public class pattern {

	public static void main(String[] args) {
		 System.out.println("start prog");
		 int r=5;
          for(int i=1;i<=r;i++) {
			  for(int j=r-i;j>=1;j--) {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++)
			  {
				  System.out.print("* ");
			  }
			 }
			 
		  System.out.println();
		  
		  }
		  System.out.println("End prog");
	}


