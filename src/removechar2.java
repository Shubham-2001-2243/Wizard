import java.util.Scanner;

public class removechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr first string");
		String str=sc.next();
		System.out.println("enter second string");
		String sbstr=sc.next();
		
		
		char [] c1str=str.toCharArray();
		char [] c2sbstr=sbstr.toCharArray();
		
		
		for(int j=0;j<c2sbstr.length;j++)
		{
		for(int i=0;i<c1str.length;i++)
		{
		if(c1str[i]==c2sbstr[j]) {
			c1str[i]=0;
                		 
		}
		
		}	
	

}
	
		System.out.println("after removing");
		for(int  i=0;i<c1str.length;i++) {
		System.out.print( c1str[i]);
	}
	}
}
