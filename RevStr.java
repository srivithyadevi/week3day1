package week3day1;

public class RevStr {

	public static void main(String[] args) {
		String str="sri" , rev=" ";
		char ch;
		System.out.println("The gien string is:" +str); 
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println("Reversed word is:" +rev);
		}

}
