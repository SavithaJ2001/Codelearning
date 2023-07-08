package basic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int firstterm=0;
		int secondterm=1;
		System.out.println("Fibonacci series till: "+num);
		int nextterm ;
		for(int i=1;i<=num;i++)
			System.out.println( nextterm);
	         nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			
					
//using while loop
//		int i=1;
//		while(i<=num) {
//			System.out.println( firstterm+",");
//			
//			nextterm=firstterm+secondterm;
//			firstterm=secondterm;
//			secondterm=nextterm;
//			System.out.println( firstterm+",");
//			i++;
//			
//		}
//			
//		//using do while loop
//		 i=1;
//		do {
//			 nextterm=firstterm+secondterm;
//			firstterm=secondterm;
//			secondterm=nextterm;
//			System.out.println( firstterm+",");
//			i++;
//			
//			
//		}while(i<=num);
//		
}

}
