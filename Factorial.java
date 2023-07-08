package basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10 ;
int i;
int fact=1;
for( i=1;i<=num;i++)
{
	fact*=i;
}
System.out.println("Factorial of for"+num+"="+fact);

	//using do while loop
do {
	fact*=i;
	i++;
}while(i<=num);
System.out.println("Factorial of do "+num+"="+fact);
	




//using while loop
while(i<=num) {
	 fact*=i;
	 i++;
}
System.out.println("Factorial of while "+num+"="+fact);
}}
