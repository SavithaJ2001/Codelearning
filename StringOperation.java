package basic;

public class StringOperation {

	public static void main(String[] args) {
		String str="Black dog";
		String str1="black";
		String str2="pink";
		System.out.println("length of the string is:"+str.length());
	System.out.println("Uppercase is:"+str.toUpperCase());
System.out.println("Lowercase is:"+str.toLowerCase());
System.out.println("Is both the Strings are equal:"+str.equals(str));
System.out.println("ls both the strings are equal:"+str.equalsIgnoreCase(str1));
System.out.println("Concatination:"+str.concat(" Love"));
System.out.println("Index of c:"+str.indexOf('c'));
System.out.println("Index of a:"+str.indexOf('o'));
System.out.println("last Index of a:"+str.lastIndexOf('o'));
System.out.println("replace string :"+str.replace("Black","Pink"));
System.out.println("contains of:"+str.contains("k"));
System.out.println("substring:"+str.substring(1,3));
System.out.println("trim:"+str2.trim());
String str4 = "How are you?";
String arrStr[] = str4.split(" ", 3);
System.out.println("Splited Elements:");
for(int i=0;i<arrStr.length;i++) {
	System.out.print(arrStr[i] + " ");
}
System.out.println();
System.out.println("Splited Elements using for each loop:");
	for (String str5 : arrStr) {
		System.out.print(str5 + " ");
		String str6="";
		System.out.println("length of the string:"+str6.length());
		System.out.println("Is string empty:"+str6.isEmpty());
		System.out.println("Is string blank:"+str6.isBlank());
		
String str7 = "Welcome to edubridge    ";
        
        //convert string into character array
        char[] arr = str7.toCharArray();   
        String tempStr = "";
        for(char c:arr){
            
            if(c != ' '){
                tempStr += c;
            }
           // System.out.println(c);
            System.out.println("Temp"+tempStr);
        }
         str7 = tempStr;
        System.out.println(str7);



	}

	}
}



