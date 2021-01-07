
//                     Write a program to find triplet of three number.

import java.util.Scanner;

public class tripletno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


       int a[]= {12,3,4,1,6,9};
		int sum=24;

		for(int i=0;i<a.length-2;i++)
		{
		for(int j=i+1;j<a.length-1;j++)
		{
		for(int k=j+1;j<a.length;k++)
		{

		if(a[i]+a[j]+a[k]==sum)
		{
		System.out.println("Triplet no. is "+ a[i] +","  +  a[j]+ "," +  a[k]);
		//break;
		} 

		else
		{
		System.out.println("Not triplet no.");
		}
	}
    }
}

	}

}
