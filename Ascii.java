import java.util.Scanner;
public class Ascii {
	public static void main(String[]args){
		char a[]=new char[52];
		for(int j=0,i=65;i<=90;i++,j++)
		{
			char x=(char)i;
			a[j]=x;
		}
		for(int j=26,i=97;i<=122;i++,j++)
		{
			char x=(char)i;
			a[j]=x;
		}
		for(int j=0;j<26;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println();
		for(int j=26;j<52;j++)
		{
			System.out.println(a[j]);
		}
	}

}
