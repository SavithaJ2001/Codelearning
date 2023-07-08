package basic;

public class PalindromeEx {

	public static void main(String[] args) {
		int n=0;
		int r,temp=n;
		int rev=0;
		int n1=254;
		while(n1!=0) {
			r=n1%10;
			rev=(rev*10)+r;
			n1=n1/10;}
		System.out.println("Reverse Number is:"+rev);
	if(temp==rev) {
		System.out.println("The number is Palindrome");
	}else {
		System.out.println("The number is not a Palindrome");
		
	}
		// TODO Auto-generated method stub

	}

}
