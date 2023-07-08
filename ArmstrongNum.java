package basic;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,rem=0,temp=num;
		double sum=0;
		System.out.println();
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+Math.pow(rem, 3);
			temp=temp/10;
	
		}
		//System.out.println(Math.pow(num, sum));
		if(sum==num) {
			System.out.println("is Armstrong ");
		}else {
			System.out.println("is not Armstrong");
			
		}
		

	}

}
