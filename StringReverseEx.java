package basic;

public class StringReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the string using StringBuilder
		String str="xyz";
		StringBuilder sb1=new StringBuilder(str);
		sb1.reverse();
		System.out.println("Reverse of the string using StringBuilder:"+ sb1);
		
	//Reverse the string using StringBuffer
	String s2="abc";
	StringBuilder sb2=new StringBuilder(s2);
	sb2.reverse();
	System.out.println("Reverse of the string using StringBuffer:"+sb2);
	
//Reverse the string using for loop
String s12="welcome";
String rev11="";
for(int i=s12.length()-1;i>0;i--) {
	rev11=rev11+s12.charAt(i);
	
	}

}}
